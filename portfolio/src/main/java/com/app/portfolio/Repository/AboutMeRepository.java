
package com.app.portfolio.Repository;

import com.app.portfolio.Model.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutMeRepository extends JpaRepository <AboutMe, Long>{
    
}
