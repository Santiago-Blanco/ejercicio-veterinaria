package com.veterinaria.Ejercicio.Veterinaria.Repository;

import com.veterinaria.Ejercicio.Veterinaria.Model.Dueño;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iDueñoRepository extends JpaRepository<Dueño, Long> {
}
