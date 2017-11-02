package com.nilordonez;

public class Main {

    public static void main(String[] args) {
        Evaluador model = new Evaluador();
        EvaluadorView view = new EvaluadorView();
        EvaluadorController controller = new EvaluadorController(model,view);
    }
}
