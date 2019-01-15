package customfodd;

import java.util.ArrayList;

public class Estabelecimento {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void cadastraProduto(ArrayList<Item> iA, String nome, double preco){
        Produto p = new Produto(nome, preco);
        for (Item i : iA){
            p.addItens(i);
        }
        
    }
    public int fazerPedido(ArrayList<Produto> iP, ArrayList<Item> iI, Usuario u, int tipoPagto){
        Pedido p = new Pedido(iI, iP, u, tipoPagto);
        filaPedidos(p);
        return 1;
    }
    public Regra criaRegra(Regra regra) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    synchronized void filaPedidos(Pedido p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
