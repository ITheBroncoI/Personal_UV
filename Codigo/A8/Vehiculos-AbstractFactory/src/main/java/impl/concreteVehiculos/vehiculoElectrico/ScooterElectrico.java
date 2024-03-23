package impl.concreteVehiculos.vehiculoElectrico;

import base.vehiculos.IScooter;

public class ScooterElectrico implements IScooter {
    @Override
    public void getMotor() {
        System.out.println("Scooter con motor electrico");
    }

    @Override
    public void getVelocidad() {
        System.out.println("Velocidad maxima de 28 KM/h");
    }
}
