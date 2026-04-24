package Model;

public class Aluguel {

     private Cliente cliente;
     public Filme filme;
     private int dias;
     private String resumo;

    public Aluguel(Cliente cliente, Filme filme, int dias, String resumo) {
        this.cliente = cliente;
        this.filme = filme;
        this.dias = dias;
        this.resumo = resumo;
    }

    public double calcularValor(){
        double valor = dias * 2;
        if(dias > 29){
            valor = valor -10;
        }
        return valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getResumo() {
        return resumo;
    }
}





