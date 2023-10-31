import java.util.Scanner;

/**
 * Program sederhana untuk menghitung tegangan listrik berdasarkan rumus Tegangan = Arus x Hambatan.
 */
public class TeganganListrik {
    /**
     * Metode utama program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai arus dan hambatan
        System.out.print("Masukkan nilai arus (I) dalam ampere: ");
        double arus = input.nextDouble();

        System.out.print("Masukkan nilai hambatan (R) dalam ohm: ");
        double hambatan = input.nextDouble();

        // Menghitung tegangan menggunakan rumus V = I * R
        double tegangan = arus * hambatan;

        // Menampilkan hasil perhitungan tegangan
        System.out.println("Tegangan listrik (V) adalah: " + tegangan + " volt");

        input.close();
    }
}
