package impostoderenda;

import javax.swing.JOptionPane;

public class JoptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Declara��o de variav�is
        double si; //Sal�rio inicial
        double dir; // Desconto IR
        double sf; // Sal�rio final
        
        //convers�o de dados//
        
        ////entrada de dados com convers�o de tipos juntas
        si = Double.parseDouble(JOptionPane.showInputDialog("Entre com o seu sal�rio"));
        
        //processamento
        if ((si>=0) && (si<=1903.98)) {
            JOptionPane.showMessageDialog(null, "Voc� est� insento");
            
        } else {
            if ((si>=1903.99) && (si<=2826.65)) {
                dir=((si*0.075)-142.80);
                sf=si-dir;
                JOptionPane.showMessageDialog(null, "Sal�rio inicial: "+ si +" Desconto IR: "+ dir +" Sal�rio final: "+ sf);
                
            } else {
                if ((si>=2826.66) && (si<=3751.05)) {
                    dir=((si*0.15)-354.80);
                    sf=si-dir;
                    JOptionPane.showMessageDialog(null, "Sal�rio inicial: "+ si +" Desconto IR: "+ dir +" Sal�rio final: "+ sf);
                
                } else {
                    if ((si>=3751.06) && (si<=4664.68)) {
                        dir=((si*0.225)-636.13);
                        sf=si-dir;
                        JOptionPane.showMessageDialog(null, "Sal�rio inicial: "+ si +" Desconto IR: "+ dir +" Sal�rio final: "+ sf);
                    
                    } else {
                        if (si>4664.69) {
                            dir=((si*0.275)-869.36);
                            sf=si-dir;
                            JOptionPane.showMessageDialog(null, "Sal�rio inicial: "+ si+ " " +" Desconto IR: "+ dir+ " " +" Sal�rio final: "+ sf);
                            
                        } else {
                                JOptionPane.showMessageDialog(null, "Digite apenas n�meros positivos", "E R R O", JOptionPane.ERROR_MESSAGE);
                                }
                        }
                    }    
                } 
        }
    }

}