package carro;

public class Fornecedor {
	
	private String CNPJ ;
	private String razaoSocial;	
	
	public Fornecedor(String cNPJ, String razaoSocial) {
		CNPJ = cNPJ;
		this.razaoSocial = razaoSocial;
	}
	
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String toString() {
		return CNPJ +" "+ razaoSocial;
	}

}
