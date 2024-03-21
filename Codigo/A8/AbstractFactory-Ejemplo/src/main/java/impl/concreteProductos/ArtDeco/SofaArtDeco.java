package impl.concreteProductos.ArtDeco;

import base.Productos.ISofa;

public class SofaArtDeco implements ISofa {
    @Override
    public void recostarse() {
        System.out.println("Recostado en el sofa");
    }

    @Override
    public String getEstilo() {
        return "Sofa estilo ArtDeco";
    }
}
