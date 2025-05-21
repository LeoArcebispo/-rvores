public class Arvore {
    No raiz;

    public int contarNo(No NovoNo){
        if(raiz == null){
            return 0;
        }
        return 1 + contarNo(NovoNo.FilhoEsquerdo) + contarNo(NovoNo.FilhoDireito);
    }
}
