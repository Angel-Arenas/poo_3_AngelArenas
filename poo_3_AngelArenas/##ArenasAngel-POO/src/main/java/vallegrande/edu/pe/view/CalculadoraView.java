package vallegrande.edu.pe.view;

import javax.swing.*;

public class CalculadoraView extends JFrame {
    // 👇 Ponerlos como public
    public JTextField txtNum1, txtNum2;
    public JButton btnSumar, btnRestar;
    public JLabel lblResultado;

    public CalculadoraView() {
        setTitle("Calculadora MVC");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtNum1 = new JTextField();
        txtNum1.setBounds(50, 20, 80, 30);
        add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setBounds(150, 20, 80, 30);
        add(txtNum2);

        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(50, 70, 80, 30);
        add(btnSumar);

        btnRestar = new JButton("Restar");
        btnRestar.setBounds(150, 70, 80, 30);
        add(btnRestar);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(50, 120, 200, 30);
        add(lblResultado);
    }
}
