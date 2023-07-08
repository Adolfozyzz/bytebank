
//Gerente é um funcionario, gerente herda da class Funcionario, assina o contrato autenticavel
public class Gerente extends  Funcionario implements Autenticavel{
	
	private AutentificacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutentificacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return  super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
	    this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
	   return this.autentica(senha);
	}
	}

	
	



	

