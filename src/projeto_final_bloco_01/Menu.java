package projeto_final_bloco_01;

import java.util.Scanner;

import projeto_final_bloco_01.Model.Veiculo;
import projeto_final_bloco_01.util.Cores;

public class Menu {

	public static void main(String[] args) {
		int opcao = 0, ano_de_fabricacao=0;
		String marca="", modelo="", tipo_de_veiculo="";
		float valor=0.0f;

//		public Veiculo(String marca, String modelo,String tipo_de_veiculo, float valor, int ano_de_fabricacao) {
//			super(marca, modelo, valor, ano_de_fabricacao);
//			this.tipo_de_veiculo = tipo_de_veiculo;
//		}
		
		Veiculo carro = new Veiculo("Volvo","s60","SUV",2022,300000.0f);
		Veiculo carro2 = new Veiculo("Ferrari","sf90","SuperSportivo",2024,7000000.0f);
		
		Scanner ler = new Scanner(System.in);
		
		do {

			System.out.println(Cores.TEXT_BLUE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("           Loja de Veiculos TIO PATINHAS             ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Veiculo                    ");
			System.out.println("            2 - Listar Veiculos                      ");
			System.out.println("            3 - Atualizar veiculo                    ");
			System.out.println("            4 - Deletar veiculo                      ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          "+Cores.TEXT_RESET);
			
			opcao = ler.nextInt();
			

			switch (opcao) {
			case 0:
				System.out.println("Programa Finalizado!!");
				break;
			case 1:
				System.out.println("Digite a marca do veiculo:");
				marca = ler.next();
				System.out.println("Digite o modelo do veiculo:");
				modelo = ler.next();
				System.out.println("Digite o ano de fabricação do veiculo:");
				ano_de_fabricacao = ler.nextInt();
				System.out.println("Digite o tipo do veiculo:"); // se vai ser esportivo, utilitario, SUV;
				tipo_de_veiculo = ler.next();
				System.out.println("Digite o valor do veiculo");
				valor = ler.nextFloat();
				Veiculo veiculo = new Veiculo(marca, modelo, tipo_de_veiculo, ano_de_fabricacao, valor);
				System.out.println("Inserido com Sucesso!");
				break;				
			case 2:
				
					System.out.println("---------------------------");
					carro.visualisar();
					System.out.println("---------------------------");
					carro2.visualisar();
					System.out.println("---------------------------");
					// veiculo.visualisar(); por não ser inicializada não deixara exibir, mas vou arrumar no controller usando collections
				
				break;
			case 3: //para atualizar vai ter que reescrever os valores mas iremos usar funções para isso futuramente, por enquanto eu só declarei que ele ira digitar os dados
				System.out.println("Digite a marca do veiculo:");
				marca = ler.next();
				System.out.println("Digite o modelo do veiculo:");
				modelo = ler.next();
				System.out.println("Digite o ano de fabricação do veiculo:");
				ano_de_fabricacao = ler.nextInt();
				System.out.println("Digite o tipo do veiculo:"); // se vai ser esportivo, utilitario, SUV;
				tipo_de_veiculo = ler.next();
				System.out.println("Digite o valor do veiculo");
				valor = ler.nextFloat();
				
				carro.setMarca(marca);
				carro.setModelo(modelo);
				carro.setAno_de_fabricacao(ano_de_fabricacao);
				carro.setTipo_de_veiculo(tipo_de_veiculo);
				carro.setValor(valor);
				System.out.println("Atualizado com Sucesso!");
				carro.visualisar();
				break;
			case 4:
				//aqui é onde ficara o metodo que vai ser utilizado para excluir um veiculo
				break;

			default:
				break;
			}

		} while (opcao != 0);

		ler.close();

	}

}
