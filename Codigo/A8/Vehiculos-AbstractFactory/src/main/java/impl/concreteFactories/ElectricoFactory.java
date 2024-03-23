package impl.concreteFactories;

import base.factories.IFabricaVehiculos;
import base.vehiculos.IAutomovil;
import base.vehiculos.IScooter;
import impl.concreteVehiculos.vehiculoElectrico.AutomovilElectrico;
import impl.concreteVehiculos.vehiculoElectrico.ScooterElectrico;

public class ElectricoFactory implements IFabricaVehiculos {
    @Override
    public IAutomovil crearAutomovil() {
        return new AutomovilElectrico();
    }

    @Override
    public IScooter crearScooter() {
        return new ScooterElectrico();
    }
}
