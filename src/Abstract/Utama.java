/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

import Contoh2.Anjing;
import Contoh2.Kucing;

/**
 *
 * @author USER
 */
public class Utama {
    public static void main(String[] args) {
        // Membuat objek Anjing
        Anjing anjing = new Anjing();
        anjing.tampilkanJenis();  
        anjing.bersuara();        

        // Membuat objek Kucing
        Kucing kucing = new Kucing();
        kucing.tampilkanJenis();  
        kucing.bersuara();        
    }
}
