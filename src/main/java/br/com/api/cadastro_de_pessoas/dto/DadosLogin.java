package br.com.api.cadastro_de_pessoas.dto;

import org.springframework.context.annotation.Bean;

public class DadosLogin {

    private String email;
    private String senha;

    public DadosLogin() {

    }

    public DadosLogin(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
