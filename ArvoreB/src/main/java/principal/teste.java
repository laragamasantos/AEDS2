package principal;

public class teste {

    public static void main(String[] args) {

        ArvoreB arvoreOrdem2 = new ArvoreB(2);
        ArvoreB arvoreOrdem4 = new ArvoreB(4);
        ArvoreB arvoreOrdem6 = new ArvoreB(6);

        ArvoreB arvoreAtual = null;

        long tempoInicial;
        long tempoFinal;
        long tempo;

        for (int i = 0; i < 3; i++) {
            tempoInicial = 0;
            tempoFinal = 0;
            tempo = 0;
            if (i == 0) {
                arvoreAtual = arvoreOrdem2;
                System.out.println("Arvore de ordem 2:");
            }
            else if (i == 1) {
                arvoreAtual = arvoreOrdem4;
                System.out.println("Arvore de ordem 4:");

            } else if (i == 2){
                arvoreAtual = arvoreOrdem6;
                System.out.println("Arvore de ordem 6:");

            }

            //for externo para cada uma das possíveis quantidades de elementos ordenados (10000, 20000, 30000, ..., 100000)
            for (int n = 10000; n <= 100000; n += 10000) {

                //for interno para inserir cada um dos itens consecutivos da árvore
                for (int j = 0; j < n; j++) {
                    Item item1 = new Item(j);
                    arvoreAtual.insere(item1);//insere sequência ordenada de itens
                }

                Item itemInexistente1 = new Item(200000);//cria item que não existe na sequência

                tempoInicial = System.nanoTime();
                arvoreAtual.pesquisa(itemInexistente1);//procura item inexistente
                tempoFinal = System.nanoTime();
                tempo = tempoFinal - tempoInicial;//recebe o tempo gasto na comparação
                
                System.out.print("Qntd elementos: " + n);
                System.out.print("    Comparacoes: " + arvoreAtual.getComparacoes());//imprime quantidade de comparações
                arvoreAtual.setComparacoes(0);
                System.out.println("    Tempo(ns): " + tempo);//imprime o tempo gasto na comparação
                System.out.println("\n");
            }
        }

    }
}
