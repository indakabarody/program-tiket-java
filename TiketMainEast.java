/**
 * TiketMainEast
 */
public class TiketMainEast extends Tiket {
    private String tribun;

    public TiketMainEast(String namaTiket, int hargaTiket, String tribun) {
        super(namaTiket, hargaTiket);
        this.tribun = tribun;
    }

    public String getTribun() {
        return tribun;
    }

    @Override
    public void tampilTiket() {
        super.tampilTiket();
        System.out.println("Tribun: " + tribun);
    }

    @Override
    public void cetakKuitansi(int jumlah, int totalBayar) {
        System.out.println("------------ Kuitansi Pembelian Tiket ------------");
        System.out.println("");
        System.out.println("Tiket         : " + this.getNamaTiket());
        System.out.println("Tribun        : " + this.getTribun());
        System.out.println("Harga Satuan  : Rp." + this.getHargaTiket());
        System.out.println("Jumlah Beli   : " + jumlah);
        System.out.println("--------------------------------------------------");
        System.out.println("Total Harga   : Rp." + (jumlah * this.getHargaTiket()));
        System.out.println("Total Bayar   : Rp." + totalBayar);
        System.out.println("Kembali       : Rp." + (totalBayar - (jumlah * this.getHargaTiket())));
        System.out.println("--------------------------------------------------");
    }
}