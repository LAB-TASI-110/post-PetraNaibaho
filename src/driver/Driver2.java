package driver;

import java.util.Scanner;
import model.Model1;
import model.Model2;
import model.Model3;

public class Driver2 {

    // ====== DIPAKAI DRIVER1 ======
    public static void cetakStruk(String kota, double beratButet, double beratUcok,
                                  double totalBerat, double totalOngkir, String infoPromo) {

        System.out.println("\n=== STRUK PENGIRIMAN ===");
        System.out.println("Kota Tujuan : " + kota);
        System.out.println("Berat Butet : " + beratButet + " kg");
        System.out.println("Berat Ucok  : " + beratUcok + " kg");
        System.out.println("Total Berat : " + totalBerat + " kg");
        System.out.println("Total Ongkir: Rp " + totalOngkir);
        System.out.println("Promo       : " + infoPromo);
        System.out.println("=========================");
    }

    // ====== MAIN UNTUK SOAL GUDANG ======
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Model2 gudang = new Model2();

        System.out.print("Masukkan jumlah data (N): ");
        int N = input.nextInt();

        int[] stok = new int[N];
        String[] kategori = new String[N];

        System.out.println("Masukkan deret stok:");
        for (int i = 0; i < N; i++) {
            stok[i] = input.nextInt();
        }

        input.nextLine();

        System.out.println("Masukkan kategori tiap barang:");
        for (int i = 0; i < N; i++) {
            kategori[i] = Model3.normalisasiKategori(input.nextLine());
        }

        for (int i = 0; i < N; i++) {
            gudang.tambahBarang(new Model1(stok[i], kategori[i]));
        }

        System.out.print("\nMasukkan kategori yang ingin dihitung: ");
        String kategoriCari = input.nextLine();

        if (!Model3.isKategoriValid(kategoriCari)) {
            System.out.println("Kategori tidak valid!");
            return;
        }

        kategoriCari = Model3.normalisasiKategori(kategoriCari);

        int total = gudang.hitungTotalStok(kategoriCari);

        System.out.println("\n=== HASIL ===");
        System.out.println("Kategori : " + kategoriCari);
        System.out.println("Total Stok : " + total);

        input.close();
    }
}