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

package questao04;
import java.util.Scanner;
/**
 *
 * @author Pedro Spindola
 * @date 17/03/2024
 * @brief Class Principal
 */
public class Principal {
    public static void main(String[] args) {
        int navegation;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("1 - Adicionar cliente. \n2 - Sair.");
            navegation = scanner.nextInt();
                    
            if(navegation == 1){
                scanner.nextLine();
                System.out.print("\nInforme o nome: ");
                String nome = scanner.nextLine();
                System.out.print("\nInforme a razão: ");
                String razao = scanner.nextLine();
                System.out.print("\nInforme o cnpj: ");
                String cnpj = scanner.nextLine();
                System.out.print("\nInforme a rua: ");
                String rua = scanner.nextLine();
                System.out.print("\nInforme o complemento: ");
                String complemento = scanner.nextLine();
                System.out.print("\nInforme o bairro: ");
                String bairro = scanner.nextLine();
                System.out.print("\nInforme a cidade: ");
                String cidade = scanner.nextLine();
                System.out.print("\nInforme o estado: ");
                String estado = scanner.nextLine();
                System.out.print("\nInforme o numero: ");
                int numero = scanner.nextInt();
                System.out.print("\nInforme o cep: (Apenas numeros)");
                int cep = scanner.nextInt();
                Cadastro cadastro = new Cadastro(cnpj, razao, nome, rua, complemento, bairro, cidade, estado, numero, cep);
                System.out.println("Cliente Cadastrada.");
                System.out.println("- - - Detalhe - - -\n");
                cadastro.ExibirCadastro();
            } else if(navegation == 2){
                System.out.println("Programa Finalizado.");
                break;
            } else if(navegation != 2){
                System.out.println("Opção Invalida.");
            }
        } while(true);
    }
}
