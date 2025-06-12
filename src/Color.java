public enum Color {
    RED, BLACK
}

class Node{
    int key;
    Color cor;
    Node direito, esquerdo, pai;

    Node(int key){
        this.key = key;
        this.cor = Color.RED;
        this.esquerdo = null;
        this.direito = null;
        this.pai = null;
    }
}
