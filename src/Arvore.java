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
}
