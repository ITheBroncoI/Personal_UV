package impl.concreteFactories;

import base.Factories.IFabricaMuebles;
import base.Productos.ISilla;
import base.Productos.ISofa;
import base.Productos.IMesa;
import impl.concreteProductos.Victoriano.MesaVictoriana;
import impl.concreteProductos.Victoriano.SillaVictoriana;
import impl.concreteProductos.Victoriano.SofaVictoriano;


public class VictorianoFactory implements IFabricaMuebles {
    @Override
    public ISilla crearSilla() {
        return new SillaVictoriana();
    }

    @Override
    public ISofa crearSofa() {
        return new SofaVictoriano();
    }

    @Override
    public IMesa crearMesa() {
        return new MesaVictoriana();
    }
}
