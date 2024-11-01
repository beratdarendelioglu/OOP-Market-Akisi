import subepaketi.*;

public class Main {
    public static void main(String[] args) {
        Ulke turkiye = Ulke.ulkeOlusturma("Türkiye",85000000);
        turkiye = initalizeUlke(turkiye);
        ekranCiktisi(turkiye);
    }

    private static void ekranCiktisi(Ulke turkiye) {
        System.out.println("Ülke İsmi: " + turkiye.adi);
        for (Bolge bolge: turkiye.bolgeler){
            System.out.println("-Bölge İsmi: " + bolge.adi);
            System.out.println("*********");
            for (Sehir sehir: bolge.sehirler){
                System.out.println("-Şehir adı: " + sehir.adi);
                System.out.println("*********");
                for (Ilce ilce: sehir.ilceler){
                    System.out.println("-İlçe adı: " + ilce.adi);
                    System.out.println("*********");
                    for (Mahalle mahalle : ilce.mahalleler){
                        System.out.println("-Mahalle adı: " + mahalle.adi);
                        System.out.println("*********");

                        for (Sube sube : mahalle.subeler) {
                            System.out.println("-Şube adı: " + sube.adi);
                            System.out.println("*********");

                            for (Calisan calisan:sube.calisanlar){
                                System.out.println( "*" + sube.adi +" Çalışanı ismi: " + calisan.adi + " " + calisan.soyadi);
                                System.out.println("--------------");

                            }
                        }
                    }
                }
            }
        }
    }

    private static Ulke initalizeUlke(Ulke turkiye) {
        turkiye = bolgeEkleme(turkiye);
        return turkiye;
    }

    //----------BÖLGE OLUŞTURMA----------
    private static Ulke bolgeEkleme(Ulke turkiye) {
        Bolge bolge = Bolge.bolgeOlusturma("Marmara ");
        turkiye.bolgeler.add(bolge);
        sehirEkleme(bolge);
        return turkiye;
    }

    //----------ŞEHİR OLUŞTURMA----------
    private static Sehir sehirEkleme(Bolge bolge) {
        Sehir sehir= Sehir.sehirOlusturma("Istanbul",34);
        bolge.sehirler.add(sehir);
        ilceEkleme(sehir);
        return sehir;
    }

    //----------İLÇE OLUŞTURMA----------
    private static Ilce ilceEkleme(Sehir sehir) {
        Ilce ilce = Ilce.ilceOlusturma("Umraniye");
        sehir.ilceler.add(ilce);
        mahalleEkleme(ilce);
        return ilce;
    }

    //----------MAHALLE OLUŞTURMA----------
    private static Mahalle mahalleEkleme(Ilce ilce) {
     Mahalle mahalle = Mahalle.mahalleOlusturma("Dudullu",43121);
     ilce.mahalleler.add(mahalle);
     subeEkleme(mahalle);
     return mahalle;
    }

    //----------ŞUBE OLUŞTURMA----------
    private static Sube subeEkleme(Mahalle mahalle) {
        Sube sube = Sube.subeOlusturma("Sogut Subesi",001);
        mahalle.subeler.add(sube);
        calisanEkleme(sube);
        kasaEkleme(sube);
        reyonEkleme(sube);
        return sube;
    }

    //----------REYON OLUŞTURMA----------
    private static Reyon reyonEkleme(Sube sube) {
        Reyon reyon = Reyon.reyonOlusturma("gida reyonu",20);
        sube.reyonlar.add(reyon);
        urunEkleme(reyon);
        return reyon;
    }

    //----------CALIŞAN OLUŞTURMA----------
    private static Calisan calisanEkleme(Sube sube) {
        Calisan calisan = Calisan.calisanOlusturma("Berat","Darendelioglu","0 552 470 2553",10000,9,sube);
        sube.calisanlar.add(calisan);
        return calisan;
    }

    //----------URUN OLUŞTURMA----------
    private static Urun urunEkleme(Reyon reyon) {
        Urun urun = Urun.urunOlusturma("Makarna","Ankara",1000000);
        reyon.urunler.add(urun);
        return urun;

    }

    //----------KASA OLUŞTURMA----------
    private static Kasa kasaEkleme(Sube sube) {
        Kasa kasa= Kasa.kasaOlusturma(1,sube);
        sube.kasalar.add(kasa);
        return kasa;
    }
}