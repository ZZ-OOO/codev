package com.codev.api;

import com.codev.dto.member.MemberDTO;
import com.codev.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberAPIController {
    private final MemberService memberService;

    @GetMapping("/member")
    public MemberDTO getMember(){
        return memberService.getMemberInfo();
    }
}
