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
 * Kelas OnionRings - Implementasi untuk menu onion rings
 */
public class OnionRings implements Snack {
    
    @Override
    public void prepare() {
        System.out.println("🧅 Memotong bawang bombay...");
        System.out.println("🧅 Membaluri dengan tepung bumbu...");
        System.out.println("🧅 Mencelupkan ke dalam adonan...");
        System.out.println("🧅 Menggoreng hingga renyah...");
    }
    
    @Override
    public void serve() {
        System.out.println("✅ Menyajikan Onion Rings dengan saus keju dan BBQ!");
        System.out.println("   Selamat menikmati! 🧅✨");
    }
}