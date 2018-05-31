/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamento;

/**
 *
 * @author Decker
 */
public class VagaInsuficienteException extends RuntimeException{
	
	public VagaInsuficienteException(String msg) {
		super(msg);
	}

}