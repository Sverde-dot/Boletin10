
package boletin10.pkg2;

import javax.swing.JOptionPane;


public class Clase2 {
    
        private int vidas;
        private int Ad;
        private int partida=0;
        private int resta;
        
    public void Juego(){
    }
    
    public void maquina(){
        Ad=(int)(Math.random()*50)+1;
    }
        public void jugador(){
        int numIntro,vidas2;
        vidas=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el numero de intentos."));
        for(vidas2=1;vidas2<=vidas;vidas2++){
        numIntro=Integer.parseInt(JOptionPane.showInputDialog(null,"Jugador.\nIntroduzca un numero."));
        while(numIntro<1||numIntro>50){
        numIntro=Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador.\nIntroduzca una cifra entre 1 y 50."));
        }
        resta=Math.abs(Ad-numIntro);
        
        if(resta>=20){
            System.out.println("Estas muy lejos");
            System.out.println("El numero es"+Ad);
        }
        else if(resta<20 && resta>=10){
            System.out.println("No tan lejos");
        }
        else if(resta<10 && resta>=5){
            System.out.println("Estas acercandote");
        }
        else if(resta<5)
            System.out.println("Estas muy cerca");
        else{
            System.out.println("Acertaste");
        }
        if(vidas2>=vidas){
             JOptionPane.showMessageDialog(null, "Perdiste...");
        }
          
        }
        }
}
