package br.com.ex;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author Eduardo Sganderla
 *
 * @version 1.0.0, 18/03/2022
 */
public class ReflectModifers {

    /**
     *
     * @param args
     * @throws ClassNotFoundException
     *
     *
     * Acessar uma classe via Reflection.
     * Modificar os atributos da classe
     */
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> classe = Class.forName("br.com.ex.model.Pessoa");

        System.out.println("Modificador de acesso");

        int modificador = classe.getModifiers();
        System.out.println("Privado: " + Modifier.isPrivate(modificador));
        System.out.println("Público: " + Modifier.isPublic(modificador));
        System.out.println("Protegido: " + Modifier.isProtected(modificador));
        System.out.println("\n-------------------------\n");

        System.out.println("Pacote da classe");
        System.out.println(classe.getPackage());
        System.out.println("\n-------------------------\n");

        System.out.println("SuperClasse");
        System.out.println(classe.getSuperclass());
        System.out.println("\n-------------------------\n");

        System.out.println("Interfaces implementadas pela classe");
        System.out.println(classe.getInterfaces());
        System.out.println("\n-------------------------\n");
    }
}
