package com.controllers.controllers;

import com.controllers.form.ShareForm;
import com.facade.dto.ShareDto;
import com.facade.facades.ShareFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/share")
public class ShareController {
    private final ShareFacade shareFacade;

    public ShareController(ShareFacade shareFacade) {
        this.shareFacade = shareFacade;
    }

    @PostMapping()
    public ResponseEntity<Object> save(@RequestBody ShareForm form) {
        ShareDto share = new ShareDto();
        share.setDescription(form.getDescription());
        try {
            shareFacade.save(share);
            return ResponseEntity.ok("Succesfull");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping()
    public ResponseEntity<Object> getList() {
        try {
            return ResponseEntity.ok(shareFacade.getList());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
