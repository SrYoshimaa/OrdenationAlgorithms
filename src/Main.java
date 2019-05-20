import java.io.*;

public class Main {

    public static void main(String[] args) {

        // Bubble Sort - Inicio

        // Bubble Sort - Fim

        // Insert Sort - Inicio

        // Insert Sort - Fim

        // Selection Sort - Inicio

        // Selection - Fim

        // Merge Sort - Inicio

        // Merge Sort - Fim

        // Quick Sort - Inicio

        // Quick Sort - Fim

        try{
            BufferedReader br = new BufferedReader(new FileReader("./arquivos/teste.txt"));
            while(br.ready()){
                String linha = br.readLine();
                System.out.println(linha);
            }
        }catch(IOException ioe){
            ioe.printStackTrace();

        }

    }
}
