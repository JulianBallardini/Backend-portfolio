package com.app.portfolio.Controller;

import com.app.portfolio.Model.Persona;
import com.app.portfolio.Service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona perso){
        
        interPersona.savePersona(perso);
        
        return "Se creo la persona exitosamente";
        
    }
    
    @DeleteMapping("/personas/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        
        return "La persona fue eliminada exitosamente";
    }
    
    @PutMapping ("/personas/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
            @RequestParam ("nombre") String nuevoNombre,
            @RequestParam ("apellido") String nuevoApellido,
            @RequestParam ("cnombre") String nuevoCNombre){
        
        Persona perso = interPersona.findPersona(id);
        
        perso.setFirstName(nuevoNombre);
        perso.setLastName(nuevoApellido);
        perso.setCompanyName(nuevoCNombre);
        
        return perso;
        
        
    }
    
    
}
