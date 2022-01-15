/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sources;

/**
 *
 * @author User
 */
public interface EnergySource {
    int proteinCaloriesPerGram = 4;
    int carbCaloriesPerGram = 4;
    int fatCaloriesPerGram = 9;
    
    double calcEnergy();
}
