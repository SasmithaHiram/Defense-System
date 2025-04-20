/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense.system;

public class Starter {
    public static void main(String args[]){
        DefenseObservable defenseObservable = new DefenseObservable();
        defenseObservable.addDefenseObserver(new Helicopter());
        
        defenseObservable.addDefenseObserver(new Tank());
        defenseObservable.addDefenseObserver(new Submarine());
        
//        Strength  intialStrength = Strength.HIGH;
//        System.out.println("Initial Strength"+ intialStrength);
//        defenseObservable.sendStrengthSignal(intialStrength);
        
        defenseObservable.setVisible(true);
        
    }
}
