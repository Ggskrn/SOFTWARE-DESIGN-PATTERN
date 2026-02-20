/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
package snackcafe.model;

/**
 * Kelas Nuggets - Implementasi untuk menu chicken nuggets
 */
public class Nuggets implements Snack {
    
    @Override
    public void prepare() {
        System.out.println("🍗 Mengeluarkan nugget dari freezer...");
        System.out.println("🍗 Memanaskan minyak goreng...");
        System.out.println("🍗 Menggoreng hingga kecoklatan...");
        System.out.println("🍗 Meniriskan minyak berlebih...");
    }
    
    @Override
    public void serve() {
        System.out.println("✅ Menyajikan Chicken Nuggets dengan saus BBQ dan mayonaise!");
        System.out.println("   Selamat menikmati! 🍗✨");
    }
}