import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        tampilMenu();
    }

    private static void tampilMenu() {
        String konfirmasi, ulang;
        int nomorTiket, jumlahTiket, totalHarga, totalBayar, kembali;

        Scanner input = new Scanner(System.in);
        Tiket tiketReguler = new Tiket("Tiket Reguler", 150000);
        Tiket tiketMainEast = new TiketMainEast("Tiket Main East", 500000, "Tribun Utama Timur");
        Tiket tiketVIP = new TiketVIP("Tiket VIP", 1000000, "Tribun AC, Premium Lounge");

        System.out.println("========================================");
        System.out.println("== TIKET TIMNAS INDONESIA VS MALAYSIA ==");
        System.out.println("========================================");
        System.out.println("1. " + tiketReguler.getNamaTiket() + " - Rp." + tiketReguler.getHargaTiket());
        System.out.println("2. " + tiketMainEast.getNamaTiket() + " - Rp." + tiketMainEast.getHargaTiket());
        System.out.println("3. " + tiketVIP.getNamaTiket() + " - Rp." + tiketVIP.getHargaTiket());
        System.out.println();
        System.out.print("Silakan Pilih Nomor Tiket untuk Menampilkan Detail: ");
        nomorTiket = input.nextInt();

        System.out.println("");

        switch (nomorTiket) {
            case 1:
                tiketReguler.tampilTiket();
                System.out.print("Apakah Anda ingin membeli tiket ini? (Y/T): ");
                konfirmasi = input.next();

                if (konfirmasi.equalsIgnoreCase("y")) {
                    System.out.print("Masukkan jumlah pembelian tiket: ");
                    jumlahTiket = input.nextInt();

                    totalHarga = jumlahTiket * tiketReguler.getHargaTiket();
                    System.out.println("Total Harga: Rp. " + totalHarga);

                    System.out.print("Masukkan jumlah uang yang dibayarkan: ");
                    totalBayar = input.nextInt();

                    kembali = totalBayar - totalHarga;

                    if (kembali >= 0) {
                        System.out.println("");
                        tiketReguler.cetakKuitansi(jumlahTiket, totalBayar);
                    } else {
                        System.out.println("Maaf, uang yang dibayarkan tidak mencukupi.");
                    }
                } else {
                    tampilMenu();
                }
                break;

            case 2:
                tiketMainEast.tampilTiket();
                System.out.print("Apakah Anda ingin membeli tiket ini? (Y/T): ");
                konfirmasi = input.next();

                if (konfirmasi.equalsIgnoreCase("y")) {
                    System.out.print("Masukkan jumlah pembelian tiket: ");
                    jumlahTiket = input.nextInt();

                    totalHarga = jumlahTiket * tiketMainEast.getHargaTiket();
                    System.out.println("Total Harga: Rp. " + totalHarga);

                    System.out.print("Masukkan jumlah uang yang dibayarkan: ");
                    totalBayar = input.nextInt();

                    kembali = totalBayar - totalHarga;

                    if (kembali >= 0) {
                        System.out.println("");
                        tiketMainEast.cetakKuitansi(jumlahTiket, totalBayar);
                    } else {
                        System.out.println("Maaf, uang yang dibayarkan tidak mencukupi.");
                    }
                } else {
                    tampilMenu();
                }
                break;

            case 3:
                tiketVIP.tampilTiket();
                System.out.print("Apakah Anda ingin membeli tiket ini? (Y/T): ");
                konfirmasi = input.next();

                if (konfirmasi.equalsIgnoreCase("y")) {
                    System.out.print("Masukkan jumlah pembelian tiket: ");
                    jumlahTiket = input.nextInt();

                    totalHarga = jumlahTiket * tiketVIP.getHargaTiket();
                    System.out.println("Total Harga: Rp. " + totalHarga);

                    System.out.print("Masukkan jumlah uang yang dibayarkan: ");
                    totalBayar = input.nextInt();

                    totalHarga = jumlahTiket * tiketVIP.getHargaTiket();
                    kembali = totalBayar - totalHarga;

                    if (kembali >= 0) {
                        System.out.println("");
                        tiketVIP.cetakKuitansi(jumlahTiket, totalBayar);
                    } else {
                        System.out.println("Maaf, uang yang dibayarkan tidak mencukupi.");
                    }
                } else {
                    tampilMenu();
                }
                break;

            default:
                System.out.println("Maaf, pilihan tiket tidak tersedia.");
                System.out.println("");
                tampilMenu();
                break;
        }

        System.out.print("Ingin beli tiket lagi? (Y/T): ");
        ulang = input.next();

        if (ulang.equalsIgnoreCase("Y")) {
            tampilMenu();
        } else {
            System.exit(0);
        }
    }
}