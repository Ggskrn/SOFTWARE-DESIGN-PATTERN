/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
package snackcafe.factory;

import snackcafe.model.*;

/**
 * SnackFactory - Factory class untuk membuat objek snack
 */
public class SnackFactory {
    
    public Snack createSnack(String type) {
        if (type == null || type.trim().isEmpty()) {
            System.out.println("❌ Error: Tipe snack tidak boleh kosong!");
            return null;
        }
        
        String lowerType = type.toLowerCase().trim();
        
        switch (lowerType) {
            case "fries":
            case "french fries":
            case "kentang goreng":
            case "1":
                return new FrenchFries();
                
            case "onion":
            case "onion rings":
            case "bawang goreng":
            case "2":
                return new OnionRings();
                
            case "nuggets":
            case "chicken nuggets":
            case "nugget":
            case "3":
                return new Nuggets();
                
            default:
                System.out.println("❌ Error: Snack '" + type + "' tidak tersedia di menu!");
                System.out.println("   Menu yang tersedia: French Fries, Onion Rings, Nuggets");
                return null;
        }
    }
    
    public void showMenu() {
        System.out.println("\n📋 ===== MENU SNACK CAFE =====");
        System.out.println("1. French Fries   (fries)");
        System.out.println("2. Onion Rings    (onion)");
        System.out.println("3. Chicken Nuggets (nuggets)");
        System.out.println("==============================\n");
    }
}