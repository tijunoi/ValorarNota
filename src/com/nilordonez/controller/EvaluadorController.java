package com.nilordonez.controller;

import com.nilordonez.view.EvaluadorView;
import com.nilordonez.model.Evaluador;
import com.nilordonez.view.ResultadoView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvaluadorController implements ActionListener {
    private Evaluador model;
    private EvaluadorView view;

    public EvaluadorController(Evaluador model, EvaluadorView view) {
        this.model = model;
        this.view = view;

        this.view.getResultado().setText(model.getNotaEnLetras());
        view.getBtOk().addActionListener(this);
        view.getBtCancel().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (view.getBtCancel() == e.getSource()){
            view.getTfUserInput().setText("");
            model.reset();
            view.getResultado().setText(model.getNotaEnLetras());
        } else if (view.getBtOk() == e.getSource()){
            this.model.evaluarNota(Float.parseFloat(this.view.getTfUserInput().getText()));
            ResultadoView view2 = new ResultadoView();
            ResultadoController controller2 = new ResultadoController(this.model,view2);
        }
    }
}
