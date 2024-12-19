package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import projeto_final_bloco_01.Model.Produto;
import projeto_final_bloco_01.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	@Override
	public void listarTodas() {
		for (Produto produto : listaProdutos) {
			produto.visualisar();
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO veículo " + produto.getModelo() + " foi criado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		// Buscar produto pelo ID
		 Produto buscaProduto = buscarNaCollection(produto.getId());
		    
		    if (buscaProduto != null) {
		        // Atualiza o produto na lista, substituindo pelo novo
		        listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
		        System.out.println("\nO veículo com ID: " + produto.getId() + " foi atualizado com sucesso!");
		    } else {
		        System.out.println("\nO veículo com ID: " + produto.getId() + " não foi encontrado!");
		    }
	}

	public Produto buscarNaCollection(int id) {
		for (Produto produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto; // Retorna o produto se o id for encontrado
			}
		}
		return null; // Retorna null caso não encontre o produto com o id fornecido
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(id);
		if (produto != null) {
			if (listaProdutos.remove(produto)) {
				System.out.println("\nO veículo com ID: " + id + " foi deletado com sucesso!");
			}
		} else {
		}
	}

}
