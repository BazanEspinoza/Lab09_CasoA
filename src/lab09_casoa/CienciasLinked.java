//BazanEspinoza
package lab09_casoa;

/**
 *
 * @author s
 */
public class CienciasLinked implements CursosInterface {
    private String[] materias;

    public CienciasLinked() {
        materias = new String[]{"Fisica", "Quimica", "Biologia", "Matematica"};
    }

    @Override
    public Iterator crearIterator() {
        return new CursoIterator(materias);
    }
}
