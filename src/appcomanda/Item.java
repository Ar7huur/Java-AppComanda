package appcomanda;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private int qtd;
    private Produto produto;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if(qtd>0)
            this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public double getPreco(){
        return qtd*produto.getPreco();
    }
    
    

}
