/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sources;

/**
 *
 * @author User
 */
class Fat extends OrganicNutrition{
    private double quantity;

    public Fat(double quantity) {
        this.quantity = quantity;
    }
    
    public double calcEnergy(){
        return quantity * EnergySource.fatCaloriesPerGram;
    }
    
    public double getQuantity(){
        return this.quantity;
    }
}
