package figuras;

import java.awt.Color;

/**
 * Esta es la clase cuadrado, que hereda de Rectangulo
 * @author admin
 * @version 1.0
 * @since 11-04-2023
 */
public class Cuadrado extends Rectangulo{

/**
 * Constructor con parámetros 
 * @param x: posicion x
 * @param y: posicion y
 * @param color: color
 * @param lado: lado
 */
public Cuadrado (double x, double y, Color color, double lado){
super (x, y, color, lado, lado);
}
}
