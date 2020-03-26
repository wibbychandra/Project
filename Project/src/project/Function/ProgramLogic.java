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
public class ProgramLogic extends ModelProgram{
     ModelProgram modelProgram = new ModelProgram();
    
    public String result(String born_date, String health,
            String gender, ModelProgram mp){
        
        String noun = modelProgram.returnGenderNoun(gender);
        String health_Status = modelProgram.returnHealth(health);
        
        return "The Name Is " +mp.getName()+
                ".\n" + noun + " is currently " + health_Status;
    }
    public String result(ModelProgram mp){
        return "The Name Is " +mp.getName()+ ".";
    }
    
    public String result(ModelProgram mp, String health){
        String health_status = modelProgram.returnHealth(health);
        
        return "The Name Is " +mp.getName()+ " \nis currently "
                + health_status + ".";
    }    
}

