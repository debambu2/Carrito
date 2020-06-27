import java.util.ArrayList;

public class Poleras implements CarritoDeCompras {
    private String color;

    @Override
    public ArrayList<Articulos> listaDeArticulos() {
        ArrayList<Articulos> poleras = new ArrayList<>();
        poleras.add(new Articulos( 9000, "Variant rojo", 2002,29,"Variant"));
        return poleras;
    }
}
