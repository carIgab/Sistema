
public class TesteGerente {

	public static void main(String[] args) {
		Gerente d1 = new Gerente ();
		d1.setNome("dale");
		
		Autenticavel referencia = new Cliente() ;
		referencia.setSenha(2234);
		
		d1.setSenha(231);
		boolean autenticou = d1.autentica(231);

        System.out.println(autenticou);
	 	

	}

}
