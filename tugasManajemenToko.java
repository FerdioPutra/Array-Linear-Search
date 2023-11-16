import java.util.Scanner;

public class tugasManajemenToko {
    public static void main(String[] args) {
        // Inisialisasi array Stok Barang
        String[] Produk = {"Laptop", "Smartphone", "Tablet", "Headphones", "Printer"};
        Double[] Harga = {8000000.00, 3500000.00, 4100000.00, 800000.00, 1200000.00};
        int[] Stok = {10, 20, 10, 30, 14};
   

        // Menampilkan Produk
        System.out.println("Daftar Barang:");
        for (int i = 0; i < Produk.length; i++) {
            System.out.println(Produk[i] + " (Harga :" + Harga[i] + ", Stok : " + Stok[i] + ")" );
        }
    
        // memasukkan Nama Produk yang ingin dicari
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Produk yang ingin dicari: ");
        String CariProduk = scanner.nextLine();
   
        int hasilPencarian = linearSearch(Produk, CariProduk);
        if (hasilPencarian != -1) {
            System.out.println("Produk" + CariProduk + " ditemukan!");
            System.out.println("Produk: " + Produk[hasilPencarian] + " - " + "Harga : " + Harga[hasilPencarian] + " - " + "Stok :" + Stok[hasilPencarian] );
        } else {
            System.out.println("Produk " + CariProduk + "' tidak ditemukan.");
        }
   
        scanner.close();
    }
   
    // Metode Linear Search untuk mencari Produk dalam array
    public static int linearSearch(String[] array, String key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(key)) {
                return i; 
            }
        }
        return -1;
    
    }
}
