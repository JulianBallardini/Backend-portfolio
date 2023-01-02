
package com.app.portfolio.Controller;

import com.app.portfolio.Model.AboutMe;
import com.app.portfolio.Service.IAboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AboutMeController {
    
    @Autowired
    private IAboutMeService interAbout;
    
    @PostMapping("/about/crear")
    public String createAbout(@RequestBody AboutMe ab){
        
        interAbout.saveAbout(ab);
        
        return "Se guardó el texto exitosamente";
        
    }
    
    @DeleteMapping("/about/eliminar/{id}")
    public String eliminarAbout(@PathVariable Long id){
        interAbout.deleteAbout(id);
        
        return "El texto fue eliminado exitosamente";
    }
    
    @PutMapping ("/about/editar/{id}")
    public AboutMe editarAbout(@PathVariable Long id,
            @RequestParam ("titulo") String nuevoTitulo,
            @RequestParam ("texto") String nuevoTexto){
        
        AboutMe ab = interAbout.findText(id);
        
        ab.setAboutMeTitle(nuevoTitulo);
        ab.setAboutMeText(nuevoTexto);
        
        return ab;
        
        
    }
    
    
    
}
