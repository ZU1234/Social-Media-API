package com.core.controllers;

import com.core.model.UserModel;
import com.core.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody UserModel user) {
        if (user == null) {
            // Hata işleme kodu veya uygun yanıt döndürme
            return ResponseEntity.badRequest().body("Geçersiz istek.");
        }
        UserModel userModel = userService.save(user);
        return ResponseEntity.ok(userModel);
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> find() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/get-by-email")
    public ResponseEntity<UserModel> findByEmail(@RequestBody String email) {
        System.out.println("request : " + email);
        return ResponseEntity.ok(userService.findByEmail(email));
    }
    @PostMapping("/del")
    public ResponseEntity<Boolean> delete(@RequestBody String id) {
        return ResponseEntity.ok(userService.delete(id));
    }
}
