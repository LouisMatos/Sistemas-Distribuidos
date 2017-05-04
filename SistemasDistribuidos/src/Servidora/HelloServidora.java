package Servidora;

import java.rmi.*;
import javax.swing.*;

import Interfaces.Hello;

import java.rmi.server.UnicastRemoteObject;

public class HelloServidora extends UnicastRemoteObject implements Hello{
   /**
	 * 
	 */
	private static final long serialVersionUID = -5741997524230594145L;

	public HelloServidora() throws RemoteException{}

	public void imprimirOla(String oqImprimir) throws RemoteException{
       JOptionPane.showMessageDialog(null,oqImprimir.toUpperCase(),"Mensagem do Objeto Cliente",JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void soma(int a, int b) throws RemoteException {
		JOptionPane.showMessageDialog(null, a + b, "Mensagem do Objeto Cliente",JOptionPane.INFORMATION_MESSAGE);
	}
} 