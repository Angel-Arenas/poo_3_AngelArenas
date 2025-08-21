package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Operacion;
import vallegrande.edu.pe.view.CalculadoraView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {
    private CalculadoraView vista;

    public CalculadoraController(CalculadoraView vista) {
        this.vista = vista;

        this.vista.btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sumar();
            }
        });

        this.vista.btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                restar();
            }
        });
    }

    private void sumar() {
        int a = Integer.parseInt(vista.txtNum1.getText());
        int b = Integer.parseInt(vista.txtNum2.getText());
        Operacion op = new Operacion(a, b);
        vista.lblResultado.setText("Resultado: " + op.sumar());
    }

    private void restar() {
        int a = Integer.parseInt(vista.txtNum1.getText());
        int b = Integer.parseInt(vista.txtNum2.getText());
        Operacion op = new Operacion(a, b);
        vista.lblResultado.setText("Resultado: " + op.restar());
    }
}
