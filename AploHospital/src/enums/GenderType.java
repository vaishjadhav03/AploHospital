/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author HP
 */
public enum GenderType {
    male(1),

    /**
     *
     */
    female(2);
    final int state;
    
    GenderType(int state){
        this.state = state;
    }
    
}
