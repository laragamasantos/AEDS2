package principal;

import java.util.Random;

public class teste {

    public static void main(String[] args) {

        //PARTE 1 DO EXERCÍCIO:
        //instancia as árvores e armazena em um vetor
        ArvoreSBB[] arvoresOrdenadas = new ArvoreSBB[10];
        arvoresOrdenadas[0] = new ArvoreSBB();
        arvoresOrdenadas[1] = new ArvoreSBB();
        arvoresOrdenadas[2] = new ArvoreSBB();
        arvoresOrdenadas[3] = new ArvoreSBB();
        arvoresOrdenadas[4] = new ArvoreSBB();
        arvoresOrdenadas[5] = new ArvoreSBB();
        arvoresOrdenadas[6] = new ArvoreSBB();
        arvoresOrdenadas[7] = new ArvoreSBB();
        arvoresOrdenadas[8] = new ArvoreSBB();
        arvoresOrdenadas[9] = new ArvoreSBB();
        int aux = 0;
        
        System.out.println("Numeros consecutivos:");
            
        //for externo para cada uma das possíveis quantidades de elementos ordenados (10000, 20000, 30000, ..., 100000)
        for (int n = 10000; n <= 100000; n += 10000) {

            //for interno para inserir cada um dos itens consecutivos da árvore
            for (int i = 0; i < n; i++) {
                Item item1 = new Item(i);
                arvoresOrdenadas[aux].insere(item1);//insere sequência ordenada de itens
            }
            
            Item itemInexistente1 = new Item(200000);//cria item que não existe na sequência
            
            long tempoInicial = System.nanoTime();
            arvoresOrdenadas[aux].pesquisa(itemInexistente1);//procura item inexistente
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
        ArvoreSBB[] arvoresAleatorias = new ArvoreSBB[10];
        arvoresAleatorias[0] = new ArvoreSBB();
        arvoresAleatorias[1] = new ArvoreSBB();
        arvoresAleatorias[2] = new ArvoreSBB();
        arvoresAleatorias[3] = new ArvoreSBB();
        arvoresAleatorias[4] = new ArvoreSBB();
        arvoresAleatorias[5] = new ArvoreSBB();
        arvoresAleatorias[6] = new ArvoreSBB();
        arvoresAleatorias[7] = new ArvoreSBB();
        arvoresAleatorias[8] = new ArvoreSBB();
        arvoresAleatorias[9] = new ArvoreSBB();

        
        System.out.println("\nNumeros aleatorios:");
       
        for (int n = 10000; n <= 100000; n += 10000) {

            //for interno para inserir cada um dos itens consecutivos da árvore
            for (int i = 0; i < n; i++) {
                Random random = new Random();
                int aleatorio = random.nextInt();//gera valores randômicos
                
                Item item2 = new Item(aleatorio);
                arvoresAleatorias[aux].insere(item2);
            }
            
            Item itemInexistente2 = new Item(2);//cria item que não existe na sequência

            long tempoInicial = System.nanoTime();
            arvoresAleatorias[aux].pesquisa(itemInexistente2);//procura item inexistente
            long tempoFinal = System.nanoTime();
            long tempo = tempoFinal - tempoInicial;//recebe o tempo gasto na comparação
            
            System.out.print("Comparacoes: " + arvoresAleatorias[aux].getComparacoes());//imprime quantidade de comparações
            arvoresAleatorias[aux].setComparacoes(0);
            
            System.out.println("    Tempo(ns): " + tempo);//imprime o tempo gasto na comparação
            
            aux++;//para percorrer todas as árvores
        }
    }
}
