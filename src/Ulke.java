import java.util.ArrayList;
import java.util.List;

public class Ulke {
    public String adi;
    public int nufusu;
    public static List <Bolge> bolgeler;



public static Ulke ulkeOlusturma(String adi, int nufusu){
    Ulke ulke = new Ulke();
    ulke.adi = adi;
    ulke.nufusu = nufusu;
    ulke.bolgeler = new ArrayList<>();
    return ulke;
}
}