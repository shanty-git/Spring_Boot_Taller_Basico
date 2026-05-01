package com.zapata.dszp_GestionUsuariosSimples.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zapata.dszp_GestionUsuariosSimples.model.User;

@Repository
public class UserRepository {

    private List<User> database = new ArrayList<>();
    
    public UserRepository() {
        if (database.isEmpty()) {

        	User obj = new User(111L, "Jose", "jose@gmail.com", 17);
        	User obj1 = new User(222L, "Maria", "maria@gmail.com", 20);
        	User obj2 = new User(333L, "Santiago", "santiago@gmail.com", 20);
        	User obj3 = new User(444L, "Cristal", "cristal@gmail.com", 19);

            database.add(obj);
            database.add(obj1);
            database.add(obj2);
            database.add(obj3);

            System.out.println("crea obj");
        }
    }
    
    public List<User> findAll() {
        return database;
    }

    public void save(User p) {
        database.add(p);
    }
    
    public void delete(Long id) {
        database.removeIf(u -> u.getId().equals(id));
    }
}
