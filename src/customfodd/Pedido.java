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
public class Pedido {
    ArrayList<Item> iA = new ArrayList<>();
    String endereco = null;
    int tipoPagto;
    int status = 0;
    public Pedido(ArrayList<Item> iA, ArrayList<Produto> iP, String endereco, int tipoPagto) {
        this.iA = iA;
        for (Produto p : iP){
            for (Item i : p.getiA()){
                this.iA.add(i);
            }
        }
        this.tipoPagto = tipoPagto;
        this.endereco = endereco;
    }

    
    public ArrayList<Item> getiA() {
        return iA;
    }

    public void setiA(ArrayList<Item> iA) {
        this.iA = iA;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTipoPagto() {
        return tipoPagto;
    }

    public void setTipoPagto(int tipoPagto) {
        this.tipoPagto = tipoPagto;
    }
    
}
