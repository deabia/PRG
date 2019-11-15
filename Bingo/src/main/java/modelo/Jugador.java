package modelo;

/**
 *
 * @author oscar
 */
public class Jugador {

    private int dineroInicial;
    private int dinero;
    private String nombre;
    private Bola carton[][] = new Bola[3][9];

    public Bola[][] getCarton() {
        return carton;
    }

    public int getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(int dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}