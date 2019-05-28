import comparisons.Comparables;
import comparisons.number.NumberASComparables;
import comparisons.number.NumberDEComparables;
import comparisons.text.TextASComparables;
import comparisons.text.TextDEComparables;
import sortings.Bubble;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        //Instâncias

            //Sorts

                //Bubble
                Bubble <Double> bbD = new Bubble<Double>();

                Bubble <String> bbS = new Bubble<String>();

            //Comparações

                //Números

                    //Decrescente
                    Comparables<Double> numDeComp = new NumberDEComparables();

                    //Crescente
                    Comparables<Double> numAsComp = new NumberASComparables();

                //Texto

                    //Decrescente
                    Comparables<String> textDeComp = new TextDEComparables();

                    //Crescente
                    Comparables<String> textAsComp = new TextASComparables();


        //Leitor do arquivo numeros_100000.txt
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

        // Bubble Sort - Inicio

        // Vetores de teste
        Double array2[] = {7.0,3.0,-9.0,4.0,9.0,4.8};
        String array[] = {"luan","bruna","carlos","lucas","andre"};



        //bb.sort(numeros, numDeComp);

        //bbD.sort(array2, numDeComp);

        //bbD.sort(array2, numAsComp);

        //bbS.sort(array, textAsComp);

        //bbS.sort(array, textDeComp);






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