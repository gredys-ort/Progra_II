/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.P1GM;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Gredys Morales
 */
@Controller
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Entrando al controlador inicio de MVC");
        var msg = "Bienvenidos!!";
        var ini = "A continuacion se muestra la tabla de registro de vendedores de nuestra empresa. ";
        
        var Usuario1 = new Comisiones();
        Usuario1.setNombre("Gredys");
        Usuario1.setApellido("Morales");
        Usuario1.setEnero(54);
        Usuario1.setFebrero(84);
        Usuario1.setMarzo(47);
        
        var Usuario2 = new Comisiones();
        Usuario2.setNombre("Eliseo");
        Usuario2.setApellido("Ortiz");
        Usuario2.setEnero(82);
        Usuario2.setFebrero(39);
        Usuario2.setMarzo(50);
        
        var Usuario3 = new Comisiones();
        Usuario3.setNombre("Alejandra");
        Usuario3.setApellido("Cabrera");
        Usuario3.setEnero(24);
        Usuario3.setFebrero(57);
        Usuario3.setMarzo(69);
        
        var Usuario4 = new Comisiones();
        Usuario4.setNombre("Marlon");
        Usuario4.setApellido("Arteaga");
        Usuario4.setEnero(42);
        Usuario4.setFebrero(17);
        Usuario4.setMarzo(86);
        
        
        var Usuarios = Arrays.asList(Usuario1,Usuario2,Usuario3,Usuario4);
        model.addAttribute("msg", msg);
        model.addAttribute("ini", ini);
        model.addAttribute("Usuarios", Usuarios);
       
        return "Index";
    }
}
