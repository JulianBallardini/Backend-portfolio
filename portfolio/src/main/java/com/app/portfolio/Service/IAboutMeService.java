
package com.app.portfolio.Service;

import com.app.portfolio.Model.AboutMe;


public interface IAboutMeService {
    
    public void saveAbout(AboutMe ab);
    
    public void deleteAbout(Long id);
    
    public AboutMe findText(Long id);
    
}
