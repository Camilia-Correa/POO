//Crear una Circunferencia en un applet usando solo el método drawString
//Nombre: Maria Camila Correa Ardila
//Codigo: 20202020078
import java.awt.Font;
import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circulo extends JApplet {

  public void paint (Graphics g) {
    //Creamos un color para el string, en este caso lo quiero rosa
    Color colorRosa=new Color(255, 175, 175);
    g.setColor(colorRosa);
    //Generamos una nueva fuente, para poder modificar el tamaño del string y su fuente
    Font currentFont = g.getFont();
    Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.4F);
    g.setFont(new Font("Gadugi", Font.PLAIN, 300));
    //Dibujamos el circulo (en este caso utilizare una "o" para simularlo) y en las cordenadas en el que lo queremos
    g.drawString ("o", 60, 210);
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("Ciculo de Camila");
    Circulo circuloApplet = new Circulo();
    circuloApplet.init();
    frame.getContentPane().add(circuloApplet);
    frame.setSize(300,300);
    frame.setVisible(true);
  }
}