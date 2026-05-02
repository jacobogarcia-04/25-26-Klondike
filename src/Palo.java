public class Palo {
    private Carta[] carta;
    private Console console;
    private int ultima;

    public Palo() {
        carta = new Carta[13];
        console = new Console();
        ultima = 0;
    }

    private boolean estaVacio() {
        return ultima == 0;
    }

    public void mostrar() {

    }

    public void moverA(Columna columnaA) {

    }

    public boolean completo() {

    }

    public void añadir(Carta cartaCima) {

    }

    public boolean esApilable(Carta cartaNueva) {
        if (this.estaVacio()) {
            return cartaNueva.getNumero() == 0;
        } else {
            Carta cartaCima = carta[ultima - 1];
            return (cartaNueva.getPalo() == cartaCima.getPalo()
                    && cartaNueva.getNumero() == cartaCima.getNumero() + 1);
        }
    }

}
