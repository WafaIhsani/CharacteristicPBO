/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoh2;

/**
 *
 * @author USER
 */
public abstract class Hewan {
    private String jenis;

    public Hewan(String jenis) {
        this.jenis = jenis;
    }

    public abstract void bersuara();  
    
// Method untuk menampilkan jenis hewan
    public void tampilkanJenis() {
        System.out.println("Jenis hewan ini adalah: " + jenis);
    }
}
