package titan.io.ibcslibraryapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import titan.io.ibcslibraryapi.service.MemberService;

@Slf4j
@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;
}
