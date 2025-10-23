public class Main {
    public static void main(String[] args) {
        Dokter dokter1 = new Dokter("Dr. Andi");
        Pasien pasien1 = new Pasien("Budi");
        Dokter dokter2 = new Dokter("Dr. Amun");
        Pasien pasien2 = new Pasien("Nwenden");

        dokter1.periksa(pasien1);
        dokter2.periksa(pasien2);
        dokter1.periksa(pasien2);
    }
}
