import comparisons.Comparables;
import comparisons.number.NumberASComparables;
import comparisons.number.NumberDEComparables;
import comparisons.text.TextASComparables;
import comparisons.text.TextDEComparables;
import sortings.*;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        //Instâncias

            //Sorts

                //Bubble
                Bubble <Double> bubbleDouble = new Bubble<Double>();

                Bubble <String> bubbleString = new Bubble<String>();

                //Merge
                Merge<Double> mergeDouble = new Merge<Double>();

                Merge<String> mergeString = new Merge<String>();

<<<<<<< HEAD


            //Quicksort
=======
                //Quicksort
                Quick<Double> quickDouble = new Quick<Double>();
>>>>>>> da07843fa79723aaf6c67bb8e16c54998d91274c

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
        Double[] numeros_100000 = new Double[100000];
        int aux = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("./arquivos/numeros_100000.txt"));
            while (br.ready()) {
                Double linha = Double.parseDouble(br.readLine());
                numeros_100000[aux] = linha;
                aux = aux + 1;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

        //Leitor do arquivo numeros_100000.txt
        Double[] palavras_100000 = new Double[100000];
        int aux = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("./arquivos/numeros_100000.txt"));
            while (br.ready()) {
                Double linha = Double.parseDouble(br.readLine());
                numeros_100000[aux] = linha;
                aux = aux + 1;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

        // Bubble Sort - Inicio

        // Vetores de teste
        Double array2[] = {7.0,3.0,-9.0,4.0,9.0,4.8};
        String array[] = {"luan","bruna","carlos","lucas","andre"};

        //mergeDouble.quick(array2, numAsComp);

        //mergeString.sort(array, textAsComp);


<<<<<<< HEAD
        //bubbleDouble.sort(numeros_100000, numDeComp);

        //bubbleDouble.sort(numeros_100000, numAsComp);
=======
        //bubbleDouble.quick(numeros, numDeComp);

        //bubbleDouble.quick(numeros, numAsComp);
>>>>>>> da07843fa79723aaf6c67bb8e16c54998d91274c

        //bubbleDouble.quick(array2, numDeComp);

        //bubbleDouble.quick(array2, numAsComp);

        //bubbleString.quick(array, textAsComp);

        //bubbleString.quick(array, textDeComp);






        // Bubble Sort - Fim

        // Insert Sort - Inicio

        /*Double arrayInsert[] = {2.45, 7.87, 10.45, 1.123, 0.132, 787.86, 1.76};

        Insertion <Double> ii = new Insertion<Double>();


        //ii.quick(arrayInsert, numAsComp);

        ii.quick(arrayInsert, numAsComp);*/


        // Insert Sort - Fim

        // Selection Sort - Inicio
        //Double array[] = {2.45, 7.87, 10.45, 1.123, 0.132, 787.86, 1.76};

        Selection<Double> s = new Selection<Double>();

        //s.quick(array, numAsComp);

        // Selection - Fim

        // Merge Sort - Inicio

<<<<<<< HEAD
        //Quick quickSortAsc = new Quick(numeros_100000, new NumberASComparables());
        //quickSortAsc.print(true);

=======
>>>>>>> da07843fa79723aaf6c67bb8e16c54998d91274c
        // Merge Sort - Fim

        //quickDouble.sort(array2, numAsComp);
        System.out.println(quickDouble.sort(numeros, numAsComp));

        // Quick Sort - Inicio


        //qs.quick(array2, numAsComp);
        // Quick Sort - Fim

    }
}