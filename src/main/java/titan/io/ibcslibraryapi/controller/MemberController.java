package titan.io.ibcslibraryapi.controller;

import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import titan.io.ibcslibraryapi.model.Member;
import titan.io.ibcslibraryapi.service.MemberService;

import java.util.List;

@Slf4j
@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    // get all member
    @GetMapping("/members")
    public List<Member> getAllMember(){
        return memberService.getAllMember();
    }
    // get member by id
    @GetMapping("/member/{id}")
    public Member getMemberById(@PathVariable @NotNull int id){
        return memberService.getMemberById(id);
    }
    // get member by nid
    @GetMapping("/memberByNid/{nid}")
    public Member getMemberByNid(@PathVariable @NotNull int nid){
        return memberService.getMemberByNid(nid);
    }
    // post one member
    @PostMapping("/member")
    public Member postOneMember(@RequestBody @NotNull Member member){
        return memberService.postOneMember(member);
    }
    // post all member
    @PostMapping("/members")
    public List<Member> postAllMember(@RequestBody @NotNull List<Member> memberList){
        return memberService.postAllMember(memberList);
    }
    // delete member by id
    @DeleteMapping("/member/{id}")
    public String deleteMemberById(@PathVariable @NotNull int id){
        return memberService.deleteMemberById(id);
    }
    // delete member by Obj
    @DeleteMapping("/member")
    public String deleteMemberByObj(@RequestBody @NotNull Member member){
        return memberService.deleteMemberByObj(member);
    }
    // update member by Obj
    @PutMapping("/member")
    public Member updateMemberByObj(@RequestBody @NotNull Member member){
        return memberService.updateMember(member);
    }
}
