package subepaketi;


import java.util.ArrayList;
import java.util.List;

public class Reyon {
    public String adi;

    public int reyonKodu;

    public List<Urun> urunler;

//-------------Reyon olusturma methodu-------------//

    public static Reyon reyonOlusturma(String adi, int reyonKodu){
        Reyon reyon = new Reyon();
        reyon.adi = adi;
        reyon.reyonKodu = reyonKodu;
        reyon.urunler = new ArrayList<>();
        return reyon;
    }
//-------------Reyon listesi olusturma methodu-------------//

    public static List<Reyon> reyonListesiOlusturma (Reyon reyon1,Reyon reyon2){
        List<Reyon> reyonlar = new ArrayList<>();
        reyonlar.add(reyon1);
        reyonlar.add(reyon2);
        return reyonlar;
    }




}

