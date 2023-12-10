package com.registro.usuarios.servicio;

import com.registro.usuarios.modelo.Moto;
import com.registro.usuarios.repositorio.MotoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author aleja
 */

@Service
public class MotoService {
    @Autowired
    private MotoRepositorio motoRepositorio;

    public List<Moto> obtenerTodasLasMotos() {
        return motoRepositorio.findAll();
    }

    public Moto obtenerMotoPorId(Long id) {
        return motoRepositorio.findById(id).orElse(null);
    }

    public void guardarMoto(Moto moto) {
        motoRepositorio.save(moto);
    }
}
