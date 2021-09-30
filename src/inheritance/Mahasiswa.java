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
public class Mahasiswa extends Person {
    String NIM;
    String jurusan;
    String name;

    public Mahasiswa(String NIM, String jurusan, String name, String address, Date birthday, String name2) {
        super(name, address, birthday);
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.name = name2;
    }
    
    // method ini hanya ada di class Mahasiswa
    void printDataMahasiswa() {
        System.out.println("NAMA PARENT : " + super.name);
        System.out.println("NAMA CHILD : "  + this.name);
    }
    
    // method ini hanya ada di class Mahasiswa
    void hitungIPK() {
        System.out.println("HITUNG IPK : " + 4.00);
    }
    
    // method ini di-override dari method sama di Parent-nya
    // method ini tidak wajib di-implement disini, hanya bila perlu saja
    @Override
    void hitungParentMethod() {
        System.out.println("INI OVERRIDE METHOD MILIK MAHASISWA");
    }

    // method ini di-override dari Abstract method di Parent-nya
    // method ini harus diimplement disini karena di Parent nya hanya berupa Abstract.
    @Override
    String hitungParentAbstractMethod() {
        return "ABSTRACT IMPLEMENTATION DI MAHASISWA";
    }
    
    // kita dapat memanggil implementasi method toString milik parent menggunakan syntax Super.namaMethod()
    @Override
    public String toString() {
        return super.name + " " + super.address + " " + super.birthday + " " +  NIM + " " + jurusan;
    }

    @Override
    public void printMethodCobaInterface1() {
        // do something here
    }
}
