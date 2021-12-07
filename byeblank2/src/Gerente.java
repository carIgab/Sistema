//Gerente é um Funcionário, Gerente herda da classe Funcionário
public class Gerente extends Funcionario implements Autenticavel{
	
	private autenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new autenticacaoUtil();
	}
	
    public double getBonificacao() {
    	System.out.println("Chamando o GERENTE");
    	return super.getSalario();
    }
    @Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}
}
