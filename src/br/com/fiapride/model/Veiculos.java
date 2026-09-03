package br.com.fiapride.model;

public class Veiculos {

    private String individuo;
    private String placa;
    private double alcool;

    public Veiculos() {
    }

    public Veiculos(String individuo, String placa, double alcool) {
        this.individuo = individuo;
        this.placa = placa;
        this.alcool = alcool;
    }

    public void adicionar(double valor) {
        this.alcool += valor;
    }

    public void gasta(double valor) {
        if (this.alcool >= valor) {
            this.alcool -= valor;
        } else {
            System.out.println("Combustível insuficiente.");
            this.alcool = 0.0;
        }
    }

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getAlcool() {
        return alcool;
    }

    public void setAlcool(double alcool) {
        this.alcool = alcool;
    }
}