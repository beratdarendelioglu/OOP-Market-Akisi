import java.util.ArrayList;
import java.util.List;

public class Sehir {
    public String adi;

    public int plakasi;

    public List<Ilce> ilceler;


//-------------Sehir olusturma methodu-------------//

    public static Sehir sehirOlusturma(String adi,int plakasi){
        Sehir sehir = new Sehir();
        sehir.adi = adi;
        sehir.plakasi = plakasi;

        sehir.ilceler = new ArrayList<>();
        return sehir;
    }
}
