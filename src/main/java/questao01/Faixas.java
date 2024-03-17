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

/**
 *
 * @author Pedro Spindola
 * @date 17/03/2024
 * @brief Class Faixas
 */
public class Faixas{
    private Musicas musicas;
    private Compositores compositores;
    
    public Faixas(String nome, String tipo, int ano, String compositor, String nacionalidade) {
    musicas = new Musicas();
    compositores = new Compositores();
        
    musicas.setNome(nome);
    musicas.setTipo(tipo);
    musicas.setAno(ano);
    compositores.setCompositor(compositor);
    compositores.setNacionalidade(nacionalidade);
    }
    
    public void ExibirFaixa()
    {
        System.out.println("Nome: " + musicas.getNome());
        System.out.println("Tipo: " + musicas.getTipo());
        System.out.println("Ano: " + musicas.getAno());
        System.out.println("Compositor: " + compositores.getCompositor());
        System.out.println("Nacionalidade: " + compositores.getNacionalidade() + "\n");
    }

}
