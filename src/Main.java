import comparisons.Comparables;
import comparisons.number.NumberASComparables;
import comparisons.number.NumberDESComparables;
import comparisons.text.TextASComparables;
import comparisons.text.TextDESComparables;
import sortings.*;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException  {

        Double [] quickSortNumber100k;

        FileWriter fileWriter = new FileWriter("./arquivos/tempos.txt");


        //Instâncias

            //Sorts

                //Bubble
                Bubble <Double> bubbleDouble = new Bubble<Double>();
                Bubble <String> bubbleString = new Bubble<String>();

                //Insertion
                Insertion <Double> insertDouble = new Insertion<Double>();
                Insertion <String> insertString = new Insertion<String>();

                //Insertion
                Selection <Double> selectionDouble = new Selection<Double>();
                Selection <String> selectionString = new Selection<String>();

                //Merge
                Merge<Double> mergeDouble = new Merge<Double>();
                Merge<String> mergeString = new Merge<String>();

<<<<<<< HEAD


            //Quicksort
=======
                //Quicksort
                Quick<Double> quickDouble = new Quick<Double>();
<<<<<<< HEAD
>>>>>>> da07843fa79723aaf6c67bb8e16c54998d91274c
=======
                Quick<String> quickString = new Quick<String>();
>>>>>>> ced5612249c3f77f4431f47e97539f98f5dd6358

                //Comparações

                    //Números

                        //Decrescente
                        Comparables<Double> numDeComp = new NumberDESComparables();

                        //Crescente
                        Comparables<Double> numAsComp = new NumberASComparables();

                    //Texto

                        //Decrescente
                        Comparables<String> textDeComp = new TextDESComparables();

                        //Crescente
                        Comparables<String> textAsComp = new TextASComparables();


        //Leitor do arquivo numeros_100000.txt
<<<<<<< HEAD
        Double[] numeros_100000 = new Double[100000];
=======
        Double[] numeros100k = new Double[100000];
>>>>>>> ced5612249c3f77f4431f47e97539f98f5dd6358
        int aux = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("./arquivos/numeros_100000.txt"));
            while (br.ready()) {
                Double linha = Double.parseDouble(br.readLine());
<<<<<<< HEAD
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
=======
                numeros100k[aux] = linha;
>>>>>>> ced5612249c3f77f4431f47e97539f98f5dd6358
                aux = aux + 1;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

        //Leitor do arquivo numeros_1000000.txt
        Double[] numeros1m = new Double[1000000];
        int aux2 = 0;
        try {
            BufferedReader br2 = new BufferedReader(new FileReader("./arquivos/numeros_1000000.txt"));
            while (br2.ready()) {
                Double linha2 = Double.parseDouble(br2.readLine());
                numeros1m[aux2] = linha2;
                aux2 = aux2 + 1;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

        //Leitor do arquivo palavras_100000.txt
        String[] palavras100k = new String[100000];
        int aux3 = 0;
        try {
            BufferedReader br3 = new BufferedReader(new FileReader("./arquivos/palavras_100000.txt"));
            while (br3.ready()) {
                String linha3 = br3.readLine();
                palavras100k[aux3] = linha3;
                aux3 = aux3 + 1;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

        //Leitor do arquivo palavras_100000.txt
        String[] palavras1m = new String[1000000];
        int aux4 = 0;
        try {
            BufferedReader br4 = new BufferedReader(new FileReader("./arquivos/palavras_1000000.txt"));
            while (br4.ready()) {
                String linha4 = br4.readLine();
                palavras1m[aux4] = linha4;
                aux4 = aux4 + 1;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

        // Bubble Sort - Inicio






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









        // Insert Sort - Fim

        // Selection Sort - Inicio


        // Selection - Fim

        // Merge Sort - Inicio

<<<<<<< HEAD
<<<<<<< HEAD
        //Quick quickSortAsc = new Quick(numeros_100000, new NumberASComparables());
        //quickSortAsc.print(true);

=======
>>>>>>> da07843fa79723aaf6c67bb8e16c54998d91274c
=======

>>>>>>> ced5612249c3f77f4431f47e97539f98f5dd6358
        // Merge Sort - Fim



        // Quick Sort - Inicio

        quickSortNumber100k = numeros100k;

        fileWriter.write(String.valueOf(quickDouble.sort(quickSortNumber100k, numAsComp)) + "ms - QuickSort Numeros100k Asc \n");
        fileWriter.write(String.valueOf(quickDouble.sort(numeros1m, numAsComp))+ "ms - QuickSort Numeros1m Asc \n");
        fileWriter.write(String.valueOf(quickString.sort(palavras100k, textAsComp))+ "ms - QuickSort Palavras1k Asc \n");
        fileWriter.write(String.valueOf(quickString.sort(palavras1m, textAsComp))+ "ms - QuickSort Palavras1m Asc \n");
        
        // Quick Sort - Fim



        fileWriter.close();
    }
}