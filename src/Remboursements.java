public abstract class Remboursements {
    protected String soin;
    protected String date;
    protected String montant;

    public Remboursements(String soin, String date, String montant) {
        this.soin = soin;
        this.date = date;
        this.montant = montant;
    }
    public Remboursements(Reclamations reclamations){
        this.date = reclamations.getDate();
        this.montant = reclamations.getMontant();
        this.soin = reclamations.getSoin();
    }
    public abstract void calculateRemboursement ();


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
