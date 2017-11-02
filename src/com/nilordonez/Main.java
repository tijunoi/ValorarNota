package com.nilordonez;

import com.nilordonez.controller.EvaluadorController;
import com.nilordonez.model.Evaluador;
import com.nilordonez.view.EvaluadorView;

public class Main {

    public static void main(String[] args) {
        Evaluador model = new Evaluador();
        EvaluadorView view = new EvaluadorView();
        EvaluadorController controller = new EvaluadorController(model,view);
    }
}
