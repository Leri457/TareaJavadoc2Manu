package figuras;

import java.awt.Color;

/**
 * Esta es la clase Rectángulo y hereda de Figura
 * @author admin
 * @version 1.0
 * @since 11-04-2023
 */
public class Rectangulo extends Figura{
/*Variable de tipo double que almacena la base*/
private double base;
/*Variable de tipo double que almacena la altura*/
private double altura;

/**
 * Constructor al que se le pasan parámetros
 * @param x: posicion x
 * @param y: posicion y
 * @param color: color
 * @param base: base
 * @param altura: altura
 */
public Rectangulo (double x, double y, Color color, double base, double altura){
super (x, y, color);
this.base = base;
this.altura = altura;
}

/**
 * Método que devuelve la base
 * @return the base
 */
public double getBase(){
return base;
}

/**
 * Metodo que devuelve la altura
 * @return the altura
 */
public double getAltura(){
return altura;
}

/**
 * Metodo que establece la base
 * @param base the base to set
 */
public void setBase(double base){
this.base = base;
}

/**
 * Metodo que establece la altura
 * @param altura the altura to set
 */
public void setAltura(double altura){
this.altura = altura;
}

/**
 * metodo que calcula el perímetro del Rectángulo
 */
public double perimetro (){
   return 2 * base + 2 * altura;
}

/**
 * método que calcula el area del Rectángulo
 */
public double area (){ 
   return base * altura;
}
}
