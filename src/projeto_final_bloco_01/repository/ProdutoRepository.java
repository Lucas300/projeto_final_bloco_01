package projeto_final_bloco_01.repository;

import projeto_final_bloco_01.Model.Produto;

public interface ProdutoRepository {
	public void listarTodas();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int id);
}
