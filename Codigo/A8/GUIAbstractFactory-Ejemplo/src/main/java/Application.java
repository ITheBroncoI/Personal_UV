import base.elementos.IButton;
import base.factories.GUIFactory;

public class Application {
    private final GUIFactory factory;
    private IButton button;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    void createUI() {
        this.button = factory.createButton();
    }

    void paint() {
        button.paint();
    }
}
