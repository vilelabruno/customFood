/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customfodd;

import java.util.ArrayList;

/**
 *
 * @author vilel
 */
public class Produto {
    String nomeProduto = null;
    Double preco = 0.0;
    ArrayList<Item> iA = new ArrayList<>();

    public Produto(String nome, Double p) {
        preco = p;
        nomeProduto = nome;
    }
    public void addItens(Item i){
        iA.add(i);
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ArrayList<Item> getiA() {
        return iA;
    }

    public void setiA(ArrayList<Item> iA) {
        this.iA = iA;
    }
    
}
