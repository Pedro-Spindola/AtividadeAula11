/*
 * Copyright (C) 2024 Pedro Spindola
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package questao03;

/**
 *
 * @author Pedro Spindola
 * @date 17/03/2024
 * @brief Class Cadastro
 */
public class Cadastro {
    private Clientes clientes;
    private Endereco endereco;
    
    public Cadastro(String nome, String telefone, String rua, String complemento, String bairro, String cidade, String estado, int numero, int cep) {
    clientes = new Clientes(nome, telefone);
    endereco = new Endereco(rua, complemento, bairro, cidade, estado, numero, cep);
    }
    
    public void ExibirCadastro()
    {
        System.out.println("Nome: " + clientes.getNome());
        System.out.println("Curso: " + clientes.getTelefone());
        endereco.ExibirEndereco();
    }
}
