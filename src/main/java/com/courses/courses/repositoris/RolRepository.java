package com.courses.courses.repositoris;

import com.courses.courses.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
}
