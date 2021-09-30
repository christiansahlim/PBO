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
public abstract class Person implements CobaInterface {
    String name;
    String address;
    Date birthday;
    
    public Person() {
    }

    public Person(String name, String address, Date birthday) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }
    
    // method ini hanya ada di Parent, ketika dipanggil oleh Dosen atau Mahasiswa, maka akan mengacu kesini
    void hitungMethodTidakDiOverride() {
        System.out.println("INI METHOD DI PARENT YANG TIDAK DIOVERRIDE");
    }

    // method ini di-override oleh childnya, sehingga ketika dipanggil oleh Dosen atau Mahasiswa
    // maka tidak akan memanggil method ini, melainkan yang ada di Child Class masing-masing
    void hitungParentMethod() {
        System.out.println("INI OVERRIDE METHOD MILIK PARENT");
    }
    
    // Abstract method harus diimplementasi di setiap child nya.
    // Di Parent class hanya "di-daftarkan" saja
    abstract String hitungParentAbstractMethod();
    
    // method ini di-override juga oleh Child-nya
    @Override
    public String toString() {
        return name + " " + address + " " + birthday;
    }
    
    // method ini di-override dari CobaInterface1
    @Override
    public void printMethodCobaInterface1() {
        // do something here
    }
}
