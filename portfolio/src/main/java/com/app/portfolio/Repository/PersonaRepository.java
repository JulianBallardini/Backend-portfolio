
package com.app.portfolio.Repository;

import com.app.portfolio.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository < Persona, Long> {
    
}
