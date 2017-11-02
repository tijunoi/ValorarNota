package com.nilordonez.view;

import javax.swing.*;
import java.awt.*;

public class ResultadoView extends JFrame{
    private JLabel resultado;

    public ResultadoView() {
        this.setTitle("Resultado evaluación");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addComponentsToPane(this.getContentPane());

        this.pack();
        this.setVisible(true);
    }

    private void addComponentsToPane(Container contentPane){
        this.resultado = new JLabel();
        contentPane.add(this.resultado);
    }

    public JLabel getResultado() {
        return resultado;
    }
}
