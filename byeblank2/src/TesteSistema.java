
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente ();
		g.setSenha(2222);
		
		Administrador ad = new Administrador();
		ad.setSenha(1222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(ad);
		
		Cliente c2 = new Cliente();
		c2.setSenha(231);
		si.autentica(c2);
	}
}
