package com.zapata.dszp_GestionUsuariosSimples.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zapata.dszp_GestionUsuariosSimples.model.User;
import com.zapata.dszp_GestionUsuariosSimples.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

 private final UserService service;

 public UserController(UserService service) {
     this.service = service;
 }

 @GetMapping
 public List<User> listar() {
     return service.obtenerTodos();
 }

 @PostMapping
 public String guardar(@RequestBody User p) {
     service.guardar(p);
     return "Usuario creado";
 }

 
 @DeleteMapping("/{id}")
 public String eliminar(@PathVariable Long id) {
     return service.eliminar(id)
             ? "Usuario eliminado"
             : "Usuario no encontrado";
 }
}