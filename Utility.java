public class Utility {
    public static double hitungDiskon(double totalBiaya, int durasi) {
        if (durasi > 5) {
            return totalBiaya * 0.9; 
        }
        return totalBiaya;
    }

    public static String formatMataUang(double jumlah) {
        String jumlahString = String.format("%,.2f", jumlah); 
        return "Rp" + jumlahString.replace(",", "."); 
    }
}
