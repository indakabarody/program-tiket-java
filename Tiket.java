/**
 * Tiket
 */
public class Tiket {
    private String namaTiket;
    private int hargaTiket;

    public Tiket(String namaTiket, int hargaTiket) {
        this.namaTiket = namaTiket;
        this.hargaTiket = hargaTiket;
    }

    public String getNamaTiket() {
        return namaTiket;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void tampilTiket() {
        System.out.println("DETAIL TIKET");
        System.out.println("Nama tiket: " + namaTiket);
        System.out.println("Harga tiket: Rp. " + hargaTiket);
    }

    public void cetakKuitansi(int jumlah, int totalBayar) {
        System.out.println("------------ Kuitansi Pembelian Tiket ------------");
        System.out.println("");
        System.out.println("Tiket         : " + this.getNamaTiket());
        System.out.println("Harga Satuan  : Rp." + this.getHargaTiket());
        System.out.println("Jumlah Beli   : " + jumlah);
        System.out.println("--------------------------------------------------");
        System.out.println("Total Harga   : Rp." + (jumlah * this.getHargaTiket()));
        System.out.println("Total Bayar   : Rp." + totalBayar);
        System.out.println("Kembali       : Rp." + (totalBayar - (jumlah * this.getHargaTiket())));
        System.out.println("--------------------------------------------------");
    }
}