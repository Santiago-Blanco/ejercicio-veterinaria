package com.veterinaria.Ejercicio.Veterinaria.Repository;

import com.veterinaria.Ejercicio.Veterinaria.Model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iMascotaRepository extends JpaRepository<Mascota, Long> {
}
