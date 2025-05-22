import java.util.LinkedList;
import java.util.Queue;

public class Arvore {
    No Raiz;

    public int contarNo(No Node){
        if(Node == null){
            return 0;
        }
        return 1 + contarNo(Node.FilhoEsquerdo) + contarNo(Node.FilhoDireito);
    }

    public void percorrerEmOrdem(No Node){
        if(Node != null){
            percorrerEmOrdem(Node.FilhoEsquerdo);
            System.out.println(Node.valor + " ");
            percorrerEmOrdem(Node.FilhoDireito);
        }
    }

    public void percorrerPreOrdem(No Node){
        if(Node != null){
            System.out.println(Node.valor + " ");
            percorrerPreOrdem(Node.FilhoEsquerdo);
            percorrerPreOrdem(Node.FilhoDireito);
        }
    }

    public void percorrerPosOrdem(No Node){
        if(Node != null){
            percorrerPosOrdem(Node.FilhoEsquerdo);
            percorrerPosOrdem(Node.FilhoDireito);
            System.out.println(Node.valor + " ");
        }
    }

    public void percorrerEmNivel(){
        if(Raiz == null) return;

        Queue<No> fila = new LinkedList<>();
        fila.add(Raiz);

        while(!fila.isEmpty()){
            No atual = fila.poll();
            System.out.println(atual.valor + " ");

            if (atual.FilhoEsquerdo != null) fila.add(atual.FilhoEsquerdo);
            if (atual.FilhoDireito != null) fila.add(atual.FilhoDireito);
        }
    }

    public void contarNoNaoRecursivo(No Node){
        int contador = 0;
        if(Raiz == null){
            System.out.println("Não há nós na Árvore");
        } else {
            while (Node != null){

            }
        }
    }
}
