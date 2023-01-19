import java.util.List;

public class SanteInput {
    private String client;
    private String contrat;
    private String mois;
    private List<Reclamations> reclamations;

//    private String reclamations;


    public SanteInput(String client, String contrat, String mois, List<Reclamations> reclamations) {
        this.client = client;
        this.contrat = contrat;
        this.mois = mois;
        this.reclamations = reclamations;
    }

    public List<Reclamations> getReclamations() {
        return reclamations;
    }

    public void setReclamations(List<Reclamations> reclamations) {
        this.reclamations = reclamations;
    }

    public String getClient() {
        return client;
    }

    public String getContrat() {
        return contrat;
    }

    public String getMois() {
        return mois;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setContrat(String contrat) {
        this.contrat = contrat;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }



}
