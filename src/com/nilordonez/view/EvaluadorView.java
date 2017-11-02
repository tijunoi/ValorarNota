package com.nilordonez.view;

import javax.swing.*;
import java.awt.*;

public class EvaluadorView extends JFrame {
    private JButton btOk, btCancel;
    private JLabel resultado;
    private JTextField tfUserInput;

    public EvaluadorView() {
        this.setTitle("Evaluación de notas");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        addComponentsToPane(this.getContentPane());

        this.pack();
        this.setVisible(true);
    }

    void addComponentsToPane(Container contentPane) {
        //contentPane.setLayout(new FlowLayout());
        tfUserInput = new JTextField(20);
        contentPane.add(tfUserInput, BorderLayout.NORTH);

        btOk = new JButton("OK");
        contentPane.add(btOk, BorderLayout.WEST);

        btCancel = new JButton("CANCEL");
        contentPane.add(btCancel,BorderLayout.EAST);

        resultado = new JLabel("RESULTADO:");
        contentPane.add(resultado,BorderLayout.SOUTH);
    }

    public JButton getBtOk() {
        return btOk;
    }

    public JButton getBtCancel() {
        return btCancel;
    }

    public JLabel getResultado() {
        return resultado;
    }

    public JTextField getTfUserInput() {
        return tfUserInput;
    }
}
