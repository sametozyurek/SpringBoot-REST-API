package com.sametozyurek.getpostapi.persistance.repository;

import com.sametozyurek.getpostapi.persistance.pojo.UserSigIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSignInRepository extends JpaRepository<UserSigIn, Long> {
}
