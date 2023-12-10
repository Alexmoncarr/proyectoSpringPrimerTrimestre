/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.registro.usuarios.controlador;

import com.registro.usuarios.modelo.Moto;
import com.registro.usuarios.servicio.MotoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author aleja
 */
@Controller
@RequestMapping("/tienda")
public class RegistroTiendaController {

    @Autowired
    private MotoService motoService;

    @GetMapping
    public String mostrarTienda(Model model) {

        List<Moto> motos = motoService.obtenerTodasLasMotos();

        model.addAttribute("motos", motos);
        return "tienda";
    }

}
