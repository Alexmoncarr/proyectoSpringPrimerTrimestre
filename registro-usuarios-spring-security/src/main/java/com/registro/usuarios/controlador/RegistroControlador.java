package com.registro.usuarios.controlador;

import com.registro.usuarios.modelo.Moto;
import com.registro.usuarios.repositorio.MotoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.registro.usuarios.servicio.UsuarioServicio;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 
 * @author aleja
 */

@Controller
public class RegistroControlador {

    @Autowired
    private MotoRepositorio motoRepositorio;

    @Autowired
    private UsuarioServicio servicio;

    @GetMapping("/login")
    public String iniciarSesion() {
        return "login";
    }

    @GetMapping("/")
    public String verPaginaDeInicio(Model modelo) {
        modelo.addAttribute("usuarios", servicio.listarUsuarios());
        return "index";
    }

    @GetMapping("/formularioMoto")
    public String mostrarFormularioMoto(Model model) {
        model.addAttribute("nuevaMoto", new Moto());
        return "formularioMoto";
    }

    @PostMapping("/tienda/nueva-moto")
    public String guardarNuevaMoto(@ModelAttribute("nuevaMoto") @Valid Moto nuevaMoto,
                               BindingResult bindingResult) {
         if (bindingResult.hasErrors()) {
        
        return "formulario-moto";
    }
        motoRepositorio.save(nuevaMoto);
        return "redirect:/tienda";
    }

}
