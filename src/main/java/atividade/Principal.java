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

package atividade;

import java.util.Scanner;

/**
 *
 * @author Pedro Spindola
 * @date 15/03/2024
 * @brief Class Principal
 */
public class Principal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int navegation;
        do{ //Loop do while para fazer o menu.
            System.out.println("Selecione a opção. \n \n");
            System.out.println("1 - Cadastrar veículo. \n2 - Remover veículo. \n3 - Editar. \n4 - Sair.\n");
            navegation = scanner.nextInt(); //Ler a opcao de navagacao do usuario.
            // Inicio da estrutura condicional para navegar pela a opção selecionada.
            if(navegation == 1){ // Cadastrar veículo.
                do{ // Loop do while para fazer o menu
                    System.out.print("\nCadastrar Veículo ");
                    System.out.print("\n1 - Carro.\n2 - Ônibus.\n3 - Caminhão.\n4 - Cancelar.\n");
                    int opcao = scanner.nextInt(); //Ler a opcao de navagacao do usuario.
                    // Inicio da estrutura condicional para navegar pela a opção selecionada.
                    if (opcao == 1){ // Cadastrar Carro.
                        System.out.print("\nInforme o ano do carro: ");
                        int ano = scanner.nextInt();
                        System.out.print("\nInforme a marca do carro: ");
                        String marca = scanner.next();
                        System.out.print("\nInforme a placa do carro: ");
                        String placa = scanner.next();
                        Carro carro = new Carro(placa, ano, marca);
                        System.out.print("\nCadastro concluido com sucesso.\n");
                        carro.exibirDados();
                    } else if (opcao == 2){ // Cadastrar Onibus.
                        System.out.print("\nInforme o ano do ônibus: ");
                        int ano = scanner.nextInt();
                        System.out.print("\nInforme a quantidade de assentos: ");
                        int assentos = scanner.nextInt();
                        System.out.print("\nInforme a placa do ônibus: ");
                        String placa = scanner.next();
                        Onibus onibus = new Onibus(placa, ano, assentos);
                        onibus.exibirDados();
                    } else if (opcao == 3){ // Cadastrar Caminhao.
                        System.out.print("\nInforme o ano do carro: ");
                        int ano = scanner.nextInt();
                        System.out.print("\nInforme a quantidade de eixos: ");
                        int eixos = scanner.nextInt();
                        System.out.print("\nInforme a placa do carro: ");
                        String placa = scanner.next();
                        Caminhao caminhao = new Caminhao(placa, ano, eixos);
                        caminhao.exibirDados();
                    } else if (opcao == 4){ // Cancelar.
                        break;
                    } else if (opcao != 4){ // Opção invalida.
                        System.out.print("\nOpção invalida...\n");
                    }
                } while(true);
            } else if(navegation == 2){ // Remover veículo.
                
            } else if(navegation == 3){ // Editar veículo.
                
            } else if(navegation == 4){ // Sair.
                break;
            } else if(navegation != 4){ // Opção invalida.
                System.out.print("\nOpção invalida...\n");
            }

        } while(true);
    }
}
