/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hanschristian
 */
public class Main {
    public static void main(String[] args) {
        // Inheritance
        Dosen dosen1 = new Dosen();
        dosen1.NIK = "123";
        dosen1.name = "Joan";
        dosen1.hitungParentMethod();// print 500
        dosen1.hitungMethodTidakDiOverride();
        System.out.println("TO STRING " + dosen1.toString());
        
        Mahasiswa mhs1 = new Mahasiswa("1112016", "IF", "Parentnya Hans", "Jalan XYZ", new Date(), "Childnya Budi");
        mhs1.printDataMahasiswa();
        mhs1.hitungParentMethod(); // print 1000
        mhs1.hitungIPK();
        mhs1.hitungMethodTidakDiOverride();
        System.out.println("TO STRING " + mhs1.toString());
        
        AdministrasiMahasiswa admin = new AdministrasiMahasiswa();
        
        DosenHonorer honorer = new DosenHonorer();
        honorer.name = "Densel";
        honorer.gaji = 5000;
        honorer.tempatKerja = "rumah";
        
        // Polymorphism
        // Casting dapat dilakukan dari Parent ke Child atau Child ke Parent
        // dalam contoh ini, casting dari Dosen ke Mahasiswa akan mengakibatkan error
        Person p1 = new Dosen();
        Dosen dosen = (Dosen) p1;
        System.out.println(dosen.gaji);
        ((Dosen) p1).gaji = 5000;
        System.out.println(p1.name);
        System.out.println(((Dosen) p1).gaji);
        p1.hitungParentMethod();
        
        // Kita dapat set type Parent nya dalam sebuah Collections
        // Sehingga collections tsb dapat menerima input berupa semua objek parent & child nya
        ArrayList<Dosen> listDosen = new ArrayList<>();
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        
        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(dosen1);
        listPerson.add(mhs1);
        listPerson.add(honorer);
        
        for (int i = 0; i < listPerson.size(); i++) {
            Person p = listPerson.get(i);
            System.out.println(p.name);
            
            // dilakukan pengecekan terlebih dahulu sebelum di-casting
            if(p instanceof DosenHonorer) {
                DosenHonorer dh = (DosenHonorer) p;
                System.out.println(dh.tempatKerja);
            } else if(p instanceof Dosen) {
                Dosen d = (Dosen) p; // casting
                System.out.println(d.gaji);
            } else if(p instanceof Mahasiswa) {
                Mahasiswa m = (Mahasiswa) p;
                System.out.println(m.jurusan);
            }
        }
        
        //Interface
        // contoh buruk
        AdministrasiMahasiswa admin1 = null;
        cobaInterfaceGeneralMethod(dosen1, admin1);
        cobaInterfaceGeneralMethod(null, admin);
        cobaInterfaceGeneralMethod(mhs1, null);
        
        // contoh baik dengan menggunakan Interface
        cobaInterfaceGeneralMethod(dosen1);
        cobaInterfaceGeneralMethod(admin);
        
        ArrayList<CobaInterface> listInterface = new ArrayList<>();
        listInterface.add(mhs1);
        listInterface.add(admin1);
    }
    
    // contoh buruk dalam memanfaatkan Interface
    static void cobaInterfaceGeneralMethod(Person person, AdministrasiMahasiswa administrasi) {
        if(person == null) {
            System.out.println(administrasi);
        } else if (administrasi == null) {
            System.out.println(person);
        }
    }
    
    // contoh lebih baik dalam memanfaatkan Interface
    // method ini dapat menerima semua objek yang sudah implement CobaInterface
    static void cobaInterfaceGeneralMethod(CobaInterface data) {
        data.printMethodCobaInterface1();
        if(data instanceof Dosen) {
            System.out.println("DOSEN INTERFACE : " + ((Dosen) data).gaji);
        } else if(data instanceof AdministrasiMahasiswa) {
            
        }
    }
}