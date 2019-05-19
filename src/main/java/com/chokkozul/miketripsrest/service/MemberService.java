package com.chokkozul.miketripsrest.service;

import com.chokkozul.miketripsrest.controller.domain.Member;
import com.chokkozul.miketripsrest.entity.MemberEntity;
import com.chokkozul.miketripsrest.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> list(){
        Iterable<MemberEntity> memberEntities = memberRepository.findAll();

        List<Member> members = new ArrayList<>();

        memberEntities.forEach(entity -> members.add(convert(entity)));

        return members;
    }

    private Member convert(MemberEntity entity) {
        if (entity != null){
            return Member.builder().name(entity.getName()).build();
        }
        return Member.builder().build();
    }

}
