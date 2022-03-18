package br.com.ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author Eduardo Sganderla
 *
 * @version 1.0.0, 18/03/2022
 */
public class ReflectListConstructor {

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

        Constructor<?>[] constructors = classe.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors){
            System.out.println(constructor);
        }
    }
}
