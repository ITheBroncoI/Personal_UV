package impl.concreteProductos.ArtDeco;

import base.Productos.IMesa;

public class MesaArtDeco implements IMesa {
    // --- ATRIBUTOS ---
    private int objetosMesa;

    // --- METODOS ---
    // CONSTRUCTOR
    public MesaArtDeco() {
        super();
        this.objetosMesa = 0;
    }

    @Override
    public void colocarCosas(int cosas) {
        this.objetosMesa = cosas;
        System.out.println("Se colocaron " + this.objetosMesa + " objetos en la mesa");
    }

    @Override
    public String getEstilo() {
        return "Mesa estilo ArtDeco";
    }

    @Override
    public int getNoCosas() {
        return this.objetosMesa;
    }
}
