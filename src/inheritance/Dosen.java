/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Date;

/**
 *
 * @author hanschristian
 */
public class Dosen extends Person implements CobaInterface3 {
    String NIK;
    int gaji;
    
    public Dosen() {
    }
    
    public Dosen(String name, String address, Date birthday) {
        super(name, address, birthday);
    }
    
    // method ini meng-override  method yang sama di Parent 
    @Override
    void hitungParentMethod() {
        System.out.println("INI OVERRIDE METHOD MILIK DOSEN");
    }

    // method ini mengimplement method Abstract yang di-daftarkan di parent
    @Override
    String hitungParentAbstractMethod() {
        return "ABSTRACT IMPLEMENTATION DI DOSEN";
    }

    // kita dapat memanggil implementasi method toString milik parent menggunakan syntax Super.namaMethod()
    @Override
    public String toString() {
        return super.toString() + " " +  NIK + " " + gaji;
    }

    // mengimplement method CobaInterface1, ini dapat saja dihapus apabila sudah ada di Parent 
    // dan tidak butuh implementasi spesifik untuk setiap child
    @Override
    public void printMethodCobaInterface1() {
        System.out.println("PRINT GENERAL FROM DOSEN");
    }

    @Override
    public void hitungInterface3() {
       // ubah logic nya
    }
}