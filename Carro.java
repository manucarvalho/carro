package carro;

import java.util.ArrayList;
import java.util.List;

public class Carro {

	private String marca;
	private String modelo;
	private String chassi;
	private int anoFabricacao;
	private double precoCusto;
	private List<Item> itens = new ArrayList<>();
	
	public Carro(String marca, String modelo, String chassi, int anoFabricacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.chassi = chassi;
		this.anoFabricacao = anoFabricacao;
		this.precoCusto = calcPrecoCusto();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public double calcPrecoCusto() {
		double totalItens = 0;
		for (Item i :itens) {
			totalItens =+ i.getValorItem();
		}
		precoCusto = totalItens + 0.1 * totalItens + 0.08 * totalItens;
		return precoCusto;
	}
	
	public String toString() {
		return "\nMarca: " +
	            marca + 
	            "\nModelo: " + 
	            modelo + 
	            "\nChassi:  " + 
	            chassi + 
	            "\nAno Fabricação: " + 
	            anoFabricacao + 
	            "\nPreço de Custo: R$ " + 
	            precoCusto;
	}
}
