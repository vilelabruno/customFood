package Dominio;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CustomFood {

    public static void main(String[] args) {
        // TODO code application logic here
        Estabelecimento e = new Estabelecimento();
        
        e.cadastraFuncionario("Bruno", "12764618603", "atendente", Boolean.TRUE);
        
        Map<DayOfWeek, Double> descontos = new HashMap<>();
        Double d = 30.0;
        descontos.put(DayOfWeek.FRIDAY, d);
        e.criaRegra(true, descontos);
        
        Item i = new Item();
        Item i2 = new Item();
        Item i3 = new Item();
        ArrayList<Item> iA = new ArrayList<>();
        iA.add(i);
        iA.add(i2);
        iA.add(i3);
        Produto p = e.cadastrarProduto(iA, "xtudo", 30.0);
        
        ArrayList<Produto> iP = new ArrayList<>();
        iP.add(p);
        
        Usuario u = new Usuario();
        e.fazerPedido(iP, iA, u, 0);
        
        
    }
    
}
