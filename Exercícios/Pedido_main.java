package ercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;  

public class Pedido_main {
    public static void main(String[] args) throws Exception {

        LocalDate date = LocalDate.parse("2021-09-12", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Pedido pedido1 = new Pedido(123, date, 30, 99.99);
        pedido1.finalizarPedido();
        System.out.println("\n\n Informações do Pedido -> 1 \n");
        pedido1.exibirAtributos();

        date = LocalDate.parse("2021-09-07", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Pedido pedido2 = new Pedido(456, date, 40, 99.99);
        pedido2.finalizarPedido();
        System.out.println("\n\n Informações do Pedido -> 2 \n");
        pedido2.exibirAtributos();
    }
}
