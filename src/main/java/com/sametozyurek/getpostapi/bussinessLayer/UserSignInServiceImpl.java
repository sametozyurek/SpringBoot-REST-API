package com.sametozyurek.getpostapi.bussinessLayer;

import com.sametozyurek.getpostapi.persistance.pojo.UserSigIn;
import com.sametozyurek.getpostapi.persistance.repository.UserSignInRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserSignInServiceImpl implements UserSignInService{
    @Autowired
    UserSignInRepository userSignInRepository;

    private static Logger log = (Logger) LoggerFactory.getLogger(UserSignInServiceImpl.class);

    @Override
    public List<UserSigIn> getAll(){
        List<UserSigIn> userSigInList;
        try{
            userSigInList = userSignInRepository.findAll();
            return userSigInList;
        }catch (Exception e){
            log.error(e.getMessage(), e);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public UserSigIn insert(UserSigIn userSigIn) {
        try{
            userSignInRepository.save(userSigIn);
            return userSigIn;
        }catch (Exception e){
            log.error(e.getMessage(),e);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public UserSigIn delete(UserSigIn userSigIn) {
        try{
            userSignInRepository.delete(userSigIn);
            return userSigIn;
        }catch (Exception e){
            log.error(e.getMessage(),e);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}
