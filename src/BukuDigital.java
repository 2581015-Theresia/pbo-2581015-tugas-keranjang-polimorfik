
public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    @Override
    public int hargaAkhir() {
        return (int) Math.round(getHarga() * 0.80);
    }

    @Override
    public String keterangan() {
        return ukuranMB + " MB, diskon 20%";
    }

    @Override
    public String linkUnduh() {
        String slug = getJudul().toLowerCase().replace(' ', '-');
        return "https://toko.buku/ebook/" + slug;
    }
}
