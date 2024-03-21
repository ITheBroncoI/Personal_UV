package impl.concreteProductos.ArtDeco;

import base.Productos.ISilla;

public class SillaArtDeco implements ISilla {
    @Override
    public void sentarse() {
        System.out.println("Sentado en silla ArtDeco");
    }

    @Override
    public String getEstilo() {
        return "Silla estilo ArtDeco";
    }
}
