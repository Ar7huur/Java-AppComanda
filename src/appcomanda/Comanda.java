package appcomanda;

import java.util.ArrayList;
import java.util.List;

public class Comanda {

    private int id;
    private String cliente;
    private Produto[] listprod;
    private Item[] listitem;
    private int TL = 0;
    

    public Comanda(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        listprod = new Produto[20];
        listitem = new Item[20];
    }

   

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public void exibir() {
         System.out.println("Comanda{" + "id=" + id + ", cliente=" + cliente + '}'); ;
    }
    

    public boolean addItem(int qtd, Produto prod) {
        boolean flag = false;
        if (TL < listprod.length) {
            listprod[TL++] = prod;
            flag = true;
        }
        return flag;
    }

    public double getTotal() {
        double cont = 0;
        for (int i = 0; i < listprod.length; i++) {
            if (listprod[i] != null && listprod[i].getPreco()>0) {
                cont+=listprod[i].getPreco();
            }
        }
        return cont;
    }
}
