package br.com.ex;

import java.lang.reflect.Method;

/**
 * @author Eduardo Sganderla
 *
 * @version 1.0.0, 18/03/2022
 */
public class ReflectListMethod {

    /**
     *
     * @param args
     * @throws ClassNotFoundException
     *
     *
     * Acessar uma classe via Reflection.
     * Lista todos os constructors da classe
     */
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> classe = Class.forName("br.com.ex.model.Pessoa");

        /** */
        // Method[] methods = classe.getDeclaredMethods();

        /** */
        Method[] methods = classe.getMethods();


        for(Method method : methods){

            System.out.println("Método: " + method);

            Class<?>[] parametros = method.getParameterTypes();

            for (Class<?> parametro : parametros){
                System.out.println("Parâmetro do método " + parametro);
            }


            Class<?>[] excecoes = method.getExceptionTypes();

            for(Class<?> excecao : excecoes) {
                System.out.println("Exceções do método ");
            }
        }
    }
}
