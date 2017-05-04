package Interfaces;

import java.rmi.*;

public interface Hello extends Remote{
	void imprimirOla(String oqImprimir) throws RemoteException;
	void soma(int a, int b) throws RemoteException;
} 
