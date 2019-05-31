package tools;

import comparisons.object.Locations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SortFiles {


    public Double[] numeros100k(){
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

        return numeros100k;
    }

    public Double[] numeros1m(){
        Double[] numeros1m = new Double[1000000];
        int aux = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("./arquivos/numeros_1000000.txt"));
            while (br.ready()) {
                Double linha = Double.parseDouble(br.readLine());
                numeros1m[aux] = linha;
                aux = aux + 1;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

        return numeros1m;
    }

    public String[] palavras100k(){
        String[] palavras100k = new String[100000];
        int aux = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("./arquivos/palavras_100000.txt"));
            while (br.ready()) {
                String linha = br.readLine();
                palavras100k[aux] = linha;
                aux = aux + 1;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

        return palavras100k;
    }

    public String[] palavras1m(){
        String[] palavras1m = new String[1000000];
        int aux = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("./arquivos/palavras_1000000.txt"));
            while (br.ready()) {
                String linha = br.readLine();
                palavras1m[aux] = linha;
                aux = aux + 1;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

        return palavras1m;
    }

    public Locations[] objetos100k(){
        Locations[] objetos100k = new Locations[100000];
        int aux = 0;
        String[] aux2;
        try {
            BufferedReader br = new BufferedReader(new FileReader("./arquivos/objetos_100000.txt"));
            while (br.ready()) {
                String linha = br.readLine();
                Locations location = new Locations();
                aux2 = linha.split(" ");
                location.setLatitude(Double.valueOf(aux2[0]));
                location.setLongitude(Double.valueOf(aux2[1]));
                objetos100k[aux] = location;
                aux = aux + 1;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

        return objetos100k;
    }

    public Locations[] objetos1m(){
        Locations[] objetos1m = new Locations[1000000];
        int aux = 0;
        String[] aux2;
        try {
            BufferedReader br = new BufferedReader(new FileReader("./arquivos/objetos_1000000.txt"));
            while (br.ready()) {
                String linha = br.readLine();
                Locations location = new Locations();
                aux2 = linha.split(" ");
                location.setLatitude(Double.valueOf(aux2[0]));
                location.setLongitude(Double.valueOf(aux2[1]));
                objetos1m[aux] = location;
                aux = aux + 1;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

        return objetos1m;
    }
}
