package principal;

public class HeapSort {
    private Heap heap;

    public HeapSort(Item v[], int n) {
        this.heap = new Heap(v);
        // @{\it Usa a classe Heap do Programa~\ref{prog:fpheap}}@
        int dir = n;
        heap.constroi(); // @{\it constroi o heap}@
        while (dir > 1) { // @{\it ordena o vetor}@
            Item x = v[1];
            v[1] = v[dir];
            v[dir] = x;
            dir--;
            heap.refaz(1, dir);
        }
    }

    public Heap getHeap() {
        return heap;
    }

    public void setHeap(Heap fpHeap) {
        this.heap = fpHeap;
    }
    
    
}
