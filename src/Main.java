import comparisons.Comparables;
import comparisons.numbers.NumberASComparables;
import comparisons.numbers.NumberDEComparables;
import comparisons.text.TextASComparables;
import comparisons.text.TextDEComparables;
import sortings.Bubble;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        //Instâncias

            //Comparações

                //Números
                Comparables<Double> numDeComp = new NumberDEComparables();
                Comparables<Double> numAsComp = new NumberASComparables();
                Comparables<String> textDeComp = new TextDEComparables();
                Comparables<String> textAsComp = new TextASComparables();





        //ArrayList<Float> numeros = new ArrayList<Float>();

        Double[] numeros = new Double[100000];
        int aux = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("./arquivos/numeros_100000.txt"));
            while (br.ready()) {
                Double linha = Double.parseDouble(br.readLine());
                numeros[aux] = linha;
                aux = aux + 1;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
        /*
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
        */

        /*
        System.out.println(numeros);
        numeros.set(2,(float) 9.12);        // Seta o valor no arrayList com base no index e o valor passado.
        System.out.println(numeros);
        System.out.println(numeros.get(0));  // Pegar numero do arrayList com base no index passado no .get()
        */

        // Bubble Sort - Inicio

        // Vetor de Teste
        String array[] = {"luan","bruna","carlos","lucas","andre"};
        Bubble <Double> bbD = new Bubble<Double>();

        Bubble <String> bb = new Bubble<String>();


        //bb.sort(numeros, numDeComp);

        bb.sort(array, textAsComp);





        // Bubble Sort - Fim

        // Insert Sort - Inicio

        // Insert Sort - Fim

        // Selection Sort - Inicio

        // Selection - Fim

        // Merge Sort - Inicio

        // Merge Sort - Fim

        // Quick Sort - Inicio

        // Quick Sort - Fim




    }


}