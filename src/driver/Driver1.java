package driver;

import java.util.Scanner;
import model.Model1;
import model.Model2;
import model.Model3;

public class Driver1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Model1 data = new Model1();
        Model2 hitung = new Model2();
        Model3 promo = new Model3();

        while (true) {
            String kode = input.nextLine();

            if (kode.equals("END")) {
                break;
            }

            double beratButet = input.nextDouble();
            input.nextLine(); // buang newline

            String kota = data.getKota(kode);
            int ongkir = data.getOngkir(kode);
            String kategori = data.getKategori(kode);

            double beratUcok = hitung.hitungBeratUcok(beratButet);
            double totalBerat = hitung.hitungTotalBerat(beratButet, beratUcok);
            double totalOngkir = hitung.hitungTotalOngkir(totalBerat, ongkir);

            String infoPromo = promo.cekPromo(totalBerat, kategori, totalOngkir);

            Driver2.cetakStruk(kota, beratButet, beratUcok, totalBerat, totalOngkir, infoPromo);
        }

        input.close();
    }
}