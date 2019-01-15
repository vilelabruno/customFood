package Dominio;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Map;

public class Estabelecimento {

    private int id;

    private ArrayList<Funcionario> iF = new ArrayList<Funcionario>();
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void cadastrarProduto(ArrayList<Item> iA, String nome, double preco){
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
    
    public int cadastraFuncionario(String nome, int cpf, String cargo, Boolean eGerente){
        
        Funcionario f = new Funcionario(nome, cpf, cargo, eGerente);
        this.iF.add(f);
        return f.getId();
    }
    
    public int criaRegra(boolean produtosCustomizaveis, Map<DayOfWeek, Float> descontos) {
        
        Regra r = new Regra(produtosCustomizaveis, descontos);
        return r.getId();
    }

    synchronized void filaPedidos(Pedido p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
