package driver;

import java.util.Scanner;
import model.Model1;
import model.Model2;
import model.Model3;

public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data menu
        Model2 tempe = new Model2("Tempe", 20000);
        Model2 tahu = new Model2("Tahu", 10000);
        Model2 sosis = new Model2("Sosis", 5000);
        Model2 burger = new Model2("Burger", 7000);

        System.out.println("=== KAFETARIA IT DEL ===");
        System.out.println("1. Tempe (20000)");
        System.out.println("2. Tahu (10000)");
        System.out.println("3. Sosis (5000)");
        System.out.println("4. Burger (7000)");

        // Input mahasiswa
        System.out.print("ID Mahasiswa: ");
        String id = input.nextLine();
        Model1 mhs = new Model1(id);

        // Input menu
        System.out.print("Pilih menu: ");
        int pilih = input.nextInt();

        System.out.print("Jumlah: ");
        int jumlah = input.nextInt();

        Model2 menuDipilih = null;

        switch (pilih) {
            case 1: menuDipilih = tempe; break;
            case 2: menuDipilih = tahu; break;
            case 3: menuDipilih = sosis; break;
            case 4: menuDipilih = burger; break;
            default:
                System.out.println("Menu tidak ada!");
                return;
        }

        // proses transaksi
        Model3 transaksi = new Model3(mhs, menuDipilih, jumlah);

        // output
        transaksi.printStruk();

        input.close();
    }
}