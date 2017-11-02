package com.nilordonez;

import javax.swing.*;
import java.awt.*;

public class EvaluadorView extends JFrame {
    JButton btOk, btCancel;
    JLabel resultado;
    JTextField tfUserInput;

    public EvaluadorView() {
        this.setTitle("Evaluación de notas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
}
