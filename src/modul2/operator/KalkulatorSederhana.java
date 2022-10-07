/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2.operator;

import java.util.Scanner;

/**
 *
 * @author hajarhanifah
 */
public class KalkulatorSederhana {
    public static void main(String[] args){
        int operator1, operator2, penjumlahan, pengurangan, perkalian, pembagian;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Kalkulator sederhana");
        System.out.println("Masukkan nilai 1 : ");
        operator1 = input.nextInt();
        System.out.println("Masukkan nilai 2 : ");
        operator2 = input.nextInt();
        
        penjumlahan = operator1+operator2;
        pengurangan = operator1-operator2;
        pembagian = operator1/operator2;
        perkalian = operator1*operator2;
        
        System.out.println("_________________________");
        System.out.println("Hasil Penjumlahan : "+penjumlahan);
        System.out.println("Hasil Pengurangan : "+pengurangan);
        System.out.println("Hasil Perkalian : "+perkalian);
        System.out.println("Hasil Pembagian : "+pembagian);
    }
}
