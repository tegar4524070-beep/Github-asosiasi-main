public class Dokter {
    private String nama;

    public Dokter(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void periksa(Pasien pasien) {
        System.out.println("Dokter " + nama + " sedang memeriksa pasien " + pasien.getNama());
    }
}