package com.zapata.dszp_GestionUsuariosSimples.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zapata.dszp_GestionUsuariosSimples.model.User;
import com.zapata.dszp_GestionUsuariosSimples.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> obtenerTodos() {
        return repo.findAll();
    }

    public void guardar(User p) {
        repo.save(p);
    }
    
    public boolean eliminar(Long id) {

    	User existe = repo.findAll()
                .stream()
                .filter(u -> id.equals(u.getId()))
                .findFirst()
                .orElse(null);

        if (existe != null) {
            repo.delete(id);
            return true;
        }
        return false;
    }
}