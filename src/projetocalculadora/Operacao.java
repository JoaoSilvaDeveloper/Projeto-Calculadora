/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocalculadora;
import javax.swing.*;
/**
 *
 * @author Treinamento
 */
public class Operacao {
    boolean vvirgula = false;
    String mm="+";
    public void visor(JButton botao, JLabel visor){
        if (visor.getText().equals("0")){
            visor.setText(botao.getText());
        }else{
            visor.setText(visor.getText()+botao.getText());
        }
    }
    public void apagar(JLabel resultado,JButton apagar){
            if (resultado.getText().substring(resultado.getText().length()-1).equals(",")){
            vvirgula=false;            
        }
        if (!resultado.getText().equals("0")){
            if ((resultado.getText().length()==2)&& (mm.equals("-"))){
                resultado.setText("0");
                mm="+";
            }
            resultado.setText(resultado.getText().substring(0,resultado.getText().length()-1));            
            if (resultado.getText().equals("")){
                 resultado.setText("0");
                 mm="+";
            }
        }
    }
    
    public void virgula(JLabel resultado,JButton virgula){
            if (vvirgula==false){
            resultado.setText(resultado.getText()+",");
            vvirgula=true;
        }
    }                                       
    
    public void fracao2(JLabel resultado,JButton fracao2){
        if (!(resultado.getText().equals("0"))){
        if (mm.equals("+")){                
            resultado.setText("-"+resultado.getText()); 
            mm="-";
        }else if(mm.equals("-")){             
                resultado.setText(resultado.getText().substring(1,resultado.getText().length()));            
                mm="+";
            }
        } 
    }   
    
    public void C(JLabel resultado,JButton c){
        resultado.setText("0"); 
        vvirgula=false;   
    }
    }
    

    

