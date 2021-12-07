
public class Cliente implements Autenticavel {
	
	private autenticacaoUtil antenticador;
	
	public Cliente () {
		this.antenticador = new autenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.antenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.antenticador.autentica(senha);
		
	}
}
