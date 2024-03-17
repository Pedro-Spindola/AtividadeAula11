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

/**
 *
 * @author Pedro Spindola
 * @date 17/03/2024
 * @brief Class Endereco
 */
public class Endereco {
    String rua, complemento, bairro, cidade, estado;
    int numero, cep;

    public Endereco(String rua, String complemento, String bairro, String cidade, String estado, int numero, int cep) {
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.cep = cep;
    }
    
    public void ExibirEndereco()
    {
        System.out.println("Endereço:\n" + rua + ", " + numero + ", " + complemento + ", " + bairro + ", " + cep + ", " + cidade + ", " + estado);
    }
}
