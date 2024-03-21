package base.Factories;

import base.Productos.ISilla;
import base.Productos.ISofa;
import base.Productos.IMesa;

public interface IFabricaMuebles {
    ISilla crearSilla();
    ISofa crearSofa();
    IMesa crearMesa();
}
