package com.nilordonez;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvaluadorController implements ActionListener {
    Evaluador model;
    EvaluadorView view;

    public EvaluadorController(Evaluador model, EvaluadorView view) {
        this.model = model;
        this.view = view;

        this.view.resultado.setText(model.getNotaEnLetras());
        view.btOk.addActionListener(this);
        view.btCancel.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (view.btCancel == e.getSource()){
            view.tfUserInput.setText("");
            model.reset();
            view.resultado.setText(model.getNotaEnLetras());
        } else if (view.btOk == e.getSource()){
            view.resultado.setText(model.evaluarNota(Float.parseFloat(view.tfUserInput.getText())));
            view.tfUserInput.setText("");
        }
    }
}
