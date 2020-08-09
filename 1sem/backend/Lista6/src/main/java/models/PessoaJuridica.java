package models;

public class PessoaJuridica extends Cliente {
  private String cnpj;

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}