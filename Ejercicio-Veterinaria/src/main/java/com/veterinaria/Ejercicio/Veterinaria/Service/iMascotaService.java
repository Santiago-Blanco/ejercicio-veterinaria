package com.veterinaria.Ejercicio.Veterinaria.Service;

import com.veterinaria.Ejercicio.Veterinaria.DTO.DueñoMascotaDTO;
import com.veterinaria.Ejercicio.Veterinaria.Model.Mascota;

import java.util.List;

public interface iMascotaService {
    public void saveMascota(Mascota masco);
    public List<Mascota> getMascotas();
    public void deleteMascota(Long id);
    public void editMascota(Mascota mascota);
    public List<Mascota> getCaniches();
    public List<DueñoMascotaDTO> dueñosYmascotas();
}
