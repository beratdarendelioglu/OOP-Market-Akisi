package subepaketi;

import java.util.ArrayList;
import java.util.List;

public class Calisan {
    public String adi;

    public String soyadi;

    public String telNo;

    public double maas;

    public int calismaSaati;

    public Sube sube;


    //-------------Calisan olusturma methodu-------------//

    public static Calisan calisanOlusturma(String adi, String soyadi, String telNo ,int maas, int calismaSaati, Sube sube){
        Calisan calisan = new Calisan();
        calisan.adi = adi;
        calisan.soyadi = soyadi;
        calisan.telNo = telNo;
        calisan.maas = maas;
        calisan.calismaSaati = calismaSaati;
        calisan.sube = sube;
        return calisan;
    }
    public static List<Calisan> calisanListesiOlusturma (Calisan calisan,Calisan calisan2,Calisan calisan3,Calisan calisan4,Calisan calisan5,Calisan calisan6,Calisan calisan7){
        List<Calisan> calisanlar = new ArrayList<>();
        calisanlar.add(calisan);
        calisanlar.add(calisan2);
        calisanlar.add(calisan3);
        calisanlar.add(calisan4);
        calisanlar.add(calisan5);
        calisanlar.add(calisan6);
        calisanlar.add(calisan7);
        return calisanlar;
    }


}
