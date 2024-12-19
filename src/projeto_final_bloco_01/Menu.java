package projeto_final_bloco_01;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import projeto_final_bloco_01.Model.Veiculo;
import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.util.Cores;

public class Menu {

	public static void main(String[] args) {
		int opcao = 0, ano_de_fabricacao=0,id;
		String marca="", modelo="", tipo_de_veiculo="";
		float valor=0.0f;
		
		ProdutoController produto = new ProdutoController();
		
		produto.cadastrar(new Veiculo("Volvo","s60","SUV",2022,300000.0f));
		produto.cadastrar(new Veiculo("Ferrari","sf90","SuperSportivo",2024,7000000.0f));
		
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
			
			try {
				opcao = ler.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				ler.nextLine();
				opcao = 0;
			}

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
				
				produto.cadastrar(new Veiculo(marca, modelo, tipo_de_veiculo, ano_de_fabricacao, valor));
				keyPress();
				break;				
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os Produtos\n\n");
				produto.listarTodas();
					
				keyPress();
				break;
			case 3: //para atualizar vai ter que reescrever os valores mas iremos usar funções para isso futuramente, por enquanto eu só declarei que ele ira digitar os dados
				 System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados do Veículo\n\n");
				    System.out.println("Digite o ID do veículo a ser atualizado:");
				    int idAtualizar = ler.nextInt();  // Lê o ID do veículo a ser atualizado

				    // Buscar veículo na coleção usando o ID
				    var buscaProduto = produto.buscarNaCollection(idAtualizar);

				    if (buscaProduto != null) {
				        // Atualizar os dados do veículo existente
				        System.out.println("Digite a nova marca do veículo:");
				        buscaProduto.setMarca(ler.next());
				        System.out.println("Digite o novo modelo do veículo:");
				        buscaProduto.setModelo(ler.next());
				        System.out.println("Digite o novo ano de fabricação do veículo:");
				        buscaProduto.setAno_de_fabricacao(ler.nextInt());
				        System.out.println("Digite a categoria do veículo:"); // Se vai ser esportivo, utilitário, SUV;
				        if (buscaProduto instanceof Veiculo) {
				            ((Veiculo) buscaProduto).setTipo_de_veiculo(ler.next());
				        }
				        System.out.println("Digite o novo valor do veículo:");
				        buscaProduto.setValor(ler.nextFloat());

				    } else {
				        System.out.println("\nVeículo com o ID informado não foi encontrado!");
				    }
				    keyPress();
				    break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Veículo\n\n");

			    System.out.println("Digite o ID do veículo a ser excluído: ");
			    int idDeletar = ler.nextInt();  // Lê o ID do veículo a ser deletado

			    produto.deletar(idDeletar);
			    keyPress();
			    break;
			}

		} while (opcao != 0);

		ler.close();

	}
	public static void keyPress() {

		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
