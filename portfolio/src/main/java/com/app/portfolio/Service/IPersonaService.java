
package com.app.portfolio.Service;

import com.app.portfolio.Model.Persona;

public interface IPersonaService {
    
    public void savePersona(Persona perso);
            
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
    
}
