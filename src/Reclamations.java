class Reclamations {
    private String soin;
    private String date;
    private String montant;

    public Reclamations(String soin, String date, String montant) {
        System.out.println(soin + date+montant);
        this.soin = soin;
        this.date = date;
        this.montant = montant;
    }

    public String getSoin() {
        return soin;
    }

    public void setSoin(String soin) {
        this.soin = soin;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }
}