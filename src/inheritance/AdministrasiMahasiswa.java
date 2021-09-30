/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author hanschristian
 */
// 1 class dapat mengimplement banyak Interfaces
public class AdministrasiMahasiswa implements CobaInterface, CobaInterface2 {
    String SKS;
    String kamar;
    String komputer;

    // method implement dari CobaInterface1
    @Override
    public void printMethodCobaInterface1() {
        double total = X * Y + PHI;
        System.out.println("PRINT GENERAL FROM ADMINISTRASI " + total);
    }

    // method implement dari CobaInterface2
    @Override
    public void printMethodCobaInterface2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
