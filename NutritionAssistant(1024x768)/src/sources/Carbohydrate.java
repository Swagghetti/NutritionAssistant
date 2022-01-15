/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sources;

/**
 *
 * @author User
 */
class Carbohydrate extends OrganicNutrition{
    private double quantity;

    public Carbohydrate(double quantity) {
        this.quantity = quantity;
    }
    
    public double calcEnergy(){
        return quantity * EnergySource.proteinCaloriesPerGram;
    }
    
    public double getQuantity(){
        return this.quantity;
    }
    
}
