package projeto_final_bloco_01;

import java.util.Scanner;

import projeto_final_bloco_01.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		
		int opcao = 0, ano_de_fabricacao=0;
		String marca="", modelo="", tipo_de_veiculo="";
		float valor=0.0f;

		Scanner ler = new Scanner(System.in);

		//futuramente tera 2 classes , Produto e Veiculo
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
			
			
//			int opcao = 0, ano_de_fabricacao;
//			String marca, modeloString, tipo_de_veiculo;
//			float valor;
			

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
				break;
			case 2:
				if(marca.equals("")) {
					System.out.println("Nenhum veículo encontrado");
				}else {
					System.out.println("Marca do veículo: "+marca);
					System.out.println("Digite o modelo do veículo: "+modelo);
					System.out.println("Digite o ano de fabricação do veículo: "+ano_de_fabricacao);
					System.out.println("Digite o tipo do veículo: "+tipo_de_veiculo); // se vai ser esportivo, utilitario, SUV;
					System.out.println("Digite o valor do veículo R$:"+valor);
				}
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
