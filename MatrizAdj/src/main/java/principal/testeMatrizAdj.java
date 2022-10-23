
package principal;

public class testeMatrizAdj {


    public static void main(String[] args) {
        //CASO 1:
        XGrafo grafo1 = new XGrafo(8, 12); //grafo com 8 vertices e 12 arestas
        
        grafo1.insereAresta(0, 1, 1);
        grafo1.insereAresta(1, 2, 1);
        grafo1.insereAresta(2, 3, 1);
        grafo1.insereAresta(3, 0, 1);
        grafo1.insereAresta(4, 5, 1);
        grafo1.insereAresta(5, 6, 1);
        grafo1.insereAresta(6, 7, 1);
        grafo1.insereAresta(7, 4, 1);
        grafo1.insereAresta(0, 4, 1);
        grafo1.insereAresta(1, 5, 1);
        grafo1.insereAresta(2, 6, 1);
        grafo1.insereAresta(3, 7, 1);
        
        XCiclo ciclo1 = new XCiclo(grafo1);
        ciclo1.buscaEmProfundidade();
        
        if(ciclo1.isCiclico()){
            System.out.println("O grafo 1 é cíclico"); //aresta de retorno (cinza) foi encontrada
        }
        else{
            System.out.println("O grafo 1 não é cíclico");
        }
        
        
        //CASO 2:
        XGrafo grafo2 = new XGrafo(10, 14); //grafo com 10 vertices e 14 arestas
        
        grafo2.insereAresta(0, 5, 1);
        grafo2.insereAresta(1, 2, 1);
        grafo2.insereAresta(2, 4, 1);
        grafo2.insereAresta(4, 6, 1);
        grafo2.insereAresta(6, 7, 1);
        grafo2.insereAresta(7, 8, 1);
        grafo2.insereAresta(9, 6, 1);
        grafo2.insereAresta(0, 2, 1);
        grafo2.insereAresta(0, 1, 1);
        grafo2.insereAresta(0, 3, 1);
        grafo2.insereAresta(5, 4, 1);
        grafo2.insereAresta(5, 6, 1);
        grafo2.insereAresta(2, 3, 1);
        grafo2.insereAresta(6, 8, 1);
        
        XCiclo ciclo2 = new XCiclo(grafo2);
        ciclo2.buscaEmProfundidade();
        
        if(ciclo2.isCiclico()){
            System.out.println("O grafo 2 é cíclico"); //aresta de retorno (cinza) foi encontrada
        }
        else{
            System.out.println("O grafo 2 não é cíclico");
        }
        
    }
    
}
