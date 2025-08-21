package vallegrande.edu.pe;

import vallegrande.edu.pe.view.CalculadoraView;
import vallegrande.edu.pe.controller.CalculadoraController;

public class App {
    public static void main(String[] args) {
        CalculadoraView vista = new CalculadoraView();
        CalculadoraController controlador = new CalculadoraController(vista);
        vista.setVisible(true);
    }
}
