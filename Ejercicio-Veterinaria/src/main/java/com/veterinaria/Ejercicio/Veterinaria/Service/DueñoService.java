package com.veterinaria.Ejercicio.Veterinaria.Service;

import com.veterinaria.Ejercicio.Veterinaria.DTO.DueñoMascotaDTO;
import com.veterinaria.Ejercicio.Veterinaria.Model.Dueño;
import com.veterinaria.Ejercicio.Veterinaria.Repository.iDueñoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DueñoService implements iDueñoService{
    @Autowired
    iDueñoRepository dueñorepo;
    @Override
    public void saveDueño(Dueño dueño) {
        dueñorepo.save(dueño);
    }

    @Override
    public List<Dueño> getDueños() {
        List<Dueño> listaDueños = dueñorepo.findAll();
        return listaDueños;
    }

    @Override
    public void deleteDueño(Long id) {
        dueñorepo.deleteById(id);
    }

    @Override
    public void editDueño(Dueño dueño) {
        this.saveDueño(dueño);
    }

}
