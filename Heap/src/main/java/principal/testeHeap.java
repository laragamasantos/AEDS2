package principal;

import java.util.Random;

public class testeHeap {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) { //para cada um dos casos de heap do exercício

            //for externo para cada uma das possíveis quantidades de elementos (10000, 20000, 30000, ..., 100000)
            for (int n = 10000; n <= 100000; n += 10000) {
                Item vetor[] = new Item[n]; //cria vetor de itens

                if (i == 0) { // elementos ordenados de forma crescente
                    //for interno para inserir cada um dos itens consecutivos
                    for (int j = 0; j < n; j++) {
                        Item item = new Item(j);
                        vetor[j] = item;
                    }
                    System.out.println("Elementos ordenados de forma crescente:");
                    System.out.println("nLogn: " + n * (Math.log(n) / Math.log(2)));

                } else if (i == 1) { // elementos ordenados de forma decrescente
                    int aux = n;
                    //for interno para inserir cada um dos itens consecutivos
                    for (int j = 0; j < n; j++) {
                        Item item = new Item(aux);
                        aux--;
                        vetor[j] = item;
                    }
                    System.out.println("Elementos ordenados de forma decrescente:");
                    System.out.println("nLogn: " + n * (Math.log(n) / Math.log(2)));

                } else if (i == 2) { //elementos aleatórios
                    for (int j = 0; j < n; j++) {
                        Random random = new Random();
                        int aleatorio = random.nextInt();//gera valores randômicos
                        Item item = new Item(aleatorio);
                        vetor[j] = item;
                    }
                    System.out.println("Elementos aleatórios:");
                    System.out.println("nLogn: " + n * (Math.log(n) / Math.log(2)));

                }

                HeapSort heapsort = new HeapSort(vetor, n - 1);
                System.out.print("Qntd elementos: " + n);
                System.out.print("    Comparacoes: " + heapsort.getHeap().getComparacoes());//imprime quantidade de comparações
                heapsort.getHeap().setComparacoes(0);
                System.out.println("\n");

            }
            System.out.println("\n");

        }

    }

}
