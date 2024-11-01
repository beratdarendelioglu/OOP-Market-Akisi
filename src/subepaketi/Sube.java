package subepaketi;

import java.util.ArrayList;
import java.util.List;

public class Sube {
    public String adi;

    public int subeKodu;

    public List<Calisan> calisanlar;

    public List<Reyon> reyonlar;

    public List<Kasa> kasalar;

//-------------Sube olusturma methodu-------------//

    public static Sube subeOlusturma(String adi, int subeKodu) {
        Sube sube = new Sube();
        sube.adi = adi;
        sube.subeKodu = subeKodu;
        sube.kasalar = new ArrayList<>();
        sube.reyonlar = new ArrayList<>();
        sube.calisanlar = new ArrayList<>();
        return sube;

    }
}