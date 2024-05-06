import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
   private List<Item> carrinhoCompra;

   public CarrinhoDeCompras(){
        this.carrinhoCompra = new ArrayList<>(); 
   }
   public void adicionarItem(String nome, Double preco, int  quantidade){
        carrinhoCompra.add(new Item(nome, preco, quantidade));
   }
   public void removerItem(String nome){
    List<Item> listaRemoverItem = new ArrayList<>();
    for(Item t : carrinhoCompra){
        //PEGA O NOME DE "T", IGNORA O CASE E COMPARA COM "NOME", SE FOR IGUAL, SEGUE O FOR
        if(t.getNome().equalsIgnoreCase(nome)){
            listaRemoverItem.add(t);
        }
    }
    carrinhoCompra.removeAll(listaRemoverItem);
   }
   public double calcularValorTotal(){
    double valorTotal = 0d;
    if(!carrinhoCompra.isEmpty()){
        //CRIA OBJETO item DO TIPO ITEM E COMPARA COM CADA ITEM DA LISTA
        for (Item item : carrinhoCompra) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;

    }else{
        throw new RuntimeException("A lista está vazia!");
    }
    
   }
   public void exibirItens(){
    if (!carrinhoCompra.isEmpty()) {
        System.out.println(carrinhoCompra);
    }else{
        System.out.println("O carrinho está vazio!");
    }
   }

   
   @Override
public String toString() {
    return "CarrinhoDeCompras [carrinhoCompra=" + carrinhoCompra + "]";
}
public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    carrinho.adicionarItem("Bola", 20.50, 5);
    carrinho.adicionarItem("TV", 1000.0, 1);
    carrinho.adicionarItem("Refrigerante", 9.50, 2);

    System.out.println("O valor total do seu carrinho é: " + carrinho.calcularValorTotal());
    carrinho.exibirItens();

    carrinho.removerItem("TV");

    System.out.println("O valor total do seu carrinho é: " + carrinho.calcularValorTotal());
    carrinho.exibirItens();







   }
   
}

   

