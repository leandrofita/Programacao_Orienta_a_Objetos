package Atletas;

public class TestaAtleta {

	public static void main(String[] args) {
		
		Pais p1 = new Pais("Evangelist�o");
		Pais p2 = new Pais("Atl�ntida");
		Pais p3 = new Pais("Cim�ria");
		
		Atleta a1 = new Atleta("Cleyson", 56.0, "Constru��o Civil Art�stica", 6, p1);
		Atleta a2 = new Atleta("ZhorgB'hur", 123.0, "Arco e Flecha Monatado em Tubar�o", 3, p2);
		Atleta a3 = new Atleta("Jorge Bombeiro", 70.0, "Encanamento Carapdo", 4, p3);
		
		System.out.println(a1.toString());
		System.out.println(a1.verificarSituacao()+"\n");
		System.out.println(a2.toString());
		System.out.println(a2.verificarSituacao()+"\n");
		System.out.println(a3.toString());
		System.out.println(a3.verificarSituacao()+"\n");
		
		
		
		
		
		

	}

}
