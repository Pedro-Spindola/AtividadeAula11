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

/**
 *
 * @author Pedro Spindola
 * @date 15/03/2024
 * @brief Class Onibus
 */
public class Onibus extends Veiculo{
    int assentos;
    
    public Onibus(String placa, int ano, int assentos){
    super(placa, ano);
    this.assentos = assentos;
    }
    public void setAssentos(int assentos){
        this.assentos = assentos;
    }
    public int getAssentos(){
        return assentos;
    }
    public void exibirDados(){
        System.out.println(String.format("--- Datelhes ---\nVeículo: Ônibus \nPlaca: " + placa + "\nAno: " + ano + "\nAssentos: " + assentos));
    }
}
