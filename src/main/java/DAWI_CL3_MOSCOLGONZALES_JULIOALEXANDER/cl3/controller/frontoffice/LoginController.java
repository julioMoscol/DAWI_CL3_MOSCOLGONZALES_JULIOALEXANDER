package DAWI_CL3_MOSCOLGONZALES_JULIOALEXANDER.cl3.controller.frontoffice;

import DAWI_CL3_MOSCOLGONZALES_JULIOALEXANDER.cl3.model.bd.Usuario;
import DAWI_CL3_MOSCOLGONZALES_JULIOALEXANDER.cl3.service.DetalleUsuarioService;
import DAWI_CL3_MOSCOLGONZALES_JULIOALEXANDER.cl3.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/auth")
public class LoginController {
    private UsuarioService usuarioService;
    private DetalleUsuarioService detalleUsuarioService;
    @GetMapping("/login")
    public String login(){
        return "frontoffice/auth/login";
    }
    @GetMapping("/registrar")
    public String registro(){
        return "frontoffice/auth/registro";
    }
    @PostMapping("/guardarusuario")
    public String guardarUsuario(@ModelAttribute Usuario usuario){
        usuarioService.saveUser(usuario);
        return "frontoffice/auth/login";
    }

    @GetMapping("/cambiarcontrasena")
    public String cambiarcontrasena(){
        return "frontoffice/auth/cambiarcontrasena";
    }

    @PostMapping("/contrasenacambiada")
    public String contrasenacambiada(){


        return "frontoffice/auth/dashboard";
    }
    @GetMapping("/login-success")
    public String loginsuccess(@ModelAttribute Usuario usuario){
        return "frontoffice/auth/dashboard";
    }
}
