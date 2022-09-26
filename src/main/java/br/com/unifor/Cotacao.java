package br.com.unifor;

public class Cotacao {
	private Integer dolar;
	private String data;
	
	public Cotacao(String data){
		this.data = data;
		this.dolar = 5;
	}
	
	public Integer getCotacao() {
		return dolar;
		
	}
}
