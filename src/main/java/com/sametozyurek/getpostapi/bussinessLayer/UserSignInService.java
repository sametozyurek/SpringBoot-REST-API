package com.sametozyurek.getpostapi.bussinessLayer;

import com.sametozyurek.getpostapi.persistance.pojo.UserSigIn;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserSignInService {
    List<UserSigIn> getAll();
    UserSigIn insert(UserSigIn userSigIn);
    UserSigIn delete(UserSigIn userSigIn);
}
