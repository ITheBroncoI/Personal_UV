import base.factories.GUIFactory;
import impl.concreteFactories.MacFactory;
import impl.concreteFactories.WinFactory;

import java.util.Objects;

public class AplicationConfigurator {
    public static void main(String[] args) throws Exception {
        String sistemaOperativo = System.getProperty("os.name");
        GUIFactory factory;

        if (Objects.equals(sistemaOperativo, "Windows 10") || Objects.equals(sistemaOperativo, "Windows 11")) {
            factory = new WinFactory();
        } else if (Objects.equals(sistemaOperativo, "MacOS")) {
           factory = new MacFactory();
        } else {
            throw new Exception("Error! Sistema Operativo desconocido");
        }

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
