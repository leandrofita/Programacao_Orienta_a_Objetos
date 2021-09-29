package ercicios;

public class Empregado {

	    private String nome;
	    private String sobrenome;
	    private Double salario;

	    public String getNome() {
	        return nome;
	    }

	    public Double getSalario() {
	        return salario;
	    }

	    public String getSobrenome() {
	        return sobrenome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public void setSobrenome(String sobrenome) {
	        this.sobrenome = sobrenome;
	    }

	    public void setSalario(Double salario) {
	        this.salario = salario;
	    }

	    public Empregado(String nome, String sobrenome, Double salario) {
	        this.nome = nome;
	        this.sobrenome = sobrenome;
	        this.salario = salario;
	    }

	    public void calcularImpostoRenda(){
	        if (getSalario() >= 1903.98 || getSalario() <= 2826.65){
	            setSalario(getSalario() - (getSalario() * 0.075));
	        } else if (getSalario() >= 2826.66 || getSalario() <= 3751.05){
	            setSalario(getSalario() - (getSalario() * 0.15));
	        } else if (getSalario() >= 3751.05 || getSalario() <= 4664.68){
	            setSalario(getSalario() - (getSalario() * 0.225));
	        } else {
	            setSalario(getSalario() - (getSalario() * 0.275));
	        }
	    }

	    public void exibirAtributos(){
	        System.out.println(String.format("Nome: %s", getNome()));
	        System.out.println(String.format("Sobrenome: %s", getSobrenome()));
	        System.out.println(String.format("Salário: %.2f", getSalario()));
	    }
	}

