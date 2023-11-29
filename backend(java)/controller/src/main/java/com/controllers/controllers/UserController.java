package com.controllers.controllers;

import com.controllers.form.RegisterForm;
import com.facade.dto.UserDto;
import com.facade.facades.UserFacade;
import io.netty.util.internal.StringUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    private final UserFacade userFacade;

    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @GetMapping()
    public ResponseEntity<Object> find() {
        try {
            return ResponseEntity.ok(userFacade.getAllUsers());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("error");
        }
    }

    @PostMapping()
    public ResponseEntity<Object> save(@RequestBody RegisterForm form) {

        UserDto dto = new UserDto();
        dto.setFullname(form.getName() + StringUtil.SPACE + form.getSurname());
        dto.setEmail(form.getEmail());
        dto.setPassword(form.getPassword());
        try{
            userFacade.save(dto);
            return ResponseEntity.ok("successful");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("error");
        }
    }

    @PostMapping("/del")
    public ResponseEntity<Object> delete(@RequestBody String id) {
        try {
            return ResponseEntity.ok(userFacade.delete(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("error");
        }
    }
}
