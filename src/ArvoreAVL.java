public class ArvoreAVL {
    No Raiz;

    int altura(No Node){
        if(Node ==null) return 0;
        return Node.altura;
    }

    public int fatorBalanceamento(No No){
        if(No == null) return 0;
        return altura(No.FilhoEsquerdo) - altura(No.FilhoDireito);
    }

    public No inserirNo(No no, int valor) {
        if (no == null) return new No(valor);

        if (valor < no.valor) no.FilhoEsquerdo = inserirNo(no.FilhoEsquerdo, valor);
        else if (valor > no.valor) no.FilhoDireito = inserirNo(no.FilhoDireito, valor);
        else return no;

        no.altura = 1 + Math.max(altura(no.FilhoEsquerdo), altura(no.FilhoDireito));

        int balanceamento = fatorBalanceamento(no);

        if(balanceamento > 1 && valor < no.FilhoEsquerdo.valor) return rotacaoDireita(no);

        if(balanceamento < -1 && valor > no.FilhoDireito.valor) return rotacaoEsquerda(no);

        if(balanceamento > 1 && valor > no.FilhoEsquerdo.valor){
            no.FilhoEsquerdo = rotacaoEsquerda(no.FilhoEsquerdo);
            return rotacaoDireita(no);
        }

        if(balanceamento < -1 && valor < no.FilhoDireito.valor){
            no.FilhoDireito = rotacaoDireita(no.FilhoDireito);
            return rotacaoEsquerda(no);
        }
        return no;
    }

    public No rotacaoDireita(No y) {
        No x = y.FilhoEsquerdo;
        No T2 = x.FilhoDireito;

        x.FilhoDireito = y;
        y.FilhoEsquerdo = T2;

        y.altura = Math.max(altura(y.FilhoEsquerdo), altura(y.FilhoDireito)) + 1;
        x.altura = Math.max(altura(x.FilhoEsquerdo), altura(x.FilhoDireito)) + 1;

        return x;
    }

    public No rotacaoEsquerda(No x) {
        No y = x.FilhoDireito;
        No T2 = y.FilhoEsquerdo;

        y.FilhoEsquerdo = x;
        x.FilhoDireito = T2;

        x.altura = Math.max(altura(x.FilhoEsquerdo), altura(x.FilhoDireito)) + 1;
        y.altura = Math.max(altura(y.FilhoEsquerdo), altura(y.FilhoDireito)) + 1;

        return y;
    }
}
