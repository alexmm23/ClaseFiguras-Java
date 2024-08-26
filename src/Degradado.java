import javax.swing.*;
import java.awt.*;

public class Degradado extends JFrame {
    private JPanel panel;

    public Degradado() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        setSize(500, 500);
        setTitle("Figuras");
        panel = new JPanel();
        setContentPane(panel);
        setBounds(0, 0, 800, 600);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(new Color(51,200,255));
        g.fillRect(1,1,800, 600);


        g.setColor(Color.white);
        g.drawString("--Tipos de lineas--", 50, 50);
        Graphics2D lineas = (Graphics2D) g;
        g.setColor(Color.black);
        lineas.setStroke(new BasicStroke(1));

        //Parametros de clase BasicSTROKE PARA LOS TIPOS DE LINEAS:
        //1- Ancho: Valor numerico >= 0
        //2- Decoración de extremos, dada por las constantes:
        //  BasicStroke.CAP_BUTT
        //  BasicStroke.CAP_ROUND
        //  BasicStroke.CAP_SQUARE
        //3- Final de la linea, dada por las constantes:
        //  BasicStroke.JOIN_BEVEL
        //  BasicStroke.JOIN_MITER
        //  BasicStroke.JOIN_ROUND
        //4- Limite para recordar la union de extremos, debe ser >=1
        //5- Tamaño de pixeles de las lineas y espacios, matríz de numeros flotantes
        // 10 pixeles para la linea, 10 pixeles para el espacio
        float [] guiones1 = {10,10};
        float [] guiones2 = {21, 9,3,8};
        float [] guiones3 = {25,25};
        float [] guiones4 = {5};
        //6-Desplazamiento de patrón de guiones

        lineas.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND, 0, guiones1, 0));
        lineas.drawLine(50, 80, 150, 180);
        lineas.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL, 0, guiones2, 0));
        lineas.drawLine(150, 80, 250, 180);
        lineas.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND, 0, guiones3, 0));
        lineas.drawLine(250,80, 350, 180);
        lineas.setStroke(new BasicStroke(2, BasicStroke.CAP_SQUARE,BasicStroke.JOIN_ROUND, 0, guiones4, 0));
        lineas.drawLine(350,80, 450, 180);
        lineas.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL, 0, guiones1, 0));
        lineas.drawRect(500,80,100,100);
        lineas.drawOval(650,80,100,100);
        //imagenes
        g.setColor(Color.white);
        g.drawString("--Imagenes--", 50, 240);
        ImageIcon imagen = new ImageIcon("src/imagenes/biodiversidad.png");
        g.drawImage(imagen.getImage(), 50, 240, this);
        ImageIcon imagen2 = new ImageIcon("src/imagenes/clima.png");
        g.drawImage(imagen2.getImage(), 180, 240, this);

        //Degradado lineal
        Graphics2D degradado = (Graphics2D) g;
        //La clase tiene distintos parámetros
        //x1,y1 coordenada donde inicia el degradado
        //Color inicial del degradado (rojo)
        //x2,y2 coordenada donde termina el degradado
        //Color final del degradado (azul)
        //Repetición del patrón de degradado (true)
        GradientPaint gp= new GradientPaint(0,0,Color.blue, 20, 20, Color.cyan, true);
        degradado.setPaint(gp);
        degradado.fillRect(50, 400, 200, 100);
        GradientPaint gp2= new GradientPaint(0,0,Color.red, 20, 20, Color.green, true);
        degradado.setPaint(gp2);
        degradado.fillOval(300, 400, 200, 100);

    }
    public static void main(String[] args) {
        Degradado ventana = new Degradado();
        ventana.setVisible(true);
    }
}
