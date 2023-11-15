package com.controllers.controllers;

import com.core.model.ShareModel;
import com.core.model.UserModel;
import com.core.service.ShareService;
import com.core.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ShareController {
    private final ShareService shareService;
    private final UserService userService;

    public ShareController(ShareService shareService, UserService userService) {
        this.shareService = shareService;
        this.userService = userService;
    }

    @PostMapping("/share")
    public ResponseEntity<ShareModel> save(@RequestBody ShareModel shareModel) {

        UserModel user=  userService.findByEmail("test@test.com");
        System.out.printf(user.getPk().toString());

        ShareModel share = new ShareModel();
        share.setUserPk(user.getPk());
        share.setDescription(shareModel.getDescription());
        share.setStartDate(new Date());
        share.setStatus(shareModel.getStatus());
        return ResponseEntity.ok (shareService.save(share));
    }

    @GetMapping("/share")
    public ResponseEntity<List<ShareModel>> getList(){
        return ResponseEntity.ok(shareService.getList());
    }
}
