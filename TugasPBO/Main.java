import java.util.List;
public class Main {
    public static void main(String[] args) {
        Dokter dokter1 = new Dokter("Dr. Smith");
        Pasien pasien1 = new Pasien("John Doe");
        Klinik klinik1 = new Klinik(List.of(dokter1));
        dokter1.periksaPasien(pasien1);
    }
}
