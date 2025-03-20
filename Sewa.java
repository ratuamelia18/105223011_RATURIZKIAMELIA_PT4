public class Sewa {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private int durasi;
    private double totalBiaya;
    private boolean berhasil;

    public Sewa(Pelanggan pelanggan, Mobil mobil, int durasi) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.durasi = durasi;
        prosesPenyewaan();
    }

    private void prosesPenyewaan() {
        if (mobil.isTersedia()) {
            mobil.setTersedia(false);
            totalBiaya = mobil.getHargaSewaPerHari() * durasi;
            totalBiaya = Utility.hitungDiskon(totalBiaya, durasi);
            berhasil = true;
        } else {
            berhasil = false;
        }
    }

    public void tampilkanStruk() {
        System.out.println("\n == Struk Penyewaan ==");
        pelanggan.tampilkanInfo();
        System.out.println("Mobil yang Disewa:");
        mobil.tampilkanInfo();
        System.out.println("Durasi Sewa: " + durasi + " hari");
        System.out.println("Total Biaya: " + Utility.formatMataUang(totalBiaya));
        System.out.println("Status: " + (berhasil ? "Berhasil" : "Gagal, Mobil tidak tersedia"));
        System.out.println("--------------------------");
    }
}
