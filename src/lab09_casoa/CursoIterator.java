//BazanEspinoza
package lab09_casoa;

/**
 *
 * @author s
 */
public class CursoIterator implements Iterator {
    private String[] materias;
    private int posicion;

    public CursoIterator(String[] materias) {
        this.materias = materias;
        this.posicion = 0;
    }

    @Override
    public void first() {
        posicion = 0;
    }

    @Override
    public String next() {
        return materias[posicion++];
    }

    @Override
    public String currentItem() {
        return materias[posicion];
    }

    @Override
    public boolean hasNext() {
        return posicion < materias.length;
    }
}
