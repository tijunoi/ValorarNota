package com.nilordonez.controller;

import com.nilordonez.model.Evaluador;
import com.nilordonez.view.ResultadoView;

public class ResultadoController {
    Evaluador model;
    ResultadoView view;

    public ResultadoController(Evaluador model, ResultadoView view) {
        this.model = model;
        this.view = view;

        this.view.getResultado().setText(this.model.getNotaEnLetras());
    }
}
