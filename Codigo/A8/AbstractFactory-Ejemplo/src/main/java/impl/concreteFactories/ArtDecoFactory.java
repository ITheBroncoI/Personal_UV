package impl.concreteFactories;

import base.Factories.IFabricaMuebles;
import base.Productos.ISilla;
import base.Productos.ISofa;
import base.Productos.IMesa;
import impl.concreteProductos.ArtDeco.MesaArtDeco;
import impl.concreteProductos.ArtDeco.SillaArtDeco;
import impl.concreteProductos.ArtDeco.SofaArtDeco;

public class ArtDecoFactory implements IFabricaMuebles {
    @Override
    public ISilla crearSilla() {
        return new SillaArtDeco();
    }

    @Override
    public ISofa crearSofa() {
        return new SofaArtDeco();
    }

    @Override
    public IMesa crearMesa() {
        return new MesaArtDeco();
    }
}
