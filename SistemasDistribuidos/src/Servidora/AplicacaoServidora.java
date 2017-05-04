package Servidora;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class AplicacaoServidora{
	
    public static void main(String argv[]){
        HelloServidora objetoServidor;

        try{
            objetoServidor = new HelloServidora();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("HelloServidora",objetoServidor); 
            System.out.println("ObjetoServidor esta ativo!");
        
        }
        catch(RemoteException re){
            System.out.println("Erro Remoto: "+re.toString());
        }
        catch(Exception e){
            System.out.println("Erro Local: "+e.toString());
        }
    }
    
} 
