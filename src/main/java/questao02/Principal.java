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

package questao02;
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
            System.out.println("1 - Adicionar Aluno(a). \n2 - Sair.");
            navegation = scanner.nextInt();
                    
            if(navegation == 1){
                scanner.nextLine();
                System.out.print("\nInforme o nome do aluno(a): ");
                String nomeAluno = scanner.nextLine();
                System.out.print("\nInforme a matricula do aluno(a): ");
                int matricula = scanner.nextInt();
                System.out.print("\nInforme o ano de ingresso: ");
                int ano = scanner.nextInt();
                System.out.print("\nInforme a duração do cruso: ");
                int duracao = scanner.nextInt();
                scanner.nextLine();
                System.out.print("\nInforme o nome do curso: ");
                String nomeCurso = scanner.nextLine();
                System.out.print("\nInforme a sigla do curso: ");
                String siglaCurso = scanner.nextLine();
                System.out.print("\nInforme o nome do departamento: ");
                String nomeDepartamento = scanner.nextLine();
                System.out.print("\nInforme a sigla do departamento: ");
                String siglaDepartamento = scanner.nextLine();
                // String nome, String curso, String sigla, int matricula, int ingresso, int duracao, String nomedepartamento, String siglaDepartamento
                Cadastro cadastro = new Cadastro(nomeAluno, nomeCurso, siglaCurso, matricula, ano, duracao, nomeDepartamento, siglaDepartamento);
                System.out.println("Aluno Cadastrada.");
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
