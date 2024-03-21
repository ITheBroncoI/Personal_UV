package impl.concreteFactories;

import base.Factories.IFabricaMuebles;
import base.Productos.ISilla;
import base.Productos.ISofa;
import base.Productos.IMesa;
import impl.concreteProductos.Moderno.MesaModerna;
import impl.concreteProductos.Moderno.SillaModerna;
import impl.concreteProductos.Moderno.SofaModerno;

public class ModernoFactory implements IFabricaMuebles {
    @Override
    public ISilla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public ISofa crearSofa() {
        return new SofaModerno();
    }

    @Override
    public IMesa crearMesa() {
        return new MesaModerna();
    }
}
