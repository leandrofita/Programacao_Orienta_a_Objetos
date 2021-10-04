package exercicioMercadinho;

public class Mercadinho_main {

	public static void main(String[] args) {
		
		Produto p1 = new BebidaAlcoolica("Cerveja - Jamaica's Water", 12.0, "67%"); 
		Produto p2 = new BebidaAlcoolica("Vinho - Sangre De La Besta", 150.0, "87%"); 
		Produto p3 = new Eletrodomestico("TV - 6D com Resolução Quântica", 2000.0, "120 V"); 
		Produto p4 = new Eletrodomestico("Geladeira - Ice Age", 2352.64, "220 V"); 
		Produto p5 = new Eletrodomestico("Rádio - Que vira Robô", 837.59, "120 V"); 
		calcularTotal ct = new calcularTotal();
		
		System.out.println(p1.toString());
		System.out.println("Valor total da venda: R$"+ p1.Vender(5)+"\n");
		ct.calcularTotalP(p1);
		
		System.out.println(p2.toString());
		System.out.println("Valor total da venda: R$" +p2.Vender(3)+"\n");
		ct.calcularTotalP(p2);
		
		System.out.println(p3.toString());
		System.out.println("Valor total da venda: R$"+p3.Vender(9)+"\n");
		ct.calcularTotalP(p3);
		
		System.out.println(p4.toString());
		System.out.println("Valor total da venda: R$"+p4.Vender(3)+"\n");
		ct.calcularTotalP(p4);
		
		System.out.println(p5.toString());
		System.out.println("Valor total da venda: R$"+p5.Vender(1)+"\n");
		ct.calcularTotalP(p5);
		
		System.out.println("O valor total da venda foi de: R$" + ct.getTotalPago());

	}

}
