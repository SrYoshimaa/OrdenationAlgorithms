package sort;

//Método com parametro inserido "vet" para receber os dados;
public class Bubble {

    //Precisa colocar de acordo com o arquivo teste.txt;
    public static void bubblesort(int[] vet){
        int aux = 0;
        int i = 0;

        System.out.println("Vetor desordenado: ");
        for(i = 0; i<vet.length; i++){
            System.out.println(" "+vet[i]);
        }
        System.out.println(" ");

        for(i = 0; i<vet.length; i++){
            for(int j = 0; j<vet.length-1; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for(i = 0; i<vet.length; i++){
            System.out.println(" "+vet[i]);
        }
    }
}