package com.controllers.controllers;

import com.controllers.form.ShareForm;
import com.facade.dto.ShareDto;
import com.facade.facades.ShareFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

        shareFacade.save(share);
        return ResponseEntity.ok("");
    }

    @GetMapping()
    public ResponseEntity<List<ShareDto>> getList() {
        return ResponseEntity.ok(shareFacade.getList());
    }
}
