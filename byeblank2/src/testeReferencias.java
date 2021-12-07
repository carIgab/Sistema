
public class testeReferencias {
	public static void main(String[] args) {
		Gerente g2 = new Gerente();
		g2.setSalario(2000.0);
		
		
		Funcionario ig = new Gerente();
		ig.setSalario(3000);
	
		
		EditorVideo iv = new EditorVideo();
		iv.setSalario(4500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g2);
		controle.registra(ig);
		controle.registra(iv);
		
		System.out.println(controle.getSoma());
		
	}
}
