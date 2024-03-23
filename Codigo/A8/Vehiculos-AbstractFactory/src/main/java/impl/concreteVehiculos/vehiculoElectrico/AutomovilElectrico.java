package impl.concreteVehiculos.vehiculoElectrico;

import base.vehiculos.IAutomovil;

public class AutomovilElectrico implements IAutomovil {
    @Override
    public void getMotor() {
        System.out.println("Automovil con motor electrico");
    }

    @Override
    public void getVelocidad() {
        System.out.println("Velocidad maxima de 300 KM/h");
    }
}
