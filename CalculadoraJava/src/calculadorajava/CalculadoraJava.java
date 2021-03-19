/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

/**
 *
 * @author usuario
 */
public class CalculadoraJava {
    //rama1
    //PRUEBA DE GITHUB CON COMANDOS EN RAMA1
    //SEGUNDA PRUEBA PARA HACER PULL
    //COMENTARIO DESDE COMANDOS PARA HACER EL SEGUNDO PUSH
    //AHORA ESTA ES LA RAMA2
    //Atributos
    
    /**
     * Primer numero
     */
    private int num1;
    /**
     * Segundo numero
     */
    private int num2;

    //Constructores
    
    /**
     * Constructor con dos parametros
     * 
     * @param a Primer numero
     * @param b Segundo numero
     */
    public CalculadoraJava(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }
    
    //Metodos Públicos
    
    /**
     * Genera la suma de los dos atributos
     * 
     * @return
     */
    public int suma(){
        int result=num1+num2;
        return result;
    }
    
    /**
     * Genera la resta de los dos atributos
     * 
     * @return
     */
    public int resta(){
        int result=num1-num2;
        return result;
    }
    
    /**
     * Genera el producto de los dos atributos
     * 
     * @return
     */
    public int multiplicacion(){
        int result=num1*num2;
        return result;
    }
    
    /**
     * Genera la division del primer atributo entre el segundo
     * 
     * @return
     */
    public int divide(){
        int result=num1/num2;
        return result;
    }

}
