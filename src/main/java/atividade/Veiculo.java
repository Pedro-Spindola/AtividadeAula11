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
 * @brief Class Veiculo
 */
public class Veiculo {
    String placa;
    int ano;
    
    public Veiculo(){}
    public Veiculo(String placa, int ano){
        super();
        this.placa = placa;
        this.ano = ano;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public String getPlaca(){
        return placa;
    }
    public int getAno(){
        return ano;    
    }
    public void exibirDados(){
        
    }
}
