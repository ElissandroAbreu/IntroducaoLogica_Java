package POO;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario colaborador1 = new Funcionario("Mateus","Analista",4567,"Financeiro",7);
		
		Funcionario colaborador2 = new Funcionario("Sabrina","Supervisor(a)",6789,"Administrativo",3);
		
		System.out.println("Colaboradores:\n");
		
		colaborador1.visualizar();
		
		colaborador2.visualizar();
		

	}

}
