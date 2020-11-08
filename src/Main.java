public class Main {
    /*
        encapsulation

        kalıtım ( inheritance )

        çok biçimlilik ( polymorphism )

        abstraction

        instance
     */

    public static void main(String[]args){

        /*Insan mert = new Insan(); // bir instance

        mert.boy = 1.75;
        mert.cinsiyet = "Erkek";
        mert.yas = 20;

        Araba ford = new Araba(10);

        ford.setMarka("ford");
        ford.setHiz(0);
        ford.setRenk("Siyah");
        ford.setSasiNo("ABJSXF");

        ford.marka = "Ford";*/

        //MuhabbetKusu muhabbetKusu = new MuhabbetKusu();

        //muhabbetKusu.sesCikar();

        /*Kedi kedi = new Kedi();
        Kopek kopek = new Kopek();

        kedi.sesCikar();
        kopek.sesCikar();
        */

        /*Canli canli = new Canli();
        canli.adSoyle();
        Hayvan hayvan = new Hayvan();
        hayvan.adSoyle();
        Omurgali omurgali = new Omurgali();
        omurgali.adSoyle();
        Omurgasiz omurgasiz = new Omurgasiz();
        omurgasiz.adSoyle();*/

        /*Canli canli1 = new Hayvan(); // upcasting
        canli1.adSoyle();
        Hayvan omurgali1 = new Omurgali();
        omurgali1.adSoyle();
        Hayvan omurgasiz1 = new Omurgasiz();
        omurgasiz1.adSoyle();*/

        Canli canli2 = new Omurgali();
        // sub-class ve super-class

        Omurgali omurgali2 = new Omurgali();
        Hayvan hayvan2 = omurgali2; // upcasting
        hayvan2.adSoyle();
        Omurgali o2 = (Omurgali)hayvan2; // downcasting
        o2.adSoyle();



    }
}
