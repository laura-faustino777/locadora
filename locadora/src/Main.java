import Model.Aluguel;
import Model.Cliente;
import Model.Filme;

public class Main {
    public static void main(String[] args) {

         Cliente cliente = new Cliente("lucas", "40028922");
        System.out.println(cliente.getNome());

        Filme filme = new Filme("poerao em alto mar","ilusao", "49");
            filme.exibadetalhes();
            filme.AplicarDesconto();

        Aluguel aluguel = new Aluguel(cliente,filme,10);
        aluguel.calcularValor();



    }

}

