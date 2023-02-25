package appcomanda;

public class AppComanda {
    //RA: 262012782JOSÉ RENATO CUNHA ROYER 
    //RA: 262012855 - ARTHUR SILVA MARQUES FIGUEIRINHA

    public static void main(String[] args) {
        Comanda c1, c2, c3;
        Produto p1, p2, p3;
        double total;

        //produtos
        p1 = new Produto(99, "Coca-Cola", 2.50);
        p2 = new Produto(22, "Pepsi", 2.99);
        p3 = new Produto(33, "Dolly", 3.99);

        //comandas
        c1 = new Comanda(1, "Jose");
        c2 = new Comanda(2, "Arthur");

        c1.addItem(2, p1);
//      c1.addItem(10, p3);;

        c1.exibir();
        total = c1.getTotal();
        System.out.println("Total: " + total);

    }
}
