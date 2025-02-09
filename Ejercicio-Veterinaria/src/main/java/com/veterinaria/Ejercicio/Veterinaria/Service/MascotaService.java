package com.veterinaria.Ejercicio.Veterinaria.Service;

import com.veterinaria.Ejercicio.Veterinaria.DTO.DueñoMascotaDTO;
import com.veterinaria.Ejercicio.Veterinaria.Model.Mascota;
import com.veterinaria.Ejercicio.Veterinaria.Repository.iMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements iMascotaService{
    @Autowired
    iMascotaRepository mascotarepo;
    @Override
    public void saveMascota(Mascota masco) {
        mascotarepo.save(masco);
    }

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = mascotarepo.findAll();
        return listaMascotas;
    }

    @Override
    public void deleteMascota(Long id) {
        mascotarepo.deleteById(id);
    }

    @Override
    public void editMascota(Mascota mascota) {
        this.saveMascota(mascota);
    }

    @Override
    public List<Mascota> getCaniches() {
        List<Mascota> listaMascotas = mascotarepo.findAll();
        List<Mascota> caniches = new ArrayList<>();
        System.out.println("LISTA MASCOTAS: "+ listaMascotas);
        for (Mascota masco: listaMascotas){
            if (masco.getEspecie().equals("Perro") && masco.getRaza().equals("Caniche")){
                caniches.add(masco);
            }
        }
        return caniches;
    }

    @Override
    public List<DueñoMascotaDTO> dueñosYmascotas() {
        List<DueñoMascotaDTO> lista = new ArrayList<>();
        List<Mascota> listaMascota = mascotarepo.findAll();

        for (Mascota masco: listaMascota){
            DueñoMascotaDTO obj = new DueñoMascotaDTO();

            obj.setNombre_mascota(masco.getNombre());
            obj.setRaza(masco.getRaza());
            obj.setEspecie(masco.getEspecie());
            obj.setNombre_dueño(masco.getDueño().getNombre());
            obj.setApellido_dueño(masco.getDueño().getApellido());

            lista.add(obj);
        }
        return lista;
    }
}
