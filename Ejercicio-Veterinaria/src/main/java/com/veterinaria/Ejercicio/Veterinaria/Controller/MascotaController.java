package com.veterinaria.Ejercicio.Veterinaria.Controller;

import com.veterinaria.Ejercicio.Veterinaria.DTO.DueñoMascotaDTO;
import com.veterinaria.Ejercicio.Veterinaria.Model.Mascota;
import com.veterinaria.Ejercicio.Veterinaria.Service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {
    @Autowired
    MascotaService mascotaser;

    @PostMapping("/mascota/crear")
    public String saveMascota(@RequestBody Mascota masco){
        mascotaser.saveMascota(masco);
        return "Se ha creado la mascota correctamente";
    }
    @GetMapping("/mascota/todos")
    public List<Mascota> getMascotas (){
        return mascotaser.getMascotas();
    }
    @DeleteMapping("/mascota/borrar/{id}")
    public String deleteMascota (@PathVariable Long id){
        mascotaser.deleteMascota(id);
        return "Se ha borrado a la mascota corretamente";
    }
    @PutMapping("/mascota/editar")
    public String editMascota(@RequestBody Mascota masco){
        mascotaser.editMascota(masco);
        return "Se ha editado a la mascota correctamente";
    }
    @GetMapping("/mascota/perros/caniche")
    public List<Mascota> canichess(){
        return mascotaser.getCaniches();
    }
    @GetMapping("/dueñoYmascotas")
    public List<DueñoMascotaDTO> dueñoYmascota(){
        return mascotaser.dueñosYmascotas();
    }
}
