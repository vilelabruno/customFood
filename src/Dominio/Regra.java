package Dominio;

import java.time.DayOfWeek;
import java.util.Map;

public class Regra {

    private int id;
    private boolean produtosCustomizaveis;
    private Map<DayOfWeek, Float> descontos;
    
    public Regra(boolean produtosCustomizaveis, Map<DayOfWeek, Float> descontos){
        this.produtosCustomizaveis = produtosCustomizaveis;
        this.descontos = descontos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProdutosCustomizaveis(boolean produtosCustomizaveis) {
        this.produtosCustomizaveis = produtosCustomizaveis;
    }

    public void setDescontos(Map<DayOfWeek, Float> descontos) {
        this.descontos = descontos;
    }

    public int getId() {
        return id;
    }

    public boolean isProdutosCustomizaveis() {
        return produtosCustomizaveis;
    }

    public Map<DayOfWeek, Float> getDescontos() {
        return descontos;
    }
}
