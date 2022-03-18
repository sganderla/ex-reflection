package br.com.ex;

import java.lang.reflect.Field;

/**
 * @author Eduardo Sganderla
 *
 * @version 1.0.0, 18/03/2022
 */
public class ReflectListAttribute {

    /**
     *
     * @param args
     * @throws ClassNotFoundException
     *
     *
     * Acessar uma classe via Reflection.
     * Lista todos os atributos da classe
     * Lista todos os atributos publicos da classe
     */
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> classe = Class.forName("br.com.ex.model.Pessoa");

        /** Lista todos os atributos da classe */
        //Field[] fields = classe.getDeclaredFields();

        /** Lista todos os atributos publicos da classe */
        Field[] fields = classe.getFields();

        for (Field field: fields){
            System.out.println(field);
        }
    }
}
