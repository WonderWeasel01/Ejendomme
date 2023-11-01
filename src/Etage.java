class Etage extends Ejendom{
    double beboelsesAreal;
    double butiksAreal;
    int antalEtager;
    double pris;

    public Etage() {
    }

    public Etage(double beboelsesAreal, double butiksAreal, int antalEtager, double pris) {
        this.beboelsesAreal = beboelsesAreal;
        this.butiksAreal = butiksAreal;
        this.antalEtager = antalEtager;
        this.pris = pris;
    }
    @Override
    double prisPerKvm(){
        return pris / (beboelsesAreal + butiksAreal);
    }
    @Override
    void udskriv(){
        System.out.println(beboelsesAreal);
        System.out.println(butiksAreal);
        System.out.println(antalEtager);
        System.out.println(pris);

    }

    public double getBeboelsesAreal() {
        return beboelsesAreal;
    }

    public void setBeboelsesAreal(double beboelsesAreal) {
        this.beboelsesAreal = beboelsesAreal;
    }

    public double getButiksAreal() {
        return butiksAreal;
    }

    public void setButiksAreal(double butiksAreal) {
        this.butiksAreal = butiksAreal;
    }

    public int getAntalEtager() {
        return antalEtager;
    }

    public void setAntalEtager(int antalEtager) {
        this.antalEtager = antalEtager;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}