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
        return ResponseEntity.ok(userFacade.getAllUsers());
    }

    @PostMapping()
    public ResponseEntity<Object> save(@RequestBody RegisterForm form) {

        UserDto dto = new UserDto();
        dto.setFullname(form.getName() + StringUtil.SPACE + form.getSurname());
        dto.setEmail(form.getEmail());
        dto.setPassword(form.getPassword());

        userFacade.save(dto);

        return ResponseEntity.ok("successful");
    }

    @PostMapping("/del")
    public ResponseEntity<Object> delete(@RequestBody String id) {
        return ResponseEntity.ok(userFacade.delete(id));
    }
}
