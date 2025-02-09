package com.veterinaria.Ejercicio.Veterinaria.Service;

import com.veterinaria.Ejercicio.Veterinaria.DTO.DueñoMascotaDTO;
import com.veterinaria.Ejercicio.Veterinaria.Model.Dueño;

import java.util.List;

public interface iDueñoService {
    public void saveDueño(Dueño dueño);
    public List<Dueño> getDueños();
    public void deleteDueño(Long id);
    public void editDueño(Dueño dueño);
}
