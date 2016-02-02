package com.mycompany.exemplopersistenciaaquivodac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastrarCarro {

    File arquivo;
    List<Carro> listaCarro = new ArrayList<>();

    public CadastrarCarro() throws IOException {
        criaArquivo();
    }

    public List<Carro> getListaCarro() {
        return listaCarro;
    }

    public void setListaCarro(List<Carro> listaCarro) {
        this.listaCarro = listaCarro;
    }

    private void criaArquivo() throws IOException {
        this.arquivo = new File("cadastroCarro.txt");
        if (!this.arquivo.exists()) {
            this.arquivo.createNewFile();
        }
    }

    public void gravarDados() {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new PrintWriter(new FileWriter(arquivo)));
            for (Carro pessoa : listaCarro) {
                bw.write(pessoa.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ao gravar!");
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
            }
        }
    }

    public void gravarCarro(Carro carro) {
        BufferedWriter bf = null;
        try {

            bf = new BufferedWriter(new PrintWriter(new FileWriter(arquivo, true)));
            bf.write(carro.toString());
            bf.newLine();
        } catch (IOException io) {
            System.out.println("Erro!");
        } finally {
            try {
                bf.close();
            } catch (IOException e) {

            }
        }
    }

    public List<Carro> lerCarro() throws IOException {
        BufferedReader bR = new BufferedReader(new FileReader(arquivo));

        String linha = bR.readLine();

        while (linha != null) {
            String[] partes = linha.split(";");
            String[] partesEndereco = partes[2].split(",");

            Carro pessoa = new Carro(partes[0], partes[1]);
            listaCarro.add(pessoa);
            linha = bR.readLine();
        }
        bR.close();
        return listaCarro;
    }

}
