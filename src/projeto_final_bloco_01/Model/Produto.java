package projeto_final_bloco_01.Model;

public abstract class Produto {
	
//	int opcao = 0, ano_de_fabricacao;
	private static int contador = 0;  // Contador estático para gerar id único
	private int id;  // ID individual para cada produto
	private String marca;
	private String modelo;
	private int ano_de_fabricacao;
	float valor;
	
	public Produto(String marca, String modelo, float valor,int ano_de_fabricacao) {
		this.id = ++contador;  // Incrementa o contador e atribui o valor ao id
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.ano_de_fabricacao = ano_de_fabricacao;
	}
	public int getId() {
        return id;
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

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	
	public int getAno_de_fabricacao() {
		return ano_de_fabricacao;
	}

	public void setAno_de_fabricacao(int ano_de_fabricacao) {
		this.ano_de_fabricacao = ano_de_fabricacao;
	}

	public void visualisar() {
		System.out.println("A Marca do veículo: "+this.marca);
		System.out.println("O modelo do veículo: "+this.modelo);
		System.out.println("O ano de fabricação do veículo: "+this.ano_de_fabricacao);
		System.out.println("O valor do veículo R$:"+this.valor);
	}
	
	
	
}
