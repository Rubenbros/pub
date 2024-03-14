public class Pub {
    public static final String CERVEZA = "ambar";
    public static final String VINO = "tinto";
    public static final String SIDRA = "ladron";
    public static final String SEX_ON_THE_BEACH = "sob";
    public static final String CALIMOTXO = "calimotxo";

    public int calcularPrecio(String bebida, boolean estudiante, int cantidad) {

        if (cantidad > 2 && (bebida == SEX_ON_THE_BEACH || bebida == CALIMOTXO)) {
            throw new RuntimeException("Demasiadas bebidas, maximo 2");
        }
        int price;
        if (bebida.equals(CERVEZA)) {
            price = 5;
        }
        else if (bebida.equals(VINO)) {
            price = 2;
        }
        else if (bebida.equals(SIDRA)) price = 2;
        else if (bebida.equals(SEX_ON_THE_BEACH)) {
            price = ingrediente5() + ingrediente3()*2 + ingrediente4();
        }
        else if (bebida.equals(CALIMOTXO)) {
            price = ingrediente1() + ingrediente2()*2;
        }
        else {
            throw new RuntimeException("QUE?! REPITE NO TE ESCUCHO ESTA LA MUSICA MUY ALTA");
        }
        if (estudiante && (bebida == VINO || bebida == CERVEZA || bebida == SIDRA)) {
            price = price - 1;
        }
        return price*cantidad;
    }

    //Coca cola
    private int ingrediente1() {
        return 2;
    }

    //VINO
    private int ingrediente2() {
        return 2;
    }

    //Zumo de naranja
    private int ingrediente3() {
        return 1;
    }

    //Granadina
    private int ingrediente4() {
        return 1;
    }

    //Vodka
    private int ingrediente5() {
        return 5;
    }
}
