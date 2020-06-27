import java.util.ArrayList;

public class Pantalones implements CarritoDeCompras{
    private int cantidadBolsillos;
    private String color;

    @Override
    public ArrayList<Articulos> listaDeArticulos() {
        ArrayList<Articulos> pantalones = new ArrayList<>();
        pantalones.add(cantidadBolsillos, new Articulos( 9000, "Variant rojo", 2002,29,"Variant"));
        return pantalones;
    }
}
