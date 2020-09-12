package com.sametozyurek.getpostapi.api.controller;

import com.sametozyurek.getpostapi.bussinessLayer.UserSignInService;
import com.sametozyurek.getpostapi.persistance.pojo.UserSigIn;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/User")
public class UserSignInController {

    @Autowired
    UserSignInService userSignInService;

    @GetMapping(value = "/", produces = "application/json")
    public List<UserSigIn> getAll(){
        return userSignInService.getAll();
    }

    @PostMapping(value = "add", produces = "application/json")
    public ResponseEntity<UserSigIn> addUser(@RequestBody UserSigIn userSigIn){
        userSignInService.insert(userSigIn);
        return ResponseEntity.status(200).body(userSigIn);
    }

    public ResponseEntity<UserSigIn> deleteUser(@RequestBody UserSigIn userSigIn){
        userSignInService.delete(userSigIn);
        return ResponseEntity.status(200).body(userSigIn);
    }
}
