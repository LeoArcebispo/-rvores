public class No {
    String valor;
    No FilhoEsquerdo;
    No FilhoDireito;

    public No(String valor){
        this.valor = valor;
        FilhoEsquerdo = FilhoDireito = null;
    }
}