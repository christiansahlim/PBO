/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pemanasan;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Chris
 */
public class RumahSakit {

    class Pasien {

        String nama;
        JenisKamar[] rawatInap = new JenisKamar[10];
        JenisPerawatan[] perawatan = new JenisPerawatan[5];
        boolean pakaiBPJS;

        public Pasien(String nama, boolean pakaiBPJS) {
            this.nama = nama;
            this.pakaiBPJS = pakaiBPJS;
        }
    }

    class JenisKamar {

        String kelas;
        int hargaPerHari;

        public JenisKamar(String kelas, int hargaPerHari) {
            this.kelas = kelas;
            this.hargaPerHari = hargaPerHari;
        }
    }

    class JenisPerawatan {

        String nama;
        int biaya;

        public JenisPerawatan(String nama, int biaya) {
            this.nama = nama;
            this.biaya = biaya;
        }
    }

    class Data {

        String[] arrKamar = {"VIP", "Kelas I", "Kelas II", "Kelas III"};
        int[] arrHargaKamar = {1000000, 500000, 200000, 100000};
        String[] arrPerawatan = {"Operasi Tulang", "X-Ray", "USG", "Bedah", "Kemoterapi", "Check up", "Operasi ginjal", "perawatan"};
        int[] arrHargaPerawatan = {10000000, 2000000, 300000, 40000000, 500000, 60000, 7000000, 80000};
    }

    Pasien[] patients = new Pasien[150];

    String TipeKelasKamar(int int_kamar) {
        Data data = new Data();
        String kamar = data.arrKamar[int_kamar];
        return kamar;
    }

    int TipeHargaKamar(int int_kamar) {
        Data data = new Data();
        int harga = data.arrHargaKamar[int_kamar];
        return harga;
    }

    String TipeJenisPerawatan(int int_perawatan) {
        Data data = new Data();
        String perawatan = data.arrPerawatan[int_perawatan];
        return perawatan;
    }

    int TipeHargaPerawatan(int int_perawatan) {
        Data data = new Data();
        int harga = data.arrHargaPerawatan[int_perawatan];
        return harga;
    }

    int hitungTotalBiaya(Pasien patient, boolean pakaiBPJS) {
        int total = 0;
        if (!pakaiBPJS) {
            for (int i = 0; i < patient.rawatInap.length; i++) {
                total += patient.rawatInap[i].hargaPerHari;
            }
            System.out.println(total);
        }
        for (int i = 0; i < patient.perawatan.length; i++) {
            total += patient.perawatan[i].biaya;
        }
        System.out.println(total);
        return total;
    }

    int hitungTotalPendapatanRumahSakit() {
        int total = 0;
        for (int i = 0; i < patients.length; i++) {
            total += hitungTotalBiaya(patients[i], patients[i].pakaiBPJS);
        }
        return total;
    }

    void TambahPasienBaru(int banyakPasien) {
        patients[banyakPasien].nama = JOptionPane.showInputDialog(null, "Nama anda :", "RUMAH SAKIT CEPET SEMBUH", JOptionPane.INFORMATION_MESSAGE);
        Data data = new Data();
        String dataKamar = "", dataPerawatan = "";

        //data dummy
        for (int i = 0; i < data.arrKamar.length; i++) {
            dataKamar += (i + 1) + ". " + data.arrKamar[i] + "\n";
        }
        for (int i = 0; i < data.arrPerawatan.length; i++) {
            dataPerawatan += (i + 1) + ". " + data.arrPerawatan[i] + "\n";
        }

      
        for (int i = 0; i < patients[banyakPasien].rawatInap.length; i++) {
            int kamar = Integer.parseInt(JOptionPane.showInputDialog(null, "Jenis kamar hari ke-" + (i + 1) + " :\n" + dataKamar, "RUMAH SAKIT CEPET SEMBUH", JOptionPane.INFORMATION_MESSAGE));
            patients[banyakPasien].rawatInap[i].kelas = TipeKelasKamar(kamar - 1);
            patients[banyakPasien].rawatInap[i].hargaPerHari = TipeHargaKamar(kamar - 1);
        }
        for (int i = 0; i < patients[banyakPasien].perawatan.length; i++) {
            int perawatan = Integer.parseInt(JOptionPane.showInputDialog(null, "Jenis perawatan ke-" + (i + 1) + " :\n" + dataPerawatan, "RUMAH SAKIT CEPET SEMBUH", JOptionPane.INFORMATION_MESSAGE));
            patients[banyakPasien].perawatan[i].nama = TipeJenisPerawatan(perawatan - 1);
            patients[banyakPasien].perawatan[i].biaya = TipeHargaPerawatan(perawatan - 1);
        }
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda pengguna BPJS?", "BPJS", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            patients[banyakPasien].pakaiBPJS = true;
        }


        int total = hitungTotalBiaya(patients[banyakPasien], patients[banyakPasien].pakaiBPJS);
        JOptionPane.showMessageDialog(null, "Total biaya yang harus dibayar oleh Bapak/Ibu " + patients[banyakPasien].nama + " adalah sebesar Rp " + total, "RUMAH SAKIT CEPET SEMBUH", JOptionPane.INFORMATION_MESSAGE);
    }

    void PendapatanRumahSakit() {
        int total = hitungTotalPendapatanRumahSakit();
        JOptionPane.showMessageDialog(null, "Total pendapatan rumah sakit adalah Rp " + total, "RUMAH SAKIT CEPET SEMBUH", JOptionPane.INFORMATION_MESSAGE);
    }

    void BanyakPasienDenganPerawatanTertentu() {
        Data data = new Data();
        String dataPerawatan = "";
        int banyak = 0;

       //dummy
        for (int i = 0; i < data.arrPerawatan.length; i++) {
            dataPerawatan += (i + 1) + ". " + data.arrPerawatan[i] + "\n";
        }

        int perawatan = Integer.parseInt(JOptionPane.showInputDialog(null, "Jenis perawatan yang ingin dicari :\n" + dataPerawatan, "RUMAH SAKIT CEPET SEMBUH", JOptionPane.INFORMATION_MESSAGE));
        String jenisPerawatan = TipeJenisPerawatan(perawatan - 1);

        for (int i = 0; i < patients.length; i++) {
            for (int j = 0; j < patients[i].perawatan.length; j++) {
                if (patients[i].perawatan[j].nama.equals(jenisPerawatan)) {
                    banyak++;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Banyak pasien dengan perawatan " + jenisPerawatan + " = " + banyak + " orang", "RUMAH SAKIT CEPET SEMBUH", JOptionPane.INFORMATION_MESSAGE);
    }

    public RumahSakit() {
        
        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Pasien("", false);
            for (int j = 0; j < patients[i].rawatInap.length; j++) {
                patients[i].rawatInap[j] = new JenisKamar("", 0);
            }
            for (int j = 0; j < patients[i].perawatan.length; j++) {
                patients[i].perawatan[j] = new JenisPerawatan("", 0);
            }
        }

        JOptionPane.showMessageDialog(null, "Selamat datang di Sistem Rumah Sakit Cepet Sembuh", "RUMAH SAKIT CEPET SEMBUH", JOptionPane.INFORMATION_MESSAGE);
        int menu, banyakPasien = 0;
        do {
            do {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Tambah pasien baru\n2. Lihat total pendapatan rumah sakit\n3. Lihat banyak pasien dengan perawatan tertentu\n4. Exit", "RUMAH SAKIT CEPET SEMBUH", JOptionPane.INFORMATION_MESSAGE));
            } while (menu < 1 || menu > 4);
            switch (menu) {
                case 1:
                    
                    TambahPasienBaru(banyakPasien);
                    banyakPasien++;
                    break;
                case 2:
                    
                    PendapatanRumahSakit();
                    break;
                case 3:
                    
                    BanyakPasienDenganPerawatanTertentu();
                    break;
            }
        } while (menu != 5);
    }

    public static void main(String[] args) {
        new RumahSakit();
    }

}
