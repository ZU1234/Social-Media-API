package com.controllers.controllers;

import com.core.model.UserModel;
import com.facade.facades.UserFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    private final UserFacade userFacade;

    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }
    @GetMapping("/user")
    public ResponseEntity<Object> find() {
        return ResponseEntity.ok(userFacade.getAllUsers());
    }
    @PostMapping("/user")
    public ResponseEntity<Object> save(@RequestBody UserModel user) {
        System.out.println("post method");
        if (user == null) {
            return ResponseEntity.badRequest().body("Geçersiz istek.");
        }
        return ResponseEntity.ok(userFacade.save(user));
    }



    @PostMapping("/del")
    public ResponseEntity<Object> delete(@RequestBody String id) {
        return ResponseEntity.ok(userFacade.delete(id));
    }
}
