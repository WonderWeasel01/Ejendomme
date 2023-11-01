class Butik extends Ejendom {
    double beboelsesAreal;
    double butiksAreal;
    double pris;

    public Butik() {
    }

    public Butik(double beboelsesAreal, double butiksAreal, double pris) {
        this.beboelsesAreal = beboelsesAreal;
        this.butiksAreal = butiksAreal;
        this.pris = pris;
    }
    @Override
    double prisPerKvm(){
        return pris / (beboelsesAreal + butiksAreal);
    }
    @Override
    void udskriv() {
        System.out.println(beboelsesAreal);
        System.out.println(butiksAreal);
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

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}