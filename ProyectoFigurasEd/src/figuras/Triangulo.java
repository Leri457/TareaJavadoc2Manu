package figuras;

import java.awt.Color;

/**
 * Esta es la clase Triangulo y hereda de Figura
 * @author admin
 * @version 1.0
 * @since 11-04-2023
 */
public class Triangulo extends Figura{
/*Variable double que almacena el lado 1*/
private double lado1;
/*Variable double que almacena el lado 2*/
private double lado2;
/*Variable double que almacena el lado 3*/
private double lado3;

/**
 * Constructor al que se le pasan parámetros
 * @param x: posición x
 * @param y: posición y
 * @param color: color
 * @param lado1: lado 1
 * @param lado2: lado 2
 * @param lado3: lado 3
 */
public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3){
super (x, y, color);
this.lado1 = lado1;
this.lado2 = lado2;
this.lado3 = lado3;
}

/**
 * Este método devuelve el lado1
 * @return the lado1
 */
public double getLado1(){
return lado1;
}

/**
 * Este método devuelve el lado 2
 * @return the lado2
 */
public double getLado2(){
return lado2;
}

/**
 * Este método devuelve el lado 3
 * @return the lado3
 */
public double getLado3(){
return lado3;
}

/**
 * Este método establece el lado1
 * @param lado1 the lado1 to set
 */
public void setLado1(double lado1){
this.lado1 = lado1;
}

/**
 * Este método establece el lado2
 * @param lado2 the lado2 to set
 */
public void setLado2(double lado2){
this.lado2 = lado2;
}

/**
 * Este método establece el lado3
 * @param lado3 the lado3 to set
 */
public void setLado3(double lado3){
this.lado3 = lado3;
}

/**
 * Este método calcula el perímetro del triangulo
 */
public double perimetro (){
   return lado1 + lado2 + lado3;
}

/**
 * Este método calcula el área del triangulo
 */
public double area (){ 
   double sp = perimetro() / 2;
   return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3)); 
}
}
