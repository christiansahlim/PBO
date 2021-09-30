/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pemanasan;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class SelisihHari {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Hari awal: ");
        String hari1 = input.next();
        System.out.print("Masukan Hari akhir: ");
        String hari2 = input.next();

        int hariAwal = 0;
        int hariAkhir = 0;
        int selisih = 0;

        if (hari1.equals("minggu")) {
            hariAwal = 1;
        } else if (hari1.equals("senin")) {
            hariAwal = 2;
        } else if (hari1.equals("selasa")) {
            hariAwal = 3;
        } else if (hari1.equals("rabu")) {
            hariAwal = 4;
        } else if (hari1.equals("kamis")) {
            hariAwal = 5;
        } else if (hari1.equals("jumat")) {
            hariAwal = 6;
        } else if (hari1.equals("sabtu")) {
            hariAwal = 7;
        } else {
            System.out.println("salah masukkan nama hari");
        }
        
        if (hari2.equals("minggu")) {
            hariAkhir = 1;
        } else if (hari2.equals("senin")) {
           hariAkhir = 2;
        } else if (hari2.equals("selasa")) {
            hariAkhir = 3;
        } else if (hari2.equals("rabu")) {
            hariAkhir = 4;
        } else if (hari2.equals("kamis")) {
            hariAkhir = 5;
        } else if (hari2.equals("jumat")) {
            hariAkhir = 6;
        } else if (hari2.equals("sabtu")) {
            hariAkhir = 7;
        } else {
            System.out.println("salah masukkan nama hari");
        }

        if (hariAwal > hariAkhir) {
            selisih = hariAwal - hariAkhir;
        } else if (hariAkhir > hariAwal) {
            selisih = hariAkhir - hariAwal;
        }

        System.out.println("Selisih hari " + hari1 + " dan hari " + hari2 + " adalah " + selisih);
    }
}
