// contratoautenticavel
	//Quem assinar esse contrato, precisa implementar
		// metodo autentica
public abstract interface Autenticavel {
	
		
	 public abstract void setSenha(int senha);
	
	 public abstract boolean autentica(int senha);
}
