/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastropessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sun.java2d.loops.CompositeType;

/**
 *
 * @author 082170019
 */
public class CadastroPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            List<Pessoa> lista = new ArrayList<Pessoa>();
            
            
        Scanner scan  = new Scanner( System.in);   
    
            
            int x = 0;
            
            while(x != 3 ){
             
                 System.out.println("Digite 1 para cadastrar e 2 para listar 3 para sair");
                x= Integer.parseInt(scan.nextLine());
                
                
                  if(x==1){
                
                Pessoa pe = new Pessoa();
                System.out.println("Digite o nome !");
                pe.setNome(scan.nextLine());
                System.out.println("Digite o sobrenome !");
                pe.setSbreNome(scan.nextLine());
                
                 lista.add(pe);
            }
            else
            {
                for(int i =0;i<lista.size(); i++){
                    System.out.println(lista.get(i).getNome() + " "  +lista.get(i).getSbreNome());
                }
            }
            }
            
          
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
