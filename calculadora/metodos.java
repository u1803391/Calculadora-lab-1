/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


public class metodos 
{
    public int sumar (int n1 , int n2)
    {
        int resultado = 0;
        resultado = n1 + n2; 
        return resultado;   
    }
    public int restar (int n1 , int n2)
    {
        int resultado = 0;
        resultado = n1 - n2; 
        return resultado;   
    }
    public int multiplicar (int n1 , int n2)
    {
        int resultado = 0;
        resultado = n1 * n2; 
        return resultado;   
    }
    public int dividir (int n1 , int n2)
    {
        int resultado = 0;
        resultado = n1 / n2; 
        return resultado;
    }
    public int porcentaje (int n1 , int n2)
    {
        int resultado = 0;
        resultado = (n1 * n2)/100; 
        return resultado;
    }
}
