package subepaketi;


import java.util.ArrayList;
import java.util.List;

public class Urun {
    public String Adi;

    public String marka;

    public int barkod;

//-------------Urun olusturma methodu-------------//

    public static Urun urunOlusturma(String adi,String marka, int barkod ){
        Urun urun = new Urun();
        urun.Adi = adi;
        urun.marka = marka;
        urun.barkod = barkod;
        return urun;
    }

    //-------------Urun listesi olusturma methodu-------------//
    public static List<Urun> urunListesiOlusturma (Urun urun,Urun urun2){
        List<Urun> urunler = new ArrayList<>();
        urunler.add(urun);
        urunler.add(urun2);
        return urunler;
    }

}

