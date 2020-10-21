package carro;

public class Item {

	private int quantidade;
	private String cor;
	private double precoUnitario;
	private double valorItem;
	private Fornecedor fornecedor;
	private Peca peca;
	
	public Item(int quantidade, String cor, double precoUnitario, Fornecedor fornecedor, Peca peca) {
		this.quantidade = quantidade;
		this.cor = cor;
		this.precoUnitario = precoUnitario;
		this.valorItem = calcValorItem();
		this.fornecedor = fornecedor;
		this.peca = peca;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public double getValorItem() {
		return valorItem;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}
	
	public double calcValorItem() {
		return quantidade * precoUnitario;
	}
}
