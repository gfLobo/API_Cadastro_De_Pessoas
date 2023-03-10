package br.com.api.cadastro_de_pessoas.dto;

import br.com.api.cadastro_de_pessoas.model.user.User;

public class UserAutheticatedDTO {
    private String tipo;
    private String email;
    private String nome;
    private String token;

    public UserAutheticatedDTO(String email, String nome, String token, String tipo) {

        this.email = email;
        this.nome = nome;
        this.token = token;
        this.tipo = tipo;
    }

    public UserAutheticatedDTO(){}

    public static UserAutheticatedDTO toDTO(User user, String tipo) {
        return new UserAutheticatedDTO(user.getEmail(), user.getNome(), user.getToken(), tipo);
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getToken() {
        return token;
    }

    public String getTipo() {
        return tipo;
    }
}
