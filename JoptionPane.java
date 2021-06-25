package impostoderenda;

import javax.swing.JOptionPane;

public class JoptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Declaração de variavéis
        double si; //Salário inicial
        double dir; // Desconto IR
        double sf; // Salário final
        
        //conversão de dados//
        
        ////entrada de dados com conversão de tipos juntas
        si = Double.parseDouble(JOptionPane.showInputDialog("Entre com o seu salário"));
        
        //processamento
        if ((si>=0) && (si<=1903.98)) {
            JOptionPane.showMessageDialog(null, "Você está insento");
            
        } else {
            if ((si>=1903.99) && (si<=2826.65)) {
                dir=((si*0.075)-142.80);
                sf=si-dir;
                JOptionPane.showMessageDialog(null, "Salário inicial: "+ si +" Desconto IR: "+ dir +" Salário final: "+ sf);
                
            } else {
                if ((si>=2826.66) && (si<=3751.05)) {
                    dir=((si*0.15)-354.80);
                    sf=si-dir;
                    JOptionPane.showMessageDialog(null, "Salário inicial: "+ si +" Desconto IR: "+ dir +" Salário final: "+ sf);
                
                } else {
                    if ((si>=3751.06) && (si<=4664.68)) {
                        dir=((si*0.225)-636.13);
                        sf=si-dir;
                        JOptionPane.showMessageDialog(null, "Salário inicial: "+ si +" Desconto IR: "+ dir +" Salário final: "+ sf);
                    
                    } else {
                        if (si>4664.69) {
                            dir=((si*0.275)-869.36);
                            sf=si-dir;
                            JOptionPane.showMessageDialog(null, "Salário inicial: "+ si+ " " +" Desconto IR: "+ dir+ " " +" Salário final: "+ sf);
                            
                        } else {
                                JOptionPane.showMessageDialog(null, "Digite apenas números positivos", "E R R O", JOptionPane.ERROR_MESSAGE);
                                }
                        }
                    }    
                } 
        }
    }

}