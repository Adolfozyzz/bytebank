
public class Cliente implements Autenticavel {

	private AutentificacaoUtil autentificador;
	
	public Cliente() {
		this.autentificador  = new AutentificacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
	    this.autentificador.setSenha(senha);;
	}

	@Override
	public boolean autentica(int senha) {
	   return this.autentificador.autentica(senha);
	}
	
	

	
}
