/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sources;

/**
 *
 * @author User
 */
public class Salt {
    private double quantity;
    public static final double MAX_DAILY_SALT_GRAMS = 6;

    public Salt(double quantity) {
        this.quantity = quantity;
    }
    
    public double getQuantity(){
        return this.quantity;
    }
}
