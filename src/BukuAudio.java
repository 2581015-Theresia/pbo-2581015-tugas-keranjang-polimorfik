
public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasiMenit;

    public BukuAudio(String judul, String penulis, int harga, int durasiMenit) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
    }

    @Override
    public int hargaAkhir() {
        return (int) Math.round(getHarga() * 0.90);
    }

    @Override
    public String keterangan() {
        return durasiMenit + " menit, diskon 10%";
    }

    @Override
    public String linkUnduh() {
        String slug = getJudul().toLowerCase().replace(' ', '-');
        return "https://toko.buku/audio/" + slug;
    }
}

