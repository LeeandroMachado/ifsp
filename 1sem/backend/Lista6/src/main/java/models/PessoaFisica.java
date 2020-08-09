package models;

public class PessoaFisica extends Cliente {
  private String cpf;

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}