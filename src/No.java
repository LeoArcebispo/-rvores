public class No {
    String valor;
    No FilhoEsquerdo;
    No FilhoDireito;
    int Balanceamento;

    public No(String valor, int balanceamento){
        this.valor = valor;
        FilhoEsquerdo = FilhoDireito = null;
        Balanceamento = balanceamento = 0;
    }
}