
package principal;

public class ArvoreBinaria {

    private static class No {

        Item reg;
        No esq, dir;
    }

    private No raiz;
    private int comparacoes=0;

    //busca elemento reg do tipo Item
    private Item pesquisa(Item reg, No p) {
        if (p == null) {
            return null; //Registro nãoo encontrado
        } else if (reg.compara(p.reg) < 0) {
            comparacoes++;
            return pesquisa(reg, p.esq);
        } else if (reg.compara(p.reg) > 0) {
            comparacoes++;
            return pesquisa(reg, p.dir);
        } else {
            return p.reg;
        }
    }

    //insere elemento reg do tipo Item
    private No insere(Item reg, No p) {
        if (p == null) {
            p = new No();
            p.reg = reg;
            p.esq = null;
            p.dir = null;
        } else if (reg.compara(p.reg) < 0) {
            p.esq = insere(reg, p.esq);
        } else if (reg.compara(p.reg) > 0) {
            p.dir = insere(reg, p.dir);
        } else {
            System.out.println("Erro: Registro ja existente");
        }
        return p;
    }
    
    //inicializa a raiz da árvore
    public ArvoreBinaria() {
        this.raiz = null;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public void setComparacoes(int comparacoes) {
        this.comparacoes = comparacoes;
    }
    
    public void insere(Item reg) {
        this.raiz = this.insere(reg, this.raiz);
    }

    public Item pesquisa(Item reg) {
        return this.pesquisa(reg, this.raiz);
    }
    
}
