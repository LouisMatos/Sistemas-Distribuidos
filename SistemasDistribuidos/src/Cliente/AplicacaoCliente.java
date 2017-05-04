package Cliente;

import java.rmi.*;
import javax.swing.*;

import Interfaces.Hello;

public class AplicacaoCliente{
    public static void main(String argv[]){
        Hello objetoRemoto;
        String dados;
        int a, b;

        try{
            objetoRemoto = (Hello) Naming.lookup("rmi://localhost:1099/HelloServidora");
            a = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro numero","Entrada de Dados",JOptionPane.QUESTION_MESSAGE));
            b = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o segundo numero","Entrada de Dados",JOptionPane.QUESTION_MESSAGE));
            dados = JOptionPane.showInputDialog(null,"Entre com o dado a ser impresso pelo Objeto Remoto","Entrada de Dados",JOptionPane.QUESTION_MESSAGE);
            objetoRemoto.imprimirOla(dados);
            objetoRemoto.soma(a, b);
            
        }
        catch(RemoteException re){
            JOptionPane.showMessageDialog(null,"Erro Remoto: "+re.toString(),"Erro Remoto",JOptionPane.WARNING_MESSAGE);
            re.printStackTrace();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro Local: "+e.toString(),"Erro Local",JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
    }
} 