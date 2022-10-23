package principal;

import java.util.Random;

public class main {

    public static void main(String[] args) {

        //PARTE 1 DO EXERCÍCIO:
        //instancia as árvores e armazena em um vetor
        ArvoreBinaria[] arvoresOrdenadas = new ArvoreBinaria[9];
        arvoresOrdenadas[0] = new ArvoreBinaria();
        arvoresOrdenadas[1] = new ArvoreBinaria();
        arvoresOrdenadas[2] = new ArvoreBinaria();
        arvoresOrdenadas[3] = new ArvoreBinaria();
        arvoresOrdenadas[4] = new ArvoreBinaria();
        arvoresOrdenadas[5] = new ArvoreBinaria();
        arvoresOrdenadas[6] = new ArvoreBinaria();
        arvoresOrdenadas[7] = new ArvoreBinaria();
        arvoresOrdenadas[8] = new ArvoreBinaria();
        int aux=0;
        
        System.out.println("Numeros consecutivos:");
            
        //for externo para cada uma das possíveis quantidades de elementos ordenados (1000, 2000, 3000, ..., 9000)
        for (int n = 1000; n <= 9000; n += 1000) {

            //for interno para inserir cada um dos itens consecutivos da árvore
            for (int i = 0; i < n; i++) {
                Item item = new Item(i);
                arvoresOrdenadas[aux].insere(item);//insere sequência ordenada de itens
            }
            
            Item itemInexistente = new Item(20000);//cria item que não existe na sequência
            
            long tempoInicial = System.nanoTime();
            arvoresOrdenadas[aux].pesquisa(itemInexistente);//procura item inexistente
            long tempoFinal = System.nanoTime();
            long tempo = tempoFinal - tempoInicial;//recebe o tempo gasto na comparação
            
            System.out.print("Comparacoes: " + arvoresOrdenadas[aux].getComparacoes());//imprime quantidade de comparações
            arvoresOrdenadas[aux].setComparacoes(0);
            
            System.out.println("    Tempo(ns): " + tempo);//imprime o tempo gasto na comparação
            
            aux++;//para percorrer todas as árvores
        }
        aux = 0;
        
        //PARTE 2 DO EXERCÍCIO      
        
        //instancia as árvores e armazena em um vetor
        ArvoreBinaria[] arvoresAleatorias = new ArvoreBinaria[9];
        arvoresAleatorias[0] = new ArvoreBinaria();
        arvoresAleatorias[1] = new ArvoreBinaria();
        arvoresAleatorias[2] = new ArvoreBinaria();
        arvoresAleatorias[3] = new ArvoreBinaria();
        arvoresAleatorias[4] = new ArvoreBinaria();
        arvoresAleatorias[5] = new ArvoreBinaria();
        arvoresAleatorias[6] = new ArvoreBinaria();
        arvoresAleatorias[7] = new ArvoreBinaria();
        arvoresAleatorias[8] = new ArvoreBinaria();
        
        System.out.println("\nNumeros aleatorios:");
       
        for (int n = 1000; n <= 9000; n += 1000) {

            //for interno para inserir cada um dos itens consecutivos da árvore
            for (int i = 0; i < n; i++) {
                Random random = new Random();
                Integer aleatorio = random.nextInt();//gera valores randômicos
            
                Item item = new Item(aleatorio);
                arvoresAleatorias[aux].insere(item);//insere sequência ordenada de itens
            }
            
            Item itemInexistente = new Item(30001);//cria item que não existe na sequência

            long tempoInicial = System.nanoTime();
            arvoresAleatorias[aux].pesquisa(itemInexistente);//procura item inexistente
            long tempoFinal = System.nanoTime();
            long tempo = tempoFinal - tempoInicial;//recebe o tempo gasto na comparação
            
            System.out.print("Comparacoes: " + arvoresAleatorias[aux].getComparacoes());//imprime quantidade de comparações
            arvoresAleatorias[aux].setComparacoes(0);
            
            System.out.println("    Tempo(ns): " + tempo);//imprime o tempo gasto na comparação
            
            aux++;//para percorrer todas as árvores
        }
    }
}
