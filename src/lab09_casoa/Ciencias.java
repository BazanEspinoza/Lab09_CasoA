//BazanEspinoza
package lab09_casoa;


/**
 *
 * @author s
 */
public class Ciencias implements CursosInterface {
    private String[] materias;

    public Ciencias() {
        materias = new String[]{"Fisica", "Quimica", "Biologia", "Matematica"};
    }

    @Override
    public Iterator crearIterator() {
        return new CursoIterator(materias);
    }
}
