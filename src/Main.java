import comparisons.Comparables;
import comparisons.number.NumberASComparables;
import comparisons.number.NumberDESComparables;
import comparisons.object.Locations;
import comparisons.object.ObjectASComparables;
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

        // Quick Sort - Fim



        fileWriter.close();
    }
}