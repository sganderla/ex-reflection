package br.com.ex.model;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

/**
 * @author Eduardo Sganderla
 *
 * @version 1.0.0, 18/03/2022
 */
public class Pessoa {

    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String senha;

    public static int qtdeTotalPessoas;

    /**
     *
     */
    public Pessoa(){}

    /**
     *
     * @param id
     * @param nome
     * @param email
     * @param cpf
     */
    public Pessoa(Long id, String nome, String email, String cpf){
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    /**
     *
     * @return
     */
    public String getNome(){
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public String formatarCpf() throws ParseException {
        MaskFormatter maskFormatter = new MaskFormatter("###.###.###-##");
        maskFormatter.setValueContainsLiteralCharacters(false);
        return maskFormatter.valueToString(this.cpf);
    }

    /**
     *
     * @param cpf
     * @return
     * @throws ParseException
     */
    public String formatarCpf(String cpf) throws ParseException {
        MaskFormatter maskFormatter = new MaskFormatter("###.###.###-##");
        maskFormatter.setValueContainsLiteralCharacters(false);
        return maskFormatter.valueToString(cpf);
    }

}
