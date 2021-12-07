
public class testeFuncionario {
	public static void main(String[] args) {
		Funcionario igor = new Gerente ();
		igor.setSalario(4000);
		igor.setCpf("0000000-00");
		igor.setNome("Igor Gabriel");
		
		System.out.println("O salario do " + igor.getNome() + " bruto é : " + igor.getSalario() );
		System.out.println("Mas com a bonificação o valor é : " + igor.getBonificacao());
		System.out.println("E o salario final é de : " + (igor.getBonificacao() + igor.getSalario()));
	}
}
