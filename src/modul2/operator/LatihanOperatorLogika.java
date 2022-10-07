/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2.operator;

/**
 *
 * @author hajarhanifah
 */
public class LatihanOperatorLogika {
    public static void main(String[] args){
        boolean A = true; 
        boolean B = false;
        
        boolean operatorAnd = A&&B;         // A and B
        boolean operatorOr = A || B ;       // A or B
        boolean notA = !A ;                 // not A
        boolean notB = !B;                  // not B
        
        // Tampilkan hasil
        System.out.println(A+" AND "+B+ " => "+operatorAnd);
        System.out.println(A+" OR "+B+ " => "+operatorOr);
        System.out.println("NOT "+A+ " => "+notA);
        System.out.println(" NOT "+B+ " => "+notB);
    }
}
