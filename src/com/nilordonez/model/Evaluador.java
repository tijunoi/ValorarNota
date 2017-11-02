package com.nilordonez.model;

public class Evaluador {
    private float nota;
    private String notaEnLetras;

    private static final String VACIO = "RESULTADO: ";
    private static final String CATEADO = "RESULTADO: Cateado";
    private static final String BIEN = "RESULTADO: Bien";
    private static final String GENIAL = "RESULTADO: Genial!";

    public Evaluador() {
        reset();
    }

    public void reset(){
        this.nota = 0;
        notaEnLetras = Evaluador.VACIO;
    };

    public float getNota() {
        return nota;
    }

    public String getNotaEnLetras() {
        return notaEnLetras;
    }

    private void setNota(float nota) {
        this.nota = nota;
    }

    private void setNotaEnLetras(String notaEnLetras) {
        this.notaEnLetras = notaEnLetras;
    }

    public String evaluarNota (float nota){
        setNota(nota);
        if (this.nota < 5){
            setNotaEnLetras(Evaluador.CATEADO);
        } else if (this.nota < 7){
            setNotaEnLetras(Evaluador.BIEN);
        } else if (this.nota > 7) {
            setNotaEnLetras(Evaluador.GENIAL);
        }
        return this.notaEnLetras;
    }
}
