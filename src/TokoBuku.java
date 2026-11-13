
public class TokoBuku {

    public static int hitungTotal(Buku[] keranjang) {
        int total = 0;

        for (Buku buku : keranjang) {
            total += buku.hargaAkhir();
        }

        return total;
    }

    public static void main(String[] args) {

        BukuCetak cetak1 = new BukuCetak(
                "Pemrograman Java", "John Doe", 120000, 750
        );

        BukuCetak cetak2 = new BukuCetak(
                "Algoritma Dasar", "Jane Smith", 95000, 400
        );

        BukuDigital digital = new BukuDigital(
                "Belajar OOP", "Ani Wijaya", 80000, 12.5
        );

        BukuAudio audio = new BukuAudio(
                "Kisah Programmer", "Budi Santoso", 60000, 240
        );

        // Percobaan membuat objek dari abstract class:
        // Buku b = new Buku("X", "Y", 1);
        // Error: Buku is abstract; cannot be instantiated

        Buku[] keranjang = {
                cetak1, cetak2, digital, audio
        };

        BisaDiunduh[] unduhan = {
                digital, audio
        };

        System.out.println("=============== KERANJANG ===============");

        for (Buku buku : keranjang) {
            buku.tampilkanInfo();
        }

        System.out.println("-----------------------------------------");

        int total = hitungTotal(keranjang);

        System.out.println("Total bayar   : " + Buku.formatRupiah(total));

        System.out.println();
        System.out.println("============== LINK UNDUH ===============");

        for (BisaDiunduh buku : unduhan) {
            System.out.println(buku.linkUnduh());
        }
    }
}

