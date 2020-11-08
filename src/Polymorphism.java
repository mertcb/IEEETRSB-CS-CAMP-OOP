public class Polymorphism {
    public static void nesneAl(UstClass nesne){
        nesne.yaz();
    }

    public static void main(String[]args){
        UstClass u1 = new UstClass();
        AltSinif1 a1 = new AltSinif1();
        AltSinif2 a2 = new AltSinif2();

        nesneAl(u1);
        nesneAl(a1);
        nesneAl(a2);

    }
}
