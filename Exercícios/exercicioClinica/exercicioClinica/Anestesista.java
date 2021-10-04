package exercicioClinica;

public class Anestesista extends Medico {
	private String tipoAnestesia;

	Anestesista(String empresa, String nome, int crm, String tipoAnestesia) {
		super(empresa, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
		
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}
	@Override
	public String toString() {
		String mensagem = super.toString() + " Tipo de Anestesia: " + getTipoAnestesia() + ".";
		return mensagem;
	}
	@Override
	public Double calcularPagamento() {
		return this.valorPago = super.calcularPagamento() + 1000;
		
	}

}
