import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Main {
    
	public static void main(String[] args) throws IOException, FileNotFoundException {
        
		final String CHEMIN_FIC = "file.json";
        String ligne;

        BufferedReader in = new BufferedReader(new FileReader(CHEMIN_FIC));

        while (in.ready()) {
            ligne = in.readLine();
            System.out.println(ligne);
        }
        in.close();





    }
}