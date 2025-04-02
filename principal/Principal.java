package principal;

import pessoa.Pessoa;
import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;

public class Principal {
    
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Ana");
		System.out.println("Nome: " + pessoa.getNome());
		
		PessoaFisica pessoaFisica = new PessoaFisica("Iris", "123.456.789-00");
		System.out.println("Nome: " + pessoaFisica.getNome() + " CPF: " + pessoaFisica.getCpf());

		PessoaJuridica pessoaJuridica = new PessoaJuridica("Escola", "03.278.251/0001-32");
		System.out.println("Nome: " + pessoaJuridica.getNome() + " CNPJ: " + pessoaJuridica.getCnpj());
  }
}
