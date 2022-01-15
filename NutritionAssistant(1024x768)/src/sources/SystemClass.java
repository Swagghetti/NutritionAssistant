/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sources;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SystemClass {
    public static ArrayList<Food> list = new ArrayList<>();
    public static User user;
    
    public static void addFood(Food temp){
        list.add(temp);
    }

    public static void setUser(User user){
        SystemClass.user = user;
    }
    
    public static double calcTotalEnergy(){
        double total = 0;
        for(int i = 0; i < SystemClass.list.size(); i++){
            total += list.get(i).getCalories();
        }
        return total;
    }
    public static double calcTotalProteinEnergy(){
        double total = 0;
        for(int i = 0; i < SystemClass.list.size(); i++){
            total += list.get(i).getProtein().calcEnergy();
        }
        return total;
    }
    
    public static double calcTotalCarbEnergy(){
        double total = 0;
        for(int i = 0; i < SystemClass.list.size(); i++){
            total += list.get(i).getCarbohydrate().calcEnergy();
        }
        return total;
    }
    
    public static double calcTotalFatEnergy(){
        double total = 0;
        for(int i = 0; i < SystemClass.list.size(); i++){
            total += list.get(i).getFat().calcEnergy();
        }
        return total;
    }
    
    public static double calcTotalSaturatedFatEnergy(){
        double total = 0;
        for(int i = 0; i < SystemClass.list.size(); i++){
            total += list.get(i).getSaturatedFat().calcEnergy();
        }
        return total;
    }
    
    public static double getTotalFibre(){
        double total = 0;
        for(int i = 0; i < SystemClass.list.size(); i++){
            total += list.get(i).getFibre().getQuantity();
        }
        return total;
    }
    
    public static double getTotalSalt(){
        double total = 0;
        for(int i = 0; i < SystemClass.list.size(); i++){
            total += list.get(i).getSalt().getQuantity();
        }
        return total;
    }
    public static Food getHighestCalorieFood(){
        Food max = new Food("", 0, 0, new Protein(0), new Carbohydrate(0), new Fat(0), new SaturatedFat(0), new Salt(0), new Fibre(0));
        for(int i = 0; i < SystemClass.list.size(); i++){
            if(list.get(i).getCalories() > max.getCalories())
                max = list.get(i);
        }
        return max;
    }
    
}
