package com.example.oppu.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


public interface MemberService {

    //회원가입
    void insertMember(String userId, String nickname, String password, String email);
}
