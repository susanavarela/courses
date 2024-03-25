### CREAR CURSO
Metodo POST
```
/courses/create/courses 
```
``` json
{
    "name": "curso 4",
    "category": {
        "name": "Informatica"
    },
    "description": "Descripción del curso de redes",
    "link": "http://redes.com",
    "pdfs": [
        {
            "name": "redes_1.pdf"
        },
        {
            "name": "redes_2.pdf"
        }
    ]
}
```
***
***

#### RESPONSE 
> Retorna los datos del cusrso guardado
```json
{
    "name": "curso 4",
    "category": {
        "name": "Informatica"
    },
    "description": "Descripción del curso de redes",
    "link": "http://redes.com",
    "pdfs": [
        {
            "name": "redes_1.pdf"
        },
        {
            "name": "redes_2.pdf"
        }
    ]
}
```
* * *
### VER TODOS LOS CURSOS
Metodo POST
```
/courses
```
```json
[
    {
        "name": "curso 2",
        "category": {
            "name": "Informatica"
        },
        "description": "Descripción del curso de armado",
        "link": "http://arm.com",
        "pdfs": [
            {
                "name": "PDF_1_arm.pdf"
            },
            {
                "name": "PDF_2_arm.pdf"
            }
        ]
    },
    {
        "name": "curso 3",
        "category": {
            "name": "Informatica"
        },
        "description": "Descripción del curso de diseño",
        "link": "http://dis.com",
        "pdfs": [
            {
                "name": "PDF_1_dis.pdf"
            },
            {
                "name": "PDF_2_dis.pdf"
            }
        ]
    },
    {
        "name": "curso 4",
        "category": {
            "name": "Informatica"
        },
        "description": "Descripción del curso de redes",
        "link": "http://redes.com",
        "pdfs": [
            {
                "name": "redes_1.pdf"
            },
            {
                "name": "redes_2.pdf"
            }
        ]
    }
]
```
