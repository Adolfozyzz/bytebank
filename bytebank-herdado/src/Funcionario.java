

public abstract class Funcionario {
	
					
	
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
		
	}
	
	//metodo sem corpo, não a implementação
	public abstract double getBonificacao();
	
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	public final String getCpf() {
		return cpf;
	}
	public final void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public final double getSalario() {
		return salario;
	}
	public final void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
