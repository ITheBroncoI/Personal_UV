package impl.concreteVehiculos.vehiculoGasolina;

import base.vehiculos.IScooter;

public class ScooterGasolina implements IScooter {
    @Override
    public void getMotor() {
        System.out.println("Scooter con motor a gasolina");
    }

    @Override
    public void getVelocidad() {
        System.out.println("Velocidad Maxima de 35 KM/h");
    }
}
