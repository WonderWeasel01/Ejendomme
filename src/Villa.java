class Villa extends Ejendom{
    private int rum;
    private double beboedebkvm;
    private double pris;

    public Villa() {
    }

    public Villa(int rum, double beboedebkvm, double pris) {
        this.rum = rum;
        this.beboedebkvm = beboedebkvm;
        this.pris = pris;
    }
    @Override
    double prisPerKvm() {
        return pris / beboedebkvm;
    }

    @Override
    void udskriv() {
        System.out.println(rum);
        System.out.println(beboedebkvm);
        System.out.println(pris);

    }

    public int getRum() {
        return rum;
    }

    public void setRum(int rum) {
        this.rum = rum;
    }

    public double getBeboedebkvm() {
        return beboedebkvm;
    }

    public void setBeboedebkvm(double beboedebkvm) {
        this.beboedebkvm = beboedebkvm;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }


    @Override
    public String toString() {
        return "Villa{" +
                "rum=" + rum +
                ", beboedebkvm=" + beboedebkvm +
                ", pris=" + pris +
                '}';
    }
}