//BazanEspinoza
package lab09_casoa;

/**
 *
 * @author s
 */
public class CursoLinkedIterator implements Iterator {
    private static class Nodo {
        String materia;
        Nodo siguiente;
        Nodo(String materia) { this.materia = materia; this.siguiente = null; }
    }

    private Nodo cabeza;
    private Nodo actual;

    public CursoLinkedIterator(String[] materias) {
        cabeza = null;
        for (int i = materias.length - 1; i >= 0; i--) {
            Nodo n = new Nodo(materias[i]);
            n.siguiente = cabeza;
            cabeza = n;
        }
        actual = cabeza;
    }
    @Override
    public void first() {
        actual= cabeza;
    }

    @Override
    public String next() {
        String m = actual.materia;
        actual = actual.siguiente;
        return m;
    }

    @Override
    public String currentItem() {
        return actual !=null ? actual.materia : null;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }
}
