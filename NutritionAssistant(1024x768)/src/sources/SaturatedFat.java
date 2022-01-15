/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sources;

/**
 *
 * @author User
 */
public class SaturatedFat extends Fat{
    private double quantity;

    public SaturatedFat(double quant) {
        super(quant);
        this.quantity = quant;
    }
    
    public double calcEnergy(){
        return quantity * EnergySource.fatCaloriesPerGram;
    }
    
    public double getQuantity(){
        return this.quantity;
    }
}
