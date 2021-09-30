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
class Pasien {

    String nama;
    boolean pakaiBPJS;
    JenisKamar[] jenisKamar = new JenisKamar[10];
    JenisPerawatan[] jenisPerawatan = new JenisPerawatan[5];
}

class JenisKamar {

    String kelas;
    int hargaPerHari;
}

class JenisPerawatan {

    String nama;
    int biaya;
}

public class ReviewStrukturData {

    static Pasien[] patients = new Pasien[150];
    static JenisKamar[] jenisKamar = new JenisKamar[4];
    static JenisPerawatan[] jenisPerawatan = new JenisPerawatan[8];

    static void inisialisasi() {

        //inisialisasi dulu jenis kamarnya apa ajah
        JenisKamar jenisKamar1 = new JenisKamar();
        jenisKamar1.kelas = "VIP";
        jenisKamar1.hargaPerHari = 2000000;

        JenisKamar jenisKamar2 = new JenisKamar();
        jenisKamar2.kelas = "I";
        jenisKamar2.hargaPerHari = 1500000;

        JenisKamar jenisKamar3 = new JenisKamar();
        jenisKamar3.kelas = "II";
        jenisKamar3.hargaPerHari = 1000000;

        JenisKamar jenisKamar4 = new JenisKamar();
        jenisKamar4.kelas = "III";
        jenisKamar4.hargaPerHari = 750000;

        //masukin ke array jenisKamar
        jenisKamar[0] = jenisKamar1;
        jenisKamar[1] = jenisKamar2;
        jenisKamar[2] = jenisKamar3;
        jenisKamar[3] = jenisKamar4;

        //inisialisasiin juga jenis perawatannya
        JenisPerawatan jenisPerawatan1 = new JenisPerawatan();
        jenisPerawatan1.nama = "Operasi";
        jenisPerawatan1.biaya = 5000000;

        JenisPerawatan jenisPerawatan2 = new JenisPerawatan();
        jenisPerawatan2.nama = "X-Ray";
        jenisPerawatan2.biaya = 700000;

        JenisPerawatan jenisPerawatan3 = new JenisPerawatan();
        jenisPerawatan3.nama = "USG";
        jenisPerawatan3.biaya = 500000;

        JenisPerawatan jenisPerawatan4 = new JenisPerawatan();
        jenisPerawatan4.nama = "Suntik";
        jenisPerawatan4.biaya = 300000;

        JenisPerawatan jenisPerawatan5 = new JenisPerawatan();
        jenisPerawatan5.nama = "Cek Darah";
        jenisPerawatan5.biaya = 200000;

        JenisPerawatan jenisPerawatan6 = new JenisPerawatan();
        jenisPerawatan6.nama = "Operasi Plastik";
        jenisPerawatan6.biaya = 6000000;

        JenisPerawatan jenisPerawatan7 = new JenisPerawatan();
        jenisPerawatan7.nama = "PCR";
        jenisPerawatan7.biaya = 500000;

        JenisPerawatan jenisPerawatan8 = new JenisPerawatan();
        jenisPerawatan8.nama = "SWAB";
        jenisPerawatan8.biaya = 100000;

        //masukin ke array jenisPerawatan
        jenisPerawatan[0] = jenisPerawatan1;
        jenisPerawatan[1] = jenisPerawatan2;
        jenisPerawatan[2] = jenisPerawatan3;
        jenisPerawatan[3] = jenisPerawatan4;
        jenisPerawatan[4] = jenisPerawatan5;
        jenisPerawatan[5] = jenisPerawatan6;
        jenisPerawatan[6] = jenisPerawatan7;
        jenisPerawatan[7] = jenisPerawatan8;

    }

    static int hitungTotalBiaya(Pasien pasien) {
        int total = 0;

        for (int i = 0; i < pasien.jenisPerawatan.length; i++) {
            total += pasien.jenisPerawatan[i].biaya;
        }

        if (!pasien.pakaiBPJS) {
            for (int i = 0; i < pasien.jenisKamar.length; i++) {
                total += pasien.jenisKamar[i].hargaPerHari;
            }
        }
        return total;
    }

    static int hitungTotalJenisPerawatanTertentu(String namaPerawatan) {
        int total = 0, index = 0;

        while (patients[index] != null) {
            for (int i = 0; i < patients[index].jenisPerawatan.length; i++) {
                if (patients[index].jenisPerawatan[i].nama.equals(namaPerawatan)) {
                    total++;
                }
            }
            index++;
        }

        return total;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String nama, punyaBPJS;
        int pilihKamar, pilihPerawatan, chooseMenu = 0, urutanPasien = 0, choosePerawatan;

        inisialisasi();

        while (chooseMenu != 4) {
            System.out.println("1. Input Pasien");
            System.out.println("2. Hitung Pendapatan Rumah Sakit");
            System.out.println("3. Hitung Jumlah Pasien Terhadap Jenis Perawatan Tertentu");
            System.out.println("4. Exit");
            System.out.print("Pilih Menu : ");
            chooseMenu = scan.nextInt();
            switch (chooseMenu) {
                case 1:
                    JenisKamar[] kamar = new JenisKamar[10];
                    JenisPerawatan[] perawatan = new JenisPerawatan[5];
                    Pasien patient = new Pasien();
                    scan = new Scanner(System.in);
                    System.out.print("Masukkan Nama Pasien : ");
                    nama = scan.nextLine();
                    System.out.println("---------------------");
                    for (int i = 0; i < kamar.length; i++) {
                        for (int j = 0; j < jenisKamar.length; j++) {
                            System.out.println((j + 1) + ". " + jenisKamar[j].kelas + " - Rp. " + jenisKamar[j].hargaPerHari);
                        }
                        System.out.print("Pilih kamar untuk hari ke-" + (i + 1) + ": ");
                        pilihKamar = scan.nextInt();
                        kamar[i] = jenisKamar[pilihKamar - 1];
                    }
                    System.out.println("---------------------");
                    for (int i = 0; i < perawatan.length; i++) {
                        for (int j = 0; j < jenisPerawatan.length; j++) {
                            System.out.println((j + 1) + ". " + jenisPerawatan[j].nama + " - Rp. " + jenisPerawatan[j].biaya);
                        }
                        System.out.print("Pilih perawatan yang dipakai : ");
                        pilihPerawatan = scan.nextInt();
                        perawatan[i] = jenisPerawatan[pilihPerawatan - 1];
                    }
                    System.out.print("Punya BPJS?(y/n): ");
                    punyaBPJS = scan.next();

                    patient.nama = nama;
                    patient.jenisKamar = kamar;
                    patient.jenisPerawatan = perawatan;

                    if ("y".equals(punyaBPJS)) {
                        patient.pakaiBPJS = true;
                    } else if ("n".equals(punyaBPJS)) {
                        patient.pakaiBPJS = false;
                    }

                    System.out.println("Total Biaya Pasien : Rp." + hitungTotalBiaya(patient));

                    patients[urutanPasien] = patient;
                    urutanPasien++;
                    break;
                case 2:
                    int totalPendapatan = 0,
                     index = 0;

                    while (patients[index] != null) {
                        totalPendapatan += hitungTotalBiaya(patients[index]);
                        index++;
                    }

                    System.out.println("Total Pendapatan Rumah Sakit adalah Rp. " + totalPendapatan);
                    break;
                case 3:

                    for (int i = 0; i < jenisPerawatan.length; i++) {
                        System.out.println((i + 1) + ". " + jenisPerawatan[i].nama);
                    }
                    System.out.print("Pilih Perawatan : ");
                    choosePerawatan = scan.nextInt();

                    System.out.println("Total pasien yang memakai perawatan " + jenisPerawatan[choosePerawatan - 1].nama + " sebanyak " + hitungTotalJenisPerawatanTertentu(jenisPerawatan[choosePerawatan - 1].nama) + " pasien");
                    break;
            }
        }

    }

}
