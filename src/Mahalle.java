import subepaketi.Sube;

import java.util.ArrayList;
import java.util.List;

public class Mahalle {
    public String adi;


    public int postaKodu;

    public List<Sube> subeler;


//-------------Mahalle olusturma methodu-------------//

    public static Mahalle mahalleOlusturma(String adi,  int postaKodu){
        Mahalle mahalle = new Mahalle();
        mahalle.adi = adi;
        mahalle.postaKodu = postaKodu;
        mahalle.subeler = new ArrayList<>();
        return mahalle;
    }

}