package com.registro.usuarios.repositorio;

import com.registro.usuarios.modelo.Moto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author aleja
 */

@Repository
public interface MotoRepositorio extends JpaRepository<Moto, Long> {
    // Puedes agregar métodos adicionales según sea necesario
}
