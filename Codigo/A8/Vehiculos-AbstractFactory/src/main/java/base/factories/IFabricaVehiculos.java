package base.factories;

import base.vehiculos.IAutomovil;
import base.vehiculos.IScooter;

public interface IFabricaVehiculos {
    IAutomovil crearAutomovil();
    IScooter crearScooter();
}
