package br.com.api.cadastro_de_pessoas.controller;

import br.com.api.cadastro_de_pessoas.model.user.User;
import br.com.api.cadastro_de_pessoas.security.UserAuthenticationService;
import br.com.api.cadastro_de_pessoas.dto.DadosLogin;
import br.com.api.cadastro_de_pessoas.dto.UserAutheticatedDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    private UserAuthenticationService userAuthenticationService;

    @Autowired
    public AuthenticationController(UserAuthenticationService userAuthenticationService){
        this.userAuthenticationService = userAuthenticationService;
    }

    public AuthenticationController(){

    }


    @PostMapping("/login")
    public ResponseEntity<UserAutheticatedDTO> autenticar(@RequestBody DadosLogin dadosLogin, @RequestHeader String token){
        User user = userAuthenticationService.authenticate(dadosLogin, token);
        return new ResponseEntity<>(UserAutheticatedDTO.toDTO(user, "Bearer "), HttpStatus.ACCEPTED);
    }
}
