import java.util.List;
import java.util.ArrayList;

public class Klinik {
    private List<Ruangan> daftarRuangan;
    private List<Dokter> daftarDokter;

    public Klinik(List<Dokter> dokter) {
        this.daftarDokter = dokter;

        this.daftarRuangan = new ArrayList<>();
        this.daftarRuangan.add(new Ruangan("Ruang 101"));
        this.daftarRuangan.add(new Ruangan("Ruang 102"));
    }
}
