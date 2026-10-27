import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, totalTiket = 0;
        double hargaTiket = 50000, totalHarga = 0, diskon = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan lagi.");
                continue;
            }

            // Hitung diskon
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            double subtotal = jumlahTiket * hargaTiket;
            double bayar = subtotal - (subtotal * diskon);

            totalTiket += jumlahTiket;
            totalHarga += bayar;

            System.out.println("Subtotal: Rp " + subtotal);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Yang harus dibayar: Rp " + bayar);
            System.out.println("--------------------------------");
        }

        System.out.println("\n===== RINGKASAN PENJUALAN =====");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total pendapatan   : Rp " + totalHarga);

        sc.close();
    }
}