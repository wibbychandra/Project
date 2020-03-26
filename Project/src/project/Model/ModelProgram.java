/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Model;

/**
 *
 * @author Abner
 */
public class ModelProgram {
    public String label = "Please Put Your Information To Get The Result";
    
    public String returnGenderNoun(String gender){
        String noun = "He";
   
        if(gender.toLowerCase().equals("female")){
            noun = "She";
        }
        
        return noun;
    }
    
    public String returnHealth(String mental){
        switch(health){
            case "Demam,Batuk,Nafas Taknormal,Dahak Kental,Lemas,Sinar X":
                return "Virus Corona";
            case "Demam,Batuk,Hidung Meler,Bersin,Muntah,Diare,Otot Nyeri":
                return "Influenza";
            default:
                return "Flu Biasa";
        }
    }
}

        
    
       
    


