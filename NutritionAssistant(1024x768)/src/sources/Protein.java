/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sources;

/**
 *
 * @author User
 */
public class Protein extends OrganicNutrition{
    private double quantity;

    public Protein(double quantity) {
        this.quantity = quantity;
    }
    
    public double calcEnergy(){
        return quantity * EnergySource.proteinCaloriesPerGram;
    }
    
    public double getQuantity(){
        return this.quantity;
    }
    
}
