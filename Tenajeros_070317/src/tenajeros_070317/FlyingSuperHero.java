/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tenajeros_070317;

/**
 *
 * @author 3rd Year Account
 * @param
 * This method does not have a parameter
 * @return
 * this method does not return any value
 */
class FlyingSuperHero extends SuperHero {
    @Override
    void displayPower(){
        System.out.println("Fly...");
    }
    void setSP(String superPowers[]){
        super.setSuperPowers(superPowers);
    }
  
}
