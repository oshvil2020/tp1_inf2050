import java.io.*;
import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) throws Exception  {

        // class utilities in a fonction: (adress file : String ligne)
        final String CHEMIN_FIC = "file.json";
        StringBuilder ligne= new StringBuilder();
        BufferedReader in = new BufferedReader(new FileReader(CHEMIN_FIC));
        while (in.ready()) {
            ligne.append(in.readLine());
        }
        in.close();
        System.out.println(ligne);

        Gson g = new Gson();

        SanteInput ra = g.fromJson(ligne.toString(), SanteInput.class);
        System.out.println(ra.getClient());
        System.out.println(ra.getReclamations().get(0).getMontant());
        System.out.println(ra.getReclamations().get(1).getSoin());






    }


}
