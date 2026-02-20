/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snackcafe.model;

/**
 * Kelas FrenchFries - Implementasi untuk menu kentang goreng
 */
public class FrenchFries implements Snack {
    
    @Override
    public void prepare() {
        System.out.println("🍟 Memotong kentang segar...");
        System.out.println("🍟 Merendam dalam air dingin...");
        System.out.println("🍟 Menggoreng hingga keemasan...");
        System.out.println("🍟 Menaburkan garam dan bumbu...");
    }
    
    @Override
    public void serve() {
        System.out.println("✅ Menyajikan French Fries dengan saus sambal dan mayonaise!");
        System.out.println("   Selamat menikmati! 🍟✨");
    }
}