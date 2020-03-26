/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Function;

import project.Model.ModelProgram;

/**
 *
 * @author Abner
 */
public class ProgramLogic {
     ModelProgram modelProgram = new ModelProgram();
    
    public String result(String name, String born_date, String health,
            String gender){
        
        String noun = modelProgram.returnGenderNoun(gender);
        String health_Status = modelProgram.returnHealth(health);
        
        return "The Name Is " + name +
                ".\n" + noun + " is currently " + health_Status;
    }
    public String result(String name){
        return "The Name Is " + name + ".";
    }
    
    public String result(String name, String health){
        String health_status = modelProgram.returnHealth(health);
        
        return "The Name Is " + name + " \nis currently " + health_status + ".";
    }    
}

