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

package questao01;

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
            System.out.println("1 - Adicionar Faixa. \n2 - Sair.");
            navegation = scanner.nextInt();
                    
            if(navegation == 1){
                System.out.print("\nInforme o nome da musica: ");
                String nome = scanner.nextLine();
                System.out.print("\nInforme o tipo da musica: ");
                scanner.next();
                String tipo = scanner.nextLine();
                System.out.print("\nInforme o ano da musica: ");
                int ano = scanner.nextInt();
                System.out.print("\nInforme o nome do compositor: ");
                String compositor = scanner.nextLine();
                System.out.print("\nInforme a nacionalidade do compositor: ");
                String nacionalidade = scanner.nextLine();
                Faixas faixas = new Faixas(nome, tipo, ano, compositor, nacionalidade);
                System.out.println("Faixa Cadastrada.");
                System.out.println("- - - Detalhe - - -\n");
                faixas.ExibirFaixa();
            } else if(navegation == 2){
                System.out.println("Programa Finalizado.");
                break;
            } else if(navegation != 2){
                System.out.println("Opção Invalida.");
            }
        } while(true);
        
    }
}
