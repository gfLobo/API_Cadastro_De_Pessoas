package br.com.api.cadastro_de_pessoas.service;

import br.com.api.cadastro_de_pessoas.model.client.Cliente;
import br.com.api.cadastro_de_pessoas.model.endereco.Endereco;

import java.util.List;


public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);
	List<Endereco> buscaDeEnderecos(Long id);
	Endereco inserirEndereco(Long id, Endereco endereco);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
