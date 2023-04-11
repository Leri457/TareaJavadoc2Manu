package figuras;

/**
 * Esta es la clase punto.
 * @author admin
 * @version 1.0
 * @since 11-04-2023
 *
 */
public class Punto {
/*Variable double que almacena la posicion x*/
private double x;
/*Variable y que almacena la posicion y*/
private double y;

/**
 * Constructor al que no se le pasan parametros
 */
public Punto(){
x = 0;
y= 0;
}

/**
 * Constructor al que se le pasan parametros
 * @param x: posicion x
 * @param y: posicion y
 */
public Punto(double x, double y){
this.x = x;
this.y = y;
}

/**
 * Constructor al que se le pasa un objeto de tipo Punto
 * @param p: objeto de tipo punto
 */
public Punto(Punto p){
x = p.x;
y = p.y;
}

/**
 * Este metodo devuelve la posición x
 * @return the x
 */
public double getX(){
return x;
}

/**
 * Este método devuelve la posición y
 * @return the y
 */
public double getY(){
return y;
}

/**
 * Este método establece la posición x
 * @param x the x to set
 */
public void setX(double x){
this.x = x;
}

/**
 * Este metodo establece la posicion y
 * @param y the y to set
 */
public void setY(double y){
this.y = y;
}

/**
 * Este metodo calcula la distancia entre 2 puntos
 * @param p: objeto de tipo punto
 * @return double
 */
public double distancia(Punto p){
return Math.sqrt (Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
}

/**
 * Este método crea un punto simétrico
 * @return nuevoP: objeto de tipo punto
 */
public Punto simetrico(){
Punto nuevoP = new Punto (this.x * -1, this.y);	
return nuevoP ;
}

/**
 * Este método compara dos puntos para ver si son iguales o no
 * @param p: objeto de tipo punto
 * @return boolean
 */
public boolean compara(Punto p){
if (p.x == x && p.y == y)
   return true;
else
   return false;
}

/**
 * Este es el método toString de la clase
 */
public String toString() {
	return "(" + getX() + "," + getY() + ")";
}
}
