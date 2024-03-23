package impl.concreteFactories;

import base.factories.IFabricaVehiculos;
import base.vehiculos.IAutomovil;
import base.vehiculos.IScooter;
import impl.concreteVehiculos.vehiculoGasolina.AutomovilGasolina;
import impl.concreteVehiculos.vehiculoGasolina.ScooterGasolina;

public class GasolinaFactory implements IFabricaVehiculos {
    @Override
    public IAutomovil crearAutomovil() {
        return new AutomovilGasolina();
    }

    @Override
    public IScooter crearScooter() {
        return new ScooterGasolina();
    }
}
