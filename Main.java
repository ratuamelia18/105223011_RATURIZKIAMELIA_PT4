public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek Mobil
        Mobil mobil1 = new Mobil("B 2359 ALO", "Toyota Raize", 500000, true);
        Mobil mobil2 = new Mobil("B 7899 DDD", "Honda Jazz", 600000, true);
        Mobil mobil3 = new Mobil("D 4453 EFI", "Mitsubishi Pajero", 800000, true);

        // Menampilkan daftar mobil yang tersedia
        System.out.println(" == Daftar Mobil ==");
        mobil1.tampilkanInfo();
        System.out.println();
        mobil2.tampilkanInfo();
        System.out.println();
        mobil3.tampilkanInfo();
        System.out.println("---------------------");

        Pelanggan pelanggan1 = new Pelanggan("Andi Nicholas", "32100123468678901", "08123412357");

        Sewa sewa1 = new Sewa(pelanggan1, mobil1, 7);
        sewa1.tampilkanStruk();

        System.out.println("\n == Status Mobil Setelah Transaksi ==");
        mobil1.tampilkanInfo();
        System.out.println();
        mobil2.tampilkanInfo();
        System.out.println();
        mobil3.tampilkanInfo();
    }
}
