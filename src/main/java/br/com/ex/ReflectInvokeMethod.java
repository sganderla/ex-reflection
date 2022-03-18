package br.com.ex;

import br.com.ex.model.Pessoa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * @author Eduardo Sganderla
 *
 * @version 1.0.0, 18/03/2022
 */
public class ReflectInvokeMethod {

    /**
     *
     * @param args
     * @throws ClassNotFoundException
     *
     *
     * Acessar uma classe via Reflection.
     * Invoca os methodos com e sem Prarâmetros
     */
    public static void main(String[] args) throws ClassNotFoundException {

        Pessoa pessoa = new Pessoa(1L, "Reflect Exemple", "reflect@ex.com.br", "99999999999");

        try {
            Class<?> classe = Class.forName("br.com.ex.model.Pessoa");

            Method method = classe.getMethod("formatarCpf");

            Object resultado = method.invoke(pessoa);

            System.out.println("Método sem Parâmetro: " + resultado);


            /** Método com Parâmetro */


            method = classe.getMethod("formatarCpf", String.class);

            Object[] parametros = new Object[1];
            parametros[0] = "88888888888";

            resultado = method.invoke(pessoa, parametros);

            System.out.println("Método com Parâmetro: " + resultado);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
