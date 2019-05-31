import comparisons.Comparables;
import comparisons.number.NumberASComparables;
import comparisons.number.NumberDESComparables;
<<<<<<< HEAD
import comparisons.object.Locations;
import comparisons.object.ObjectASComparables;
=======
import comparisons.object.Location;
>>>>>>> 8b1578bbc85a1035fb85e2ee43cb7e0064da7737
import comparisons.object.ObjectDEComparables;
import comparisons.text.TextASComparables;
import comparisons.text.TextDESComparables;
import sortings.*;
import tools.SortFiles;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException  {

        FileWriter fileWriter = new FileWriter("./arquivos/tempos.txt");

        SortFiles sortFiles = new SortFiles();

        //Instâncias

<<<<<<< HEAD
        //Sorts
=======
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

                //Quicksort
                Quick<Double> quickDouble = new Quick<Double>();
                Quick<String> quickString = new Quick<String>();

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

                    //Objetos
                        //Decrescente
                        Comparables<Location> objDESCCom = new ObjectDEComparables();
                        //Crescente
                        Comparables<Location> objASCCom = new ObjectDEComparables();



        //Leitor do arquivo numeros_100000.txt
        Double[] numeros100k = new Double[100000];
        int aux = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("./arquivos/numeros_100000.txt"));
            while (br.ready()) {
                Double linha = Double.parseDouble(br.readLine());
                numeros100k[aux] = linha;
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
>>>>>>> 8b1578bbc85a1035fb85e2ee43cb7e0064da7737

        //Bubble
        Bubble <Double> bubbleDouble = new Bubble<Double>();
        Bubble <String> bubbleString = new Bubble<String>();
        Bubble <Locations> bubbleLocation = new Bubble<Locations>();

        //Insertion
        Insertion <Double> insertDouble = new Insertion<Double>();
        Insertion <String> insertString = new Insertion<String>();
        Insertion <Locations> insertLocation = new Insertion<Locations>();

        //Insertion
        Selection <Double> selectionDouble = new Selection<Double>();
        Selection <String> selectionString = new Selection<String>();
        Selection <Locations> selectionLocation = new Selection<Locations>();

        //Merge
        Merge<Double> mergeDouble = new Merge<Double>();
        Merge<String> mergeString = new Merge<String>();
        Merge<Locations> mergeLocation = new Merge<Locations>();

        //Quicksort
        Quick<Double> quickDouble = new Quick<Double>();
        Quick<String> quickString = new Quick<String>();
        Quick<Locations> quickLocation = new Quick<Locations>();

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

        //Objetos (localização)

        //Descrescente
        Comparables<Locations> locDeComp = new ObjectDEComparables();

        //Crescente
        Comparables<Locations> locAsComp = new ObjectASComparables();



        // Bubble Sort - Inicio


        fileWriter.write(String.valueOf(bubbleDouble.sort(sortFiles.numeros100k(), numAsComp)) + "ms - BubbleSort Numeros100k Asc \n");
        fileWriter.write(String.valueOf(bubbleDouble.sort(sortFiles.numeros100k(), numDeComp)) + "ms - BubbleSort Numeros100k Dec \n");
        fileWriter.write(String.valueOf(bubbleDouble.sort(sortFiles.numeros1m(), numAsComp)) + "ms - BubbleSort Numeros1m Asc \n");
        fileWriter.write(String.valueOf(bubbleDouble.sort(sortFiles.numeros1m(), numDeComp)) + "ms - BubbleSort Numeros1m Dec \n");

        fileWriter.write(String.valueOf(bubbleString.sort(sortFiles.palavras100k(), textAsComp)) + "ms - BubbleSort Palavras100k Asc \n");
        fileWriter.write(String.valueOf(bubbleString.sort(sortFiles.palavras100k(), textDeComp)) + "ms - BubbleSort Palavras100k Dec \n");
        fileWriter.write(String.valueOf(bubbleString.sort(sortFiles.palavras1m(), textAsComp)) + "ms - BubbleSort Palavras1m Asc \n");
        fileWriter.write(String.valueOf(bubbleString.sort(sortFiles.palavras1m(), textDeComp)) + "ms - BubbleSort Palavras1m Dec \n");

        fileWriter.write(String.valueOf(bubbleLocation.sort(sortFiles.objetos100k(), locAsComp)) + "ms - BubbleSort Objetos100k Asc \n");
        fileWriter.write(String.valueOf(bubbleLocation.sort(sortFiles.objetos100k(), locDeComp)) + "ms - BubbleSort Objetos100k Dec \n");
        fileWriter.write(String.valueOf(bubbleLocation.sort(sortFiles.objetos1m(), locAsComp)) + "ms - BubbleSort Objetos100k Asc \n");
        fileWriter.write(String.valueOf(bubbleLocation.sort(sortFiles.objetos1m(), locDeComp)) + "ms - BubbleSort Objetos100k Dec \n");

        // Bubble Sort - Fim



        // Insert Sort - Inicio

        fileWriter.write(String.valueOf(insertDouble.sort(sortFiles.numeros100k(), numAsComp)) + "ms - InsertSort Numeros100k Asc \n");
        fileWriter.write(String.valueOf(insertDouble.sort(sortFiles.numeros100k(), numDeComp)) + "ms - InsertSort Numeros100k Dec \n");
        fileWriter.write(String.valueOf(insertDouble.sort(sortFiles.numeros1m(), numAsComp)) + "ms - InsertSort Numeros1m Asc \n");
        fileWriter.write(String.valueOf(insertDouble.sort(sortFiles.numeros1m(), numDeComp)) + "ms - InsertSort Numeros1m Dec \n");

        fileWriter.write(String.valueOf(insertString.sort(sortFiles.palavras100k(), textAsComp)) + "ms - InsertSort Palavras100k Asc \n");
        fileWriter.write(String.valueOf(insertString.sort(sortFiles.palavras100k(), textDeComp)) + "ms - InsertSort Palavras100k Dec \n");
        fileWriter.write(String.valueOf(insertString.sort(sortFiles.palavras1m(), textAsComp)) + "ms - InsertSort Palavras1m Asc \n");
        fileWriter.write(String.valueOf(insertString.sort(sortFiles.palavras1m(), textDeComp)) + "ms - InsertSort Palavras1m Dec \n");

        fileWriter.write(String.valueOf(insertLocation.sort(sortFiles.objetos100k(), locAsComp)) + "ms - InsertSort Objetos100k Asc \n");
        fileWriter.write(String.valueOf(insertLocation.sort(sortFiles.objetos100k(), locDeComp)) + "ms - InsertSort Objetos100k Dec \n");
        fileWriter.write(String.valueOf(insertLocation.sort(sortFiles.objetos1m(), locAsComp)) + "ms - InsertSort Objetos100k Asc \n");
        fileWriter.write(String.valueOf(insertLocation.sort(sortFiles.objetos1m(), locDeComp)) + "ms - InsertSort Objetos100k Dec \n");

        // Insert Sort - Fim



        // Selection Sort - Inicio

        fileWriter.write(String.valueOf(selectionDouble.sort(sortFiles.numeros100k(), numAsComp)) + "ms - SelectionSort Numeros100k Asc \n");
        fileWriter.write(String.valueOf(selectionDouble.sort(sortFiles.numeros100k(), numDeComp)) + "ms - SelectionSort Numeros100k Dec \n");
        fileWriter.write(String.valueOf(selectionDouble.sort(sortFiles.numeros1m(), numAsComp)) + "ms - SelectionSort Numeros1m Asc \n");
        fileWriter.write(String.valueOf(selectionDouble.sort(sortFiles.numeros1m(), numDeComp)) + "ms - SelectionSort Numeros1m Dec \n");

        fileWriter.write(String.valueOf(selectionString.sort(sortFiles.palavras100k(), textAsComp)) + "ms - SelectionSort Palavras100k Asc \n");
        fileWriter.write(String.valueOf(selectionString.sort(sortFiles.palavras100k(), textDeComp)) + "ms - SelectionSort Palavras100k Dec \n");
        fileWriter.write(String.valueOf(selectionString.sort(sortFiles.palavras1m(), textAsComp)) + "ms - SelectionSort Palavras1m Asc \n");
        fileWriter.write(String.valueOf(selectionString.sort(sortFiles.palavras1m(), textDeComp)) + "ms - SelectionSort Palavras1m Dec \n");

        fileWriter.write(String.valueOf(selectionLocation.sort(sortFiles.objetos100k(), locAsComp)) + "ms - SelectionSort Objetos100k Asc \n");
        fileWriter.write(String.valueOf(selectionLocation.sort(sortFiles.objetos100k(), locDeComp)) + "ms - SelectionSort Objetos100k Dec \n");
        fileWriter.write(String.valueOf(selectionLocation.sort(sortFiles.objetos1m(), locAsComp)) + "ms - SelectionSort Objetos100k Asc \n");
        fileWriter.write(String.valueOf(selectionLocation.sort(sortFiles.objetos1m(), locDeComp)) + "ms - SelectionSort Objetos100k Dec \n");

        // Selection - Fim



        // Merge Sort - Inicio

        fileWriter.write(String.valueOf(mergeDouble.sort(sortFiles.numeros100k(), numAsComp)) + "ms - MergeSort Numeros100k Asc \n");
        fileWriter.write(String.valueOf(mergeDouble.sort(sortFiles.numeros100k(), numDeComp)) + "ms - MergeSort Numeros100k Dec \n");
        fileWriter.write(String.valueOf(mergeDouble.sort(sortFiles.numeros1m(), numAsComp)) + "ms - MergeSort Numeros1m Asc \n");
        fileWriter.write(String.valueOf(mergeDouble.sort(sortFiles.numeros1m(), numDeComp)) + "ms - MergeSort Numeros1m Dec \n");

        fileWriter.write(String.valueOf(mergeString.sort(sortFiles.palavras100k(), textAsComp)) + "ms - MergeSort Palavras100k Asc \n");
        fileWriter.write(String.valueOf(mergeString.sort(sortFiles.palavras100k(), textDeComp)) + "ms - MergeSort Palavras100k Dec \n");
        fileWriter.write(String.valueOf(mergeString.sort(sortFiles.palavras1m(), textAsComp)) + "ms - MergeSort Palavras1m Asc \n");
        fileWriter.write(String.valueOf(mergeString.sort(sortFiles.palavras1m(), textDeComp)) + "ms - MergeSort Palavras1m Dec \n");

        fileWriter.write(String.valueOf(mergeLocation.sort(sortFiles.objetos100k(), locAsComp)) + "ms - MergeSort Objetos100k Asc \n");
        fileWriter.write(String.valueOf(mergeLocation.sort(sortFiles.objetos100k(), locDeComp)) + "ms - MergeSort Objetos100k Dec \n");
        fileWriter.write(String.valueOf(mergeLocation.sort(sortFiles.objetos1m(), locAsComp)) + "ms - MergeSort Objetos100k Asc \n");
        fileWriter.write(String.valueOf(mergeLocation.sort(sortFiles.objetos1m(), locDeComp)) + "ms - MergeSort Objetos100k Dec \n");

        // Merge Sort - Fim



        // Quick Sort - Inicio

<<<<<<< HEAD
        fileWriter.write(String.valueOf(quickDouble.sort(sortFiles.numeros100k(), numAsComp)) + "ms - QuickSort Numeros100k Asc \n");
        fileWriter.write(String.valueOf(quickDouble.sort(sortFiles.numeros100k(), numDeComp)) + "ms - QuickSort Numeros100k Dec \n");
        fileWriter.write(String.valueOf(quickDouble.sort(sortFiles.numeros1m(), numAsComp)) + "ms - QuickSort Numeros1m Asc \n");
        fileWriter.write(String.valueOf(quickDouble.sort(sortFiles.numeros1m(), numDeComp)) + "ms - QuickSort Numeros1m Dec \n");

        fileWriter.write(String.valueOf(quickString.sort(sortFiles.palavras100k(), textAsComp)) + "ms - QuickSort Palavras100k Asc \n");
        fileWriter.write(String.valueOf(quickString.sort(sortFiles.palavras100k(), textDeComp)) + "ms - QuickSort Palavras100k Dec \n");
        fileWriter.write(String.valueOf(quickString.sort(sortFiles.palavras1m(), textAsComp)) + "ms - QuickSort Palavras1m Asc \n");
        fileWriter.write(String.valueOf(quickString.sort(sortFiles.palavras1m(), textDeComp)) + "ms - QuickSort Palavras1m Dec \n");

        fileWriter.write(String.valueOf(quickLocation.sort(sortFiles.objetos100k(), locAsComp)) + "ms - QuickSort Objetos100k Asc \n");
        fileWriter.write(String.valueOf(quickLocation.sort(sortFiles.objetos100k(), locDeComp)) + "ms - QuickSort Objetos100k Dec \n");
        fileWriter.write(String.valueOf(quickLocation.sort(sortFiles.objetos1m(), locAsComp)) + "ms - QuickSort Objetos100k Asc \n");
        fileWriter.write(String.valueOf(quickLocation.sort(sortFiles.objetos1m(), locDeComp)) + "ms - QuickSort Objetos100k Dec \n");

=======

        
>>>>>>> 8b1578bbc85a1035fb85e2ee43cb7e0064da7737
        // Quick Sort - Fim



        fileWriter.close();
    }
}