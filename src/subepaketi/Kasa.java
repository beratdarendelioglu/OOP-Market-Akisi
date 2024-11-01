package subepaketi;

public class Kasa {
    public int kasaNum;
    public Sube sube;

    //-------------Sube olusturma methodu-------------//

    public static Kasa kasaOlusturma(int kasaNum,Sube sube){
        Kasa kasa = new Kasa();
        kasa.kasaNum = kasaNum;
        kasa.sube = sube;
        return kasa;
    }

}

