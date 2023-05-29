package entities;

public class produtos {
	private String nome;
	private Double valor;
	private int qtde;
	
	
	
	
	public produtos() {

	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public Double getValor() {
		return valor;
	}




	public void setValor(Double valor) {
		this.valor = valor;
	}




	public int getQtde() {
		return qtde;
	}




	public void setQtde(int qtde) {
		this.qtde = qtde;
	}




	public produtos(String nome, Double valor, int qtde) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.qtde = qtde;
	}







	
	
	
}
