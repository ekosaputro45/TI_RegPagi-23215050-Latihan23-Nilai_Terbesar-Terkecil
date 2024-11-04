
package pertemuan6;

import java.util.Scanner;
public class latihan23_nilaiterbesartokecil {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta nama petugas
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = scanner.nextLine();
        
        // Meminta jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        
        // Inisialisasi variabel untuk nilai terbesar dan terkecil
        int nilaiTerbesar = Integer.MIN_VALUE;
        int nilaiTerkecil = Integer.MAX_VALUE;
        
        // Loop untuk meminta nilai tiap mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            int nilai = scanner.nextInt();
            
            // Memeriksa nilai terbesar dan terkecil
            if (nilai > nilaiTerbesar) {
                nilaiTerbesar = nilai;
            }
            if (nilai < nilaiTerkecil) {
                nilaiTerkecil = nilai;
            }
        }
        
        // Menampilkan hasil
        System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        System.out.println("Petugas : " + namaPetugas);
        
        scanner.close();
    }

}
