public class Main {
    public static void main(String[] args) {
        Dokter dokter1 = new Dokter("Dr. Andi");
        Pasien pasien1 = new Pasien("Budi");
        Dokter dokter2 = new Dokter("Dr. Amun");
        Pasien pasien2 = new Pasien("Nwenden");
        Pasien pasien3 = new Pasien("Reza");
        Dokter dokter3 = new Dokter("Dr.Sendok")

        dokter1.periksa(pasien1);
        dokter2.periksa(pasien2);
        dokter1.periksa(pasien2);
        dokter3.periksa(pasien3);
    }
}
