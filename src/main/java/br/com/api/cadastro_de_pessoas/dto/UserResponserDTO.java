package br.com.api.cadastro_de_pessoas.dto;

import br.com.api.cadastro_de_pessoas.model.user.User;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility= JsonAutoDetect.Visibility.ANY)
public class UserResponserDTO {

    private Long id;

    private String nome;
    private String email;
    private String senha;

    public UserResponserDTO(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    public UserResponserDTO(){}

    public static UserResponserDTO toDTO(User user) {
        return new UserResponserDTO(user.getNome(), user.getEmail(), user.getSenha());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
