package POO;

public class TestaCliente {

	public static void main(String[] args) {
	
		
		Cliente perfil1 = new Cliente("Eliza","Rua das Flores","feminina",28,119764532);
		
		Cliente perfil2 = new Cliente("Tomaz","Rua Gurgel","masculina",23,119675037);
		
		perfil1.visualizar();
		
		perfil2.visualizar();

	}

}
