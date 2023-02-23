package POO;

public class Funcionario {
	
	private String nomeFuncionario;
	private String cargoFuncionario;
	private int codigoFuncionario;
	private String departamento;
	private int codigoDepartamento;
	
	public Funcionario(String nomeFuncionario, String cargoFuncionario, int codigoFuncionario, String departamento,
			int codigoDepartamento) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.cargoFuncionario = cargoFuncionario;
		this.codigoFuncionario = codigoFuncionario;
		this.departamento = departamento;
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getCargoFuncionario() {
		return cargoFuncionario;
	}

	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}

	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(int codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}
	public void visualizar() {
		System.out.println("Nome: "+nomeFuncionario+", Cargo: "+cargoFuncionario+", Código Funcionário: "+codigoFuncionario+
				", departamento: "+departamento+", Código do Departamento: "+codigoDepartamento);
	}
	

}
