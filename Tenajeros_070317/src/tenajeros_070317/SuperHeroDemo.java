/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tenajeros_070317;

/**
 *
 * @author 3rd Year Account
 */
public class SuperHeroDemo {
        public static void main(String[] args) {
            FlyingSuperHero fsh = new FlyingSuperHero();       
           // fsh.displayPower();
           // Spiderman sm = new Spiderman();
           // sm.displayPower();
            fsh.setSuperPowers("new power", 2);
            fsh.printSuperPowers();
    }
}
