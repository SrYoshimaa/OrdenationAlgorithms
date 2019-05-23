import java.io.*;
import java.util.ArrayList;

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

        ArrayList<Float> numeros = new ArrayList<Float>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("./arquivos/teste.txt"));
            while (br.ready()) {
                Float linha = Float.parseFloat(br.readLine());
                numeros.add(linha);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
        System.out.println(numeros);
        numeros.set(2,(float) 9.12);        // Seta o valor no arrayList com base no index e o valor passado.
        System.out.println(numeros);
        System.out.println(numeros.get(0));  // Pegar numero do arrayList com base no index passado no .get()
    }
}