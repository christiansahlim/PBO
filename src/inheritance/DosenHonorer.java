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
public class DosenHonorer extends Dosen {
    String tempatKerja;
    
    // ketika memanggil super.toString(), maka akan memanggil method tsb milik Dosen
    @Override
    public String toString() {
        return super.toString() + " " +  tempatKerja;
    }
}
