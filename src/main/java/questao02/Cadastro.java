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

/**
 *
 * @author Pedro Spindola
 * @date 17/03/2024
 * @brief Class Cadastro
 */
public class Cadastro {
    private Alunos alunos;
    private Departamento departamento;
    
    public Cadastro(String nome, String curso, String sigla, int matricula, int ingresso, int duracao, String nomedepartamento, String siglaDepartamento) {
    alunos = new Alunos(nome, curso, sigla, matricula, ingresso, duracao);
    departamento = new Departamento(nomedepartamento, siglaDepartamento);
    }
        
    public void ExibirCadastro()
    {
        System.out.println("Nome: " + alunos.getNome());
        System.out.println("Curso: " + alunos.getCurso());
        System.out.println("Sigla: " + alunos.getSigla());
        System.out.println("Matricula: " + alunos.getMatricula());
        System.out.println("Ano do ingresso: " + alunos.getDuracao());
        System.out.println("Departamento: " + departamento.getNome());
        System.out.println("Sigla: " + departamento.getSigla() + "\n");
    }
}
