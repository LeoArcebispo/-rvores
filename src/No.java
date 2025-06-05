public class No {
    int valor;
    No FilhoEsquerdo;
    No FilhoDireito;
    int altura;

    public No(int valor){
        this.valor = valor;
        FilhoEsquerdo = FilhoDireito = null;
        altura = 1;
    }
}