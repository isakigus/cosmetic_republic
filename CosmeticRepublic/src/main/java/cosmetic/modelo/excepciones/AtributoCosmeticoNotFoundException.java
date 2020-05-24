package cosmetic.modelo.excepciones;

import java.util.function.Supplier;

public class AtributoCosmeticoNotFoundException extends RuntimeException {

    AtributoCosmeticoNotFoundException(int id) {
        super("Could not find atributo " + id);
    }
}