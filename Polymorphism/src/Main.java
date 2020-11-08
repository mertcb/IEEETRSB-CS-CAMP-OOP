public class Main {
    public static void nesneAl(Canli c){
        c.yaz();
    }
    public static void main(String[]args){
        Canli c = new Canli();
        Insan i = new Insan();
        Hayvan h = new Hayvan();
        Bitki b = new Bitki();

        nesneAl(c); // Canlı c = new Canlı
        nesneAl(i); // Canlı c = new İnsan
        nesneAl(h);
        nesneAl(b);
    }
}
