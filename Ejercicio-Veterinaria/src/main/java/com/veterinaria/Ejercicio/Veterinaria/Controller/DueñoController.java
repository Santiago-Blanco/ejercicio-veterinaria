package com.veterinaria.Ejercicio.Veterinaria.Controller;

import com.veterinaria.Ejercicio.Veterinaria.DTO.DueñoMascotaDTO;
import com.veterinaria.Ejercicio.Veterinaria.Model.Dueño;
import com.veterinaria.Ejercicio.Veterinaria.Service.DueñoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DueñoController {
    @Autowired
    DueñoService dueñoser;

    @PostMapping("/dueño/crear")
    public String crearDueño (@RequestBody Dueño dueño){
        dueñoser.saveDueño(dueño);
        return "Se ha creado a el dueño correctamente";
    }
    @GetMapping("/dueño/todos")
    public List<Dueño> getDueños(){
        return dueñoser.getDueños();
    }
    @DeleteMapping("/dueño/borrar/{id}")
    public String deleteDueño(@PathVariable Long id){
        dueñoser.deleteDueño(id);
        return "Se ha a borrado a el dueño correctamente";
    }
    @PutMapping("/dueño/editar")
    public String editDueño(@RequestBody Dueño dueño){
        dueñoser.editDueño(dueño);
        return "Los cambios se han guardado correctamente";
    }
}
