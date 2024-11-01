import java.util.ArrayList;
import java.util.List;

public class Bolge {
    public String adi;
    public List<Sehir> sehirler;

    public static Bolge bolgeOlusturma(String adi) {
        Bolge bolge = new Bolge();
        bolge.adi = adi;
        bolge.sehirler = new ArrayList<>();
        return bolge;
    }
}
