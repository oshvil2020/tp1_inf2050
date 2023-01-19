import java.util.List;

public class SanteOutPut {
    private String client;
    private String mois;
    private List<Remboursements> remboursements;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public List<Remboursements> getRemboursements() {
        return remboursements;
    }

    public void setRemboursements(List<Remboursements> remboursements) {
        this.remboursements = remboursements;
    }

    public SanteOutPut(String client, String mois, List<Remboursements> remboursements) {
        this.client = client;
        this.mois = mois;
        this.remboursements = remboursements;
    }
}
