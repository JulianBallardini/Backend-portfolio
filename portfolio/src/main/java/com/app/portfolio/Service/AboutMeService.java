
package com.app.portfolio.Service;

import com.app.portfolio.Model.AboutMe;
import com.app.portfolio.Repository.AboutMeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutMeService implements IAboutMeService{
    
    @Autowired
    private AboutMeRepository aboutRepository;

    @Override
    public void saveAbout(AboutMe ab) {
        aboutRepository.save(ab);
    }

    @Override
    public void deleteAbout(Long id) {
        aboutRepository.deleteById(id);
    }

    @Override
    public AboutMe findText(Long id) {
        AboutMe ab = aboutRepository.findById(id).orElse(null);
        
        return ab;
    }
    
   
    
}
