/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snackcafe.main;

import snackcafe.factory.SnackFactory;
import snackcafe.model.Snack;
import java.util.Scanner;

/**
 * CafeApp - Aplikasi utama Cafe Snack
 */
public class CafeApp {
    
    private static final Scanner scanner = new Scanner(System.in);
    private static final SnackFactory factory = new SnackFactory();
    
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("   SELAMAT DATANG DI SNACK CAFE 🍽️");
        System.out.println("=====================================");
        
        while (true) {
            // Tampilkan menu
            factory.showMenu();
            
            // Minta input dari user
            System.out.print("Masukkan pesanan Anda (atau ketik 'exit' untuk keluar): ");
            String order = scanner.nextLine().trim();
            
            // Cek apakah user ingin keluar
            if (order.equalsIgnoreCase("exit") || 
                order.equalsIgnoreCase("quit") || 
                order.equalsIgnoreCase("keluar")) {
                System.out.println("\nTerima kasih telah berkunjung! 👋");
                break;
            }
            
            // Proses pesanan
            System.out.println("\n🔪 Memproses pesanan...");
            System.out.println("------------------------");
            
            Snack snack = factory.createSnack(order);
            
            if (snack != null) {
                snack.prepare();
                System.out.println("------------------------");
                snack.serve();
            } else {
                System.out.println("\n💡 Tips: Gunakan angka 1,2,3 atau kata kunci: fries, onion, nuggets");
            }
            
            System.out.println("\n------------------------");
            System.out.print("Tekan Enter untuk melanjutkan...");
            scanner.nextLine();
            
            // Clear screen sederhana
            for (int i = 0; i < 3; i++) System.out.println();
        }
        
        scanner.close();
    }
}