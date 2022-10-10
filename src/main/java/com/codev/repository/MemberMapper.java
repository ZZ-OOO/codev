package com.codev.repository;

import com.codev.dto.member.MemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MemberMapper {
    MemberDTO getMemberInfo();
}
