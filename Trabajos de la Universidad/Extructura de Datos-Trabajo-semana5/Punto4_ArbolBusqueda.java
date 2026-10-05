import java.util.Scanner;

public class Punto4_ArbolBusqueda {

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

    // Método para insertar un valor en el árbol
    public static Nodo insertar(Nodo arbol, int valor) {

        if (arbol == null) {
            return new Nodo(valor);
        }

        if (valor < arbol.valor) {
            arbol.izquierdo = insertar(arbol.izquierdo, valor);
        } else {
            arbol.derecho = insertar(arbol.derecho, valor);
        }

        return arbol;
    }

    // Método para buscar un valor en el árbol
    public static boolean buscar(Nodo arbol, int valor) {

        if (arbol == null) {
            return false;
        }

        if (arbol.valor == valor) {
            return true;
        }

        if (valor < arbol.valor) {
            return buscar(arbol.izquierdo, valor);
        } else {
            return buscar(arbol.derecho, valor);
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = entrada.nextInt();

        Nodo raiz = null;

        System.out.println("Ingrese los valores del arreglo:");

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            int valor = entrada.nextInt();

            raiz = insertar(raiz, valor);
        }

        System.out.print("Ingrese el valor que desea buscar: ");
        int valorBuscar = entrada.nextInt();

        boolean resultado = buscar(raiz, valorBuscar);

        System.out.println("¿El número se encuentra en el árbol?: " + resultado);

        entrada.close();
    }
}