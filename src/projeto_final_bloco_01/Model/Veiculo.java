package projeto_final_bloco_01.Model;

public class Veiculo extends Produto{
	private String tipo_de_veiculo;	
	
	public Veiculo(String marca, String modelo,String tipo_de_veiculo, int ano_de_fabricacao, float valor) {
		super(marca, modelo, valor, ano_de_fabricacao);
		this.tipo_de_veiculo = tipo_de_veiculo; //categoria do veiculo
		
	}

	
	
	public String getTipo_de_veiculo() {
		return tipo_de_veiculo;
	}



	public void setTipo_de_veiculo(String tipo_de_veiculo) {
		this.tipo_de_veiculo = tipo_de_veiculo;
	}

	


	@Override
	public void visualisar() {
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("ID do veículo:"+this.getId());
		super.visualisar();
		System.out.println("O Tipo de ceículo é: "+this.getTipo_de_veiculo());
		System.out.println("-----------------------------------------------");
		System.out.println();
	}
	
}
