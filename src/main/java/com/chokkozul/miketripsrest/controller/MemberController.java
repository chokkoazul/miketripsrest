package com.chokkozul.miketripsrest.controller;

import com.chokkozul.miketripsrest.controller.domain.Member;
import com.chokkozul.miketripsrest.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping()
    public List<Member> list() {
        return memberService.list();
    }

}
