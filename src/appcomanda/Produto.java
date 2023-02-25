
package appcomanda;


public class Produto {

    private int id;
    private String nome;
    private double preco;
    private Item item;
    

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        setPreco(preco);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco) {
        if(preco>0)
            this.preco = preco;
    }
    
   
}
