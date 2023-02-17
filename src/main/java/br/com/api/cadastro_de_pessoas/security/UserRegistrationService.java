package br.com.api.cadastro_de_pessoas.security;

import br.com.api.cadastro_de_pessoas.model.user.User;
import br.com.api.cadastro_de_pessoas.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    private final UserRepository userRepository;
    private final TokenService tokenService;

    @Autowired
    public UserRegistrationService(UserRepository userRepository, TokenService tokenService){
        this.userRepository = userRepository;
        this.tokenService = tokenService;
    }

    public User registrate(User user){
        user.setToken(tokenService.generateToken(user));
        return userRepository.save(user);
    }

}
