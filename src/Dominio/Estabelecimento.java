package Dominio;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Map;

public class Estabelecimento {

    private int id;

    private ArrayList<Funcionario> iF = new ArrayList<Funcionario>();
    private Regra r = null;
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public Produto cadastrarProduto(ArrayList<Item> iA, String nome, double preco){
        Produto p = new Produto(nome, preco);
        for (Item i : iA){
            p.addItens(i);
        }
        return p;
    }
    public int fazerPedido(ArrayList<Produto> iP, ArrayList<Item> iI, Usuario u, int tipoPagto){
        Pedido p = new Pedido(iI, iP, u, tipoPagto);
        filaPedidos(p);
        return 1;
    }
    
    public int cadastraFuncionario(String nome, String cpf, String cargo, Boolean eGerente){
        
        Funcionario f = new Funcionario(nome, cpf, cargo, eGerente);
        this.iF.add(f);
        return 1;
    }
    
    public int criaRegra(boolean eCustomizavel, Map<DayOfWeek, Double> descontos) {
        
        Regra r = new Regra(eCustomizavel, descontos);
        this.r = r;
        return 1;
    }

    synchronized void filaPedidos(Pedido p) {
        System.out.println("fila pedidos");
    }

    
}
