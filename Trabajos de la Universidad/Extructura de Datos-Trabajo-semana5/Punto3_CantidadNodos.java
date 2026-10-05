public class Punto3_CantidadNodos {

    static class Nodo {
        int valor;
        Nodo izquierdo;
        Nodo derecho;

        Nodo(int valor) {
            this.valor = valor;
            izquierdo = null;
            derecho = null;
        }
    }

    public static int cantidadNodos(Nodo arbol) {

        if (arbol == null) {
            return 0;
        }

        return 1 + cantidadNodos(arbol.izquierdo)
                 + cantidadNodos(arbol.derecho);
    }

    public static void main(String[] args) {

        Nodo raiz = new Nodo(10);

        raiz.izquierdo = new Nodo(5);
        raiz.derecho = new Nodo(15);

        raiz.izquierdo.izquierdo = new Nodo(3);
        raiz.izquierdo.derecho = new Nodo(7);

        raiz.derecho.derecho = new Nodo(20);

        int cantidad = cantidadNodos(raiz);

        System.out.println("Cantidad de nodos del árbol: " + cantidad);
    }
}