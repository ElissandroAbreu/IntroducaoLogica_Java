package POO;

public class Cliente {
	
	private String nomeCliente;
	private String endereco;
	private String identidadeGenero;
	private int idade;
	private int telefone;
	
	public Cliente(String nomeCliente, String endereco, String identidadeGenero, int idade, int telefone) {
		super();
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.identidadeGenero = identidadeGenero;
		this.idade = idade;
		this.telefone = telefone;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getIdentidadeGenero() {
		return identidadeGenero;
	}

	public void setIdentidadeGenero(String identidadeGenero) {
		this.identidadeGenero = identidadeGenero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void visualizar() {
		System.out.println("Dados Cliente:\nNome: "+nomeCliente+", Identidde de Gênero: "+identidadeGenero+", endereço: "+endereco+
				", idade: "+idade+", telefone: "+telefone);
		
	}
	
	
	
	
	
	
	

}
