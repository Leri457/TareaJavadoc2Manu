package figuras;
import java.awt.Color;

/**
 * Esta es la clase abstracta Figura
 * @author admin
 * @version 1.0
 * @since 11-04-2023
 */
public abstract class Figura{
	
/*Atributo privado de tipo Punto*/
private Punto centro;
/*Atributo privado de tipo Color*/
private Color color;

/**
 * Constructor con parámetros de la clase
 * @param x: posicion x
 * @param y: posicion y
 * @param color: color
 */
public Figura(double x, double y, Color color){
centro = new Punto (x, y);
this.color = color;
}

/**
 * Metodo get que devuelve la posicion x
 * @return the x
 */
public double getXCentro(){
return centro.getX();
}

/**
 * Metodo que devuelve la posicion y
 * @return the y
 */
public double getYCentro(){
return centro.getY();
}

/**
 * Metodo que devuelve el color
 * @return the color
 */
public Color getColor(){
return color;
}

/**
 * Metodo que establece una posicion x
 * @param x the x to set
 */
public void setXCentro(double x){
centro.setX (x);
}

/**
 * Metodo que establece una posicion y
 * @param y the y to set
 */
public void setYCentro(double y){
centro.setY (y);
}
/**
 * Metodo que establece un color
 * @param color the color to set
 */
public void setColor(Color color){
this.color = color;
}

/**
 * Metodo abstracto perimetro
 * @return double
 */
public abstract double perimetro();  

/**
 * Metodo abstracto area
 * @return double
 */
public abstract double area();  

/**
 * Metodo que comprueba si una figura es mayor que otra
 * @param otraFigura: Objeto de tipo figura
 * @return int
 */
public int esMayorQue (Figura otraFigura) {
	   if (this.area() > otraFigura.area())
		   return 1;
	   else
		   if (this.area() < otraFigura.area())
			   return -1;
		   else
			   return 0;
	}

}
