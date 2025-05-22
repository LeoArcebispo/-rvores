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
}
