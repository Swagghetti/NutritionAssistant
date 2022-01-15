/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sources;

/**
 *
 * @author User
 */
public class User {
    private int age;
    private double weight;
    private int height;
    private boolean gender; //true male, false female

    public User(int age, double weight, int height, boolean gender) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }
    
    public double calcDailyCalorieNeed(){
        if(gender)
            return 1.5 * (10 * weight + 6.25 * height - 5 * age + 5);
        else
            return 1.5 * (10 * weight + 6.25 * height - 5 * age - 161);
    }
    
    public double calcDailyProteinNeed(){
        return this.calcDailyCalorieNeed() / 5;
    }
    
    public double calcDailyCarbNeed(){
        return this.calcDailyCalorieNeed() / 100 * 55;
    }
    
    public double calcDailyFatNeed(){
        return this.calcDailyCalorieNeed() / 4;
    }
    
    public double calcDailyFibreNeed(){
        if(gender)
            return 34.0;
        else
            return 23.0;
    }
    public boolean getGender(){
        return this.gender;
    }

    
}
