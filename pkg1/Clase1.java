package boletin10.pkg1;
import javax.swing.JOptionPane;

public class Clase1 {
    private int num1;
    private int num2;
    private int vidas;


public void pedirDatos(){  
do {
int numero = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 introduce el numero"));
this.num1=numero;
int vida = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 introduce los intentos"));
this.vidas=vida;
} while (num1>=50 ||num1<=1);
}

public void AdivinarNum(){
do {
int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2 intenta adivinar el numero entre 1 y 50"));
this.num2=numero2;
} while(num2>50 || num2<1); 
}

public void comparar(){
int cont;
for (cont=0;num1!=num2 && cont<vidas;cont++){
AdivinarNum();
if (num2>num1)
JOptionPane.showMessageDialog(null, "El numero a adivinar es mas bajo");
else if (num2<num1)
JOptionPane.showMessageDialog(null, "El numero a adivinar es mas alto");
}
if (num2==num1)
JOptionPane.showMessageDialog(null, "YOU WIN!");
else
JOptionPane.showMessageDialog(null, "GAME OVER \n insert a coin");
}
}
