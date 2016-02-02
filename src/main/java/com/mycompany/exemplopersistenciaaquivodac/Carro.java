package com.mycompany.exemplopersistenciaaquivodac;

public class Carro {

    //private int codigo;

    private String marca;
    private String ano;

    public Carro() {
    }

    public Carro(String marca, String ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

}
