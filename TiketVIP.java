/**
 * TiketVIP
 */
public class TiketVIP extends Tiket {
    private String fasilitas;

    public TiketVIP(String namaTiket, int hargaTiket, String fasilitas) {
        super(namaTiket, hargaTiket);
        this.fasilitas = fasilitas;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    @Override
    public void tampilTiket() {
        super.tampilTiket();
        System.out.println("Fasilitas: " + fasilitas);
    }

    @Override
    public void cetakKuitansi(int jumlah, int totalBayar) {
        System.out.println("------------ Kuitansi Pembelian Tiket ------------");
        System.out.println("");
        System.out.println("Tiket         : " + this.getNamaTiket());
        System.out.println("Fasilitas     : " + this.getFasilitas());
        System.out.println("Harga Satuan  : Rp." + this.getHargaTiket());
        System.out.println("Jumlah Beli   : " + jumlah);
        System.out.println("--------------------------------------------------");
        System.out.println("Total Harga   : Rp." + (jumlah * this.getHargaTiket()));
        System.out.println("Total Bayar   : Rp." + totalBayar);
        System.out.println("Kembali       : Rp." + (totalBayar - (jumlah * this.getHargaTiket())));
        System.out.println("--------------------------------------------------");
    }
}
