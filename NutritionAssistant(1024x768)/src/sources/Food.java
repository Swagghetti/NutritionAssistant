/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sources;

/**
 *
 * @author User
 */
public class Food {
    private String title;
    private double totalGrams;
    private double calories;
    private Protein proteinPresence;
    private Carbohydrate carbPresence;
    private Fat fatPresence;
    private SaturatedFat saturatedPresence;
    private Salt saltPresence;
    private Fibre fibrePresence;

    public Food(String title, double totalGrams, double calories, Protein proteinPresence, Carbohydrate carbPresence, Fat fatPresence, SaturatedFat saturatedPresence, Salt saltPresence, Fibre fibrePresence) {
        this.title = title;
        this.totalGrams = totalGrams;
        this.calories = calories;
        this.proteinPresence = proteinPresence;
        this.carbPresence = carbPresence;
        this.fatPresence = fatPresence;
        this.saturatedPresence = saturatedPresence;
        this.saltPresence = saltPresence;
        this.fibrePresence = fibrePresence;
    }
    public String getTitle(){
        return this.title;
    }
    public double getCalories(){
        return calories;
    }
    
    public double calcEnergy(){
        return this.proteinPresence.getQuantity() * 4 + this.carbPresence.getQuantity() * 4 + this.fatPresence.getQuantity() * 9; 
    }
    
    public Protein getProtein(){
        return this.proteinPresence;
    }
    
    public Carbohydrate getCarbohydrate(){
        return this.carbPresence;
    }
    
    public Fat getFat(){
        return this.fatPresence;
    }
    
    public SaturatedFat getSaturatedFat(){
        return this.saturatedPresence;
    }
    
    public Fibre getFibre(){
        return this.fibrePresence;
    }
    
    public Salt getSalt(){
        return this.saltPresence;
    }
    
}
