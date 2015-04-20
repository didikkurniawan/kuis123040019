/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quiz123040019;

/**
 *
 * @author SB 604-11
 */
public class Soal {

    public int pangkat(int bil, int pangkat) {
        int hasil = 0;
        int n = 1;
        while (n <= pangkat) {
            n++;
            hasil *= bil;
        }
        return hasil;
    }
    public int perkalian(int bilA, int bilB, int bilC){
        return bilA * bilB * bilC;
     
    }
}
