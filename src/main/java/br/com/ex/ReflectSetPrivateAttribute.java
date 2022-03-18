package br.com.ex;

import br.com.ex.model.Pessoa;
import java.lang.reflect.Field;

/**
 * @author Eduardo Sganderla
 *
 * @version 1.0.0, 18/03/2022
 */
public class ReflectSetPrivateAttribute {

    /**
     *
     * @param args
     * @throws ClassNotFoundException
     *
     *
     * Acessar uma classe via Reflection.
     * Acessar um atributo privado, e substituir o seu valor.
     */
    public static void main(String[] args) throws ClassNotFoundException {

        Pessoa pessoa = new Pessoa(1L, "Reflect Exemple", "reflect@ex.com.br", "99999999999");

        System.out.println("Nome: " + pessoa.getNome() + ", e-mail Atual: " + pessoa.getEmail());

        Class<?> classe = Class.forName("br.com.ex.model.Pessoa");

        try{
            Field email = classe.getDeclaredField("email");

            /** Parametro que permite acessar um atributo privado */
            email.setAccessible(true);
            email.set(pessoa, "novo.reflect@ex.com.br");

            System.out.println("Nome: " + pessoa.getNome() + ", atributo e-mail atualizado: " + email.get(pessoa));
        }
        catch (IllegalAccessException e){
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
