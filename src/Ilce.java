import java.util.ArrayList;
import java.util.List;

public class Ilce {
    public String adi;


    public List<Mahalle> mahalleler;


//-------------Ilce olusturma methodu-------------//

    public static Ilce ilceOlusturma(String adi) {
        Ilce ilce = new Ilce();
        ilce.adi = adi;
        ilce.mahalleler = new ArrayList<>();
        return ilce;
    }
}