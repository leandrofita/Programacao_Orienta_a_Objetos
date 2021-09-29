package ercicios;

public class Empregado_main {
    public static void main(String[] args) throws Exception {
        Empregado empregado1 = new Empregado("João", "O Bom", 2570.85);
        Empregado empregado2 = new Empregado("Pedro", "Salazares", 4650.35);

        System.out.println(" Informações do Empregado 1 \n");
        empregado1.exibirAtributos();
        System.out.println("Calculando Imposto de Renda...\n");
        empregado1.calcularImpostoRenda();
        System.out.println(String.format("Salário IR: %.2f", empregado1.getSalario()));

        System.out.println("\n\n Informações do Empregado 2 \n");
        empregado2.exibirAtributos();
        System.out.println("Calculando Imposto de Renda...\n");
        empregado2.calcularImpostoRenda();
        System.out.println(String.format("Salário IR: %.2f", empregado2.getSalario()));
    }
}