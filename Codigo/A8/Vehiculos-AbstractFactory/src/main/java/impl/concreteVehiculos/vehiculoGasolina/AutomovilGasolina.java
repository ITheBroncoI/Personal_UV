package impl.concreteVehiculos.vehiculoGasolina;

import base.vehiculos.IAutomovil;

public class AutomovilGasolina implements IAutomovil {
    @Override
    public void getMotor() {
        System.out.println("Auotmovil con motor a gasolina");
    }

    @Override
    public void getVelocidad() {
        System.out.println("Velocidad maxima de 350 KM/h");
    }
}
