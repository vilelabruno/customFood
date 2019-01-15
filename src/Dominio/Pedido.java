/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author vilel
 */
public class Pedido {
    ArrayList<Item> iA = new ArrayList<>();
    Usuario user = new Usuario();
    int tipoPagto;
    int status = 0;
    public Pedido(ArrayList<Item> iA, ArrayList<Produto> iP, Usuario u, int tipoPagto) {
        this.user = u;
        this.iA = iA;
        for (Produto p : iP){
            for (Item i : p.getiA()){
                this.iA.add(i);
            }
        }
        this.tipoPagto = tipoPagto;
    }

    
    public ArrayList<Item> getiA() {
        return iA;
    }

    public void setiA(ArrayList<Item> iA) {
        this.iA = iA;
    }

    public int getTipoPagto() {
        return tipoPagto;
    }

    public void setTipoPagto(int tipoPagto) {
        this.tipoPagto = tipoPagto;
    }
    
}
