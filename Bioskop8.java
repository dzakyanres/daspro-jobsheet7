import java.util.Scanner;
public class Bioskop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, jumlahTiket, totalTiketTerjual = 0;
        double totalPenjualan = 0, diskon = 0, totalHargaSebelumDiskon, hargaAkhir;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan angka yang valid.\n");
                continue;
            }
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }
            totalHargaSebelumDiskon = jumlahTiket * hargaTiket;
            hargaAkhir = totalHargaSebelumDiskon - (totalHargaSebelumDiskon * diskon);

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaAkhir;

            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total bayar transaksi ini: Rp " + hargaAkhir);
        }

        System.out.println("Total tiket terjual  : " + totalTiketTerjual + " tiket");
        System.out.println("Total harga penjualan: Rp " + totalPenjualan);

        sc.close();
    }
}