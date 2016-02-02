/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplopersistenciaaquivodac;

import java.io.IOException;

/**
 *
 * @author NandaPC
 */
public class Principal {
    public static void main(String[] args) throws IOException {
       CadastrarCarro cadastrarCarro = new CadastrarCarro();
        Carro carro = new Carro("Ferrari", "2015");
        
        cadastrarCarro.gravarCarro(carro);
    }
}
