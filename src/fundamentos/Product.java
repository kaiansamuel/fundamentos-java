package fundamentos;

public class Product {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalValueInStock(){
        return preco * quantidade;
    }

    public void addProducts(){
        this.quantidade += quantidade;
    }

    public void removeProducts(){
        this.quantidade -= quantidade;
    }
}
