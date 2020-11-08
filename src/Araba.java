public class Araba {


    // attributelar
    String marka;
    String renk;
    private String sasiNo;
    int hiz;

    /*
        Erişim belirleyiciler

        public => herkese açık
        private => sadece kendi sınıfından erişilebilir
        protected => kendisinden ve sadece kendisinden türetilmiş sınıflardan erişilebilir

     */


    public Araba(int ilkHiz){
        hiz = ilkHiz;
    }

    public void setSasiNo(String sasiNo){
        this.sasiNo = sasiNo;
    }

    public String getSasiNo(){
        return this.sasiNo;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    void calistir(){
        System.out.println("Arabamız Çalıştı, hızınız = " + hiz);
    }

    void gazaBas(){
        hiz = hiz + 10;
        System.out.println("Gaza basılıyor, yeni hız = " + hiz);
    }

    void freneBas(){
        hiz = hiz - 5;
        System.out.println("Frene basılıyor, yeni hız = " + hiz);
    }

    void arabaninOzellikleriniGoster(){
        System.out.println("Arabanın markası= " + marka);
        System.out.println("Arabanın rengi= " + renk);
    }



}
