/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2.operator;

/**
 *
 * @author hajarhanifah
 */
public class OperatorAritmatika {
    public static void main (String[] args){
        int A = 100, B = 30;
        
        int jumlah = A+B;               // operasi penjumlahan
        int kurang = A-B;               // operasi pengurangan
        int kali = A*B;                 // operasi perkalian
        float bagi = (float) A/B;       // operasi pembagian
        int modulo = A%B;               // Mod
        
        // tampilkan hasil
        System.out.println("Penjumlahan "+A+" + "+B+" : " +jumlah);
        System.out.println("Pengurangan "+A+" - "+B+" : " +kurang);
        System.out.println("Perkalian "+A+" x "+B+" : " +kali);
        System.out.println("Pembagian "+A+" / "+B+" : " +bagi);
        System.out.println("Mod "+A+" mod "+B+" : " +modulo);
    }
    
}
