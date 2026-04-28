package model;

public class Model3 {
    private Model1 mahasiswa;
    private Model2 menu;
    private int jumlah;

    public Model3(Model1 mahasiswa, Model2 menu, int jumlah) {
        this.mahasiswa = mahasiswa;
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public int getTotal() {
        return menu.getHarga() * jumlah;
    }

    public double getDiskon() {
        if (jumlah > 1) {
            return getTotal() * 0.1; // 10%
        }
        return 0;
    }

    public double getTotalBayar() {
        return getTotal() - getDiskon();
    }

    public void printStruk() {
        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("ID Mahasiswa : " + mahasiswa.getIdMahasiswa());
        System.out.println("Menu         : " + menu.getNama());
        System.out.println("Jumlah       : " + jumlah);
        System.out.println("Harga        : " + menu.getHarga());
        System.out.println("Total        : " + getTotal());
        System.out.println("Diskon       : " + getDiskon());
        System.out.println("Total Bayar  : " + getTotalBayar());
    }
}