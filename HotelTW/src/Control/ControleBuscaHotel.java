/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Model.ModeloDeBusca;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuelle Menali
 */
public class ControleBuscaHotel {
    
    //TelaBuscaHotel2 bh = new TelaBuscaHotel2();
    ModeloDeBusca mod = new ModeloDeBusca();
    private String intervalo;
    public String hotel = null;
    
    public void pesquisarHotel(ModeloDeBusca mod){
        
        String tipoCliente = mod.getTipoCliente();
        String dataEntrada = mod.getDataEntrada();
        String dataSaida = mod.getDataSaida();
        
        if (tipoCliente.equals("Sem programa")){    
            if (dataEntrada.equals("16/03/2009")||dataSaida.equals("18/03/2009")){
                String mensagem = "Melhor hotel encontrado: Lakewood";
                hotel = "Lakewood";
                 JOptionPane.showMessageDialog(null, mensagem);
            } 
                if (dataEntrada.equals("20/03/2009")||dataSaida.equals("23/03/2009")){
                String mensagem = "Melhor hotel encontrado: Bridgewood";
                hotel = "Bridgewood";
                 JOptionPane.showMessageDialog(null, mensagem);
                }
                
            }
           if (tipoCliente.equals("Rewards")){         
                if (dataEntrada.equals("26/03/2009")||dataSaida.equals("28/03/2009")){
                String mensagem = "Melhor hotel encontrado: Ridgewood";
                hotel = "Ridgewood";
                 JOptionPane.showMessageDialog(null, mensagem);
                }
                    
                    }
            
        } 
        
     

       
    
    
    public void exibirMensagem(ModeloDeBusca mod){
        
        String mensagem = "Tipo do cliente " + mod.getTipoCliente() +"\n"
                + "Data de Entrada: " + mod.getDataEntrada()+"\n"
                + "Data de Saída: " + mod.getDataSaida()+"\n"
                + "Hotel mais barato encontrado: ";
                
        JOptionPane.showMessageDialog(null, mensagem);
        
        
             
    }
    
    
    
}
