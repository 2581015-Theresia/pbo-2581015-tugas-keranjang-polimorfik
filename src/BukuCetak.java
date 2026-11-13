
public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    @Override
    public int hargaAkhir() {
        int jumlahOngkir = (beratGram + 499) / 500;
        int ongkir = jumlahOngkir * 5000;

        return getHarga() + ongkir;
    }

    @Override
    public String keterangan() {
        int jumlahOngkir = (beratGram + 499) / 500;
        int ongkir = jumlahOngkir * 5000;

        return beratGram + " gram, ongkir " + formatRupiah(ongkir);
    }
}

