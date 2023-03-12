package conversormonedas;

import javax.swing.JOptionPane;

public class ConversorMonedasOracleLatan {

	public static void main(String[] args) {
		
		 int opciones=Integer.parseInt(JOptionPane.showInputDialog(" *** * CONVERSOR DE MONEDAS * *** \n 1.Conversión de soles a Dolares\n 2.Conversión de soles a Euros\n 3.Conversión de soles a Libras Esterlinas\n 4.Conversión de Soles a Yen Japones\n 5. Conversión de soles a Won sul-coreano \n 6. Menú de conversiones Inversas  "));
		
		 switch(opciones){
         case 1:
        	// Convertir soles a dolar
  		   float soles1=Float.parseFloat(JOptionPane.showInputDialog("Conversión de soles a Dolares : "));
  		   float converdolares=soles1/3.77f;	 
  		   JOptionPane.showMessageDialog(null,"Equivale a :"+" $/"+ converdolares+"Dolar");
             break;
         case 2: 
        	// Convertir soles a Euros
  		   float soles2=Float.parseFloat(JOptionPane.showInputDialog("Conversión de soles a Euros  : "));
  		   float convereuros=soles2/4.02f;
  		   JOptionPane.showMessageDialog(null,"Equivale a :"+" €/"+ convereuros+" Euros");
             break;
         case 3 :
        	// Convertir soles a libras    
  		   float soles3=Float.parseFloat(JOptionPane.showInputDialog("Conversión de soles a Libras Esterlinas : "));
  		   float converlibras=soles3/4.52f;
  		   JOptionPane.showMessageDialog(null,"Equivale a :"+" £/"+ converlibras+" Libras Esterlinas");
             break;
         case 4:
        	 // Convertir Soles a Yen Japones
        	float soles4=Float.parseFloat(JOptionPane.showInputDialog("Conversión de soles a Yen Japones : "));
        	float converyenjapones=soles4/0.028f;
            JOptionPane.showMessageDialog(null,"Equivale a :"+" ¥"+ converyenjapones+"Yen Japones");
        	  break;
        	  
         case 5 : 
        	 // Convertir soles a Won sul-coreano
        	 float soles5=Float.parseFloat(JOptionPane.showInputDialog("Conversión de soles a Won sul-coreano : "));
         	 float converWon=soles5/0.0029f;
             JOptionPane.showMessageDialog(null,"Equivale a :"+" "+ converWon+"Won sul-coreano");
         	  break;
         case 6 :
        	 int opciones2=Integer.parseInt(JOptionPane.showInputDialog(" *** * CONVERSOR DE MONEDAS * *** \n 1.Conversión de Dolares a Soles \n 2.Conversión de Euros a Soles \n 3.Conversión  Libras Esterlinas a soles. \n 4.Conversión de Yean Japones a soles.\n 5.Conversión de Won sul-coreano a soles \n 7.Cerrar Programa "));
        	 
        	 
        	 switch(opciones2) {
        	 case 1:
        		 	// Convertir dolar a soles
        		 float dolar1= Float.parseFloat(JOptionPane.showInputDialog("Conversión de Dolar a soles  : "));
        		 float conversoles1=dolar1*3.77f;
        		 JOptionPane.showMessageDialog(null,"Equivale a :"+" S/"+ conversoles1+"Soles");
        		 break;
        	 case 2:
        		   // Conversión de Euros a soles
        		 float euros=Float.parseFloat(JOptionPane.showInputDialog("Conversión de Euros a Soles :"));
        		 float conversoles2=euros*4.02f;
        		 JOptionPane.showMessageDialog(null,"Equivale a :"+" S/"+ conversoles2+"Soles");
        		 break;
        	 case 3:
        		  // Conversión de Libraas Esterlina a soles
        		 float lEsterlinas=Float.parseFloat(JOptionPane.showInputDialog("Conversión de Libraas Esterlina a Soles :"));
        		 float conversoles3=lEsterlinas*4.52f;
        		 JOptionPane.showMessageDialog(null,"Equivale a :"+" S/"+ conversoles3+"Soles");
        		 break;
        	 case 4: 
        		 // Conversión de Yean Japones a soles
        		 float yejapon=Float.parseFloat(JOptionPane.showInputDialog("Conversión de Yean Japones a soles"));
        		 float conversoles4=yejapon*0.028f;
        		 JOptionPane.showMessageDialog(null,"Equivale a :"+" S/"+ conversoles4+"Soles");
        		 break;
        	 case 5:
        		 //Conversión de Won sul-coreano a soles
        		 float wsulco=Float.parseFloat(JOptionPane.showInputDialog("Conversión de Won sul-coreano a soles"));
        		 float conversoles5=wsulco*0.0029f;
        		 JOptionPane.showMessageDialog(null,"Equivale a :"+" S/"+ conversoles5+"Soles");
        		 break;
        		    
        	 }
        	 
         
             
     }
		

	}

}
