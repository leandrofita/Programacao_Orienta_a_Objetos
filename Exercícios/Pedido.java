package ercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pedido {
    
    private int numero;
    private LocalDate dataPedido;
    private double quantidade;
    private double valor;
    private double total;

    public int getNumero() {
        return numero;
    }
    
    public LocalDate getDataPedido() {
        return dataPedido;
    }
    
    public double getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }
    
    public double getTotal() {
        return total;
    }

    public Pedido(int numero, LocalDate dataPedido, double quantidade, double valor) {
        this.numero = numero;
        this.dataPedido = dataPedido;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void finalizarPedido(){
        switch (dataPedido.getDayOfWeek()) {
            case SUNDAY:
                total = (getValor() * getQuantidade()) - ((getValor() * getQuantidade()) * 0.1);
                break;
        
            default:
                total = getValor() * getQuantidade();
                break;
        }
    }

    public void exibirAtributos(){
        System.out.println(String.format("Número: %d", getNumero()));
        System.out.println(String.format("Data: %s", getDataPedido().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        System.out.println(String.format("Quantidade: %.2f", getQuantidade()));
        System.out.println(String.format("Valor: %.2f", getValor()));
        System.out.println(String.format("Total: %.2f", getTotal()));
    }
}