public class ArvoreRB {
    private Node raiz;
    private final Node Nil;

    public ArvoreRB(){
        Nil = new Node(-1);
        Nil.cor = Color.BLACK;
        Nil.esquerdo = Nil.direito = Nil.pai = null;
        raiz = null;
    }

    public void inserir(int key){
        Node node = new Node(key);
        node.esquerdo = node.direito = node.pai = Nil;

        Node y = null;
        Node x = raiz;

        while(x != Nil){
            y = x;
            if(node.key < x.key) x = x.esquerdo;
            else x = x.direito;
        }

        node.pai = y;
        if(y == null) raiz = node;
        else if(node.key < y.key) y.esquerdo = node;
        else y.direito = node;

        node.esquerdo = Nil;
        node.direito = Nil;
        node.cor = Color.RED;

        insertFix(node);
    }

    private void insertFix(Node k){
        while(k.pai != null && k.pai.cor == Color.RED){
            if(k.pai == k.pai.pai.esquerdo){
                Node u = k.pai.pai.direito;
                if(u.cor ==Color.RED){
                    k.pai.cor = Color.BLACK;
                    u.cor = Color.BLACK;
                    k.pai.pai.cor = Color.RED;
                    k = k.pai.pai;
                } else{
                    if(k == k.pai.direito){
                        k = k.pai;
                        rotacaoEsquerda(k);
                    }
                    k.pai.cor = Color.BLACK;
                    k.pai.pai.cor = Color.RED;
                    rotacaoDireita(k.pai.pai);
                }
            }
        }
    }

    public void rotacaoEsquerda(Node x) {
        Node y = x.direito;
        x.direito = y.esquerdo;
        if(y.esquerdo != Nil) y.esquerdo.pai = x;

        y.pai = x.pai;

        if (x.pai == null) raiz = y;
        else if (x == x.pai.esquerdo) x.pai.esquerdo = y;
        else x.pai.direito = y;

        y.esquerdo = x;
        x.pai = y;
    }

    public void rotacaoDireita(Node y) {
        Node x = y.esquerdo;
        y.esquerdo = x.direito;
        if(x.direito != Nil) x.direito.pai = y;

        x.pai = y.pai;

        if (y.pai == null) raiz = x;
        else if (y == y.pai.direito) y.pai.direito = x;
        else y.pai.esquerdo = x;

        x.direito = y;
        y.pai = x;
    }
}
