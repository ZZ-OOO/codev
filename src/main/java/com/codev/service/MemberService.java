package com.codev.service;

import com.codev.dto.member.MemberDTO;
import com.codev.repository.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberMapper mapper;

    public MemberDTO getMemberInfo(){
        return mapper.getMemberInfo();
    }
}
