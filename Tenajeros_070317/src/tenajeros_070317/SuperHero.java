/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tenajeros_070317;

/**
 *
 * @author 3rd Year Account
 */
abstract class SuperHero {
    String superPowers[];
    SuperHero(){
        this.superPowers = new String [5];
        this.superPowers[0]= "1st superpower";
        
         
    }
    void setSuperPowers(String power, int element){
        this.superPowers[element] = power;
    }
    void setSuperPowers(String superPowers[]){
        this.superPowers=superPowers;
    }
    
    
    void printSuperPowers(){
        for (int i = 0; i < superPowers.length; i++){
            System.out.println(superPowers[i]);
        }
    }
    
    abstract void displayPower();
}
