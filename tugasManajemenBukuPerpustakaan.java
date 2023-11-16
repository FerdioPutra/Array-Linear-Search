import java.util.Scanner;

public class tugasManajemenBukuPerpustakaan {
    public static void main(String[] args) {
        
        // Inisialisasi array Buku
        String[] judul = {"Java Programming", "Data Structures and Algorithm", "Introduction to AI", "Database Management", "Web Development"};
        String[] Author = {"John Smith", "Alice Johnson", "Robert Williams", "Emily Davis", "Michael Brown"};
        int[] Tahun = {2020, 2019, 2022, 2018, 2021};
        String[] Ketersediaan = {"Tersedia", "Tidak Tersedia", "Tersedia", "Tersedia", "Tersedia"};

        // Menampilkan daftar Buku
        System.out.println("Daftar Buku:");
        for (int i = 0; i < judul.length; i++) {
            System.out.println(judul[i] + " (Author :" + Author[i] + ", Tahun: " + Tahun[i] + " Status : " + Ketersediaan[i] + ")" );
        }
    
     // memasukkan Judul buku yang ingin dicari
     Scanner scanner = new Scanner(System.in);
     System.out.print("Masukkan judul yang ingin dicari: ");
     String judulCari = scanner.nextLine();

     int hasilPencarian = linearSearch(judul, judulCari);
     if (hasilPencarian != -1) {
         System.out.println("Buku dengan judul '" + judulCari + "' ditemukan!");
         System.out.println("Detail Buku: " + judul[hasilPencarian] + " - " + Author[hasilPencarian] + " (" + Tahun[hasilPencarian] + "), Ketersediaan: " + (Ketersediaan[hasilPencarian] ));
     } else {
         System.out.println("Buku dengan judul '" + judulCari + "' tidak ditemukan.");
     }

     scanner.close();
 }

 // Metode Linear Search untuk mencari judul buku dalam array
 public static int linearSearch(String[] array, String key) {
     for (int i = 0; i < array.length; i++) {
         if (array[i].equalsIgnoreCase(key)) {
             return i; 
         }
     }
     return -1;
    }
}
