package titan.io.ibcslibraryapi.service;

import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import titan.io.ibcslibraryapi.model.Member;
import titan.io.ibcslibraryapi.repository.MemberRepository;

import java.util.List;

@Slf4j
@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    // get all members
    public List<Member> getAllMember(){
        return memberRepository.findAll();
    }
    // get member by id
    public Member getMemberById(@NotNull int id){
        return memberRepository.findById(id).orElse(null);
    }
    // get member by nid
    public Member getMemberByNid(@NotNull int nid){
        return memberRepository.findByNid(nid);
    }
    // post one member
    public Member postOneMember(@NotNull Member member){
        Member existingMember = memberRepository.findByNid(member.getNid());
        if(existingMember != null){
            return null;
        }else{
            return memberRepository.save(member);
        }
    }
    // post all member
    public List<Member> postAllMember(@NotNull List<Member> memberList){
        return memberRepository.saveAll(memberList);
    }
    // delete member by id
    public String deleteMemberById(@NotNull int id){
        Member existingMember = memberRepository.findById(id).orElse(null);
        if(existingMember == null){
            return "no member found, id: " + id;
        }else {
            memberRepository.deleteById(id);
            return "member deleted, id: " + id;
        }
    }
    // delete member by obj
    public String deleteMemberByObj(@NotNull Member member){
        Member existingMember = memberRepository.findById(member.getId()).orElse(null);
        if(existingMember == null){
            return "no member found, id: " +member.getId();
        }else{
            memberRepository.delete(member);
            return "member deleted, id: " + member.getId();
        }
    }
    // update member by obj
    public Member updateMember(@NotNull Member member){
        Member existingMember = memberRepository.findById(member.getId()).orElse(null);
        if(existingMember == null){
            return null;
        }else{
            existingMember.setName(member.getName());
            existingMember.setBirthDate(member.getBirthDate());
            existingMember.setAge(member.getAge());
            existingMember.setEmail(member.getEmail());
            existingMember.setPassword(member.getPassword());
            existingMember.setAddress(member.getAddress());
            existingMember.setBook(member.getBook());
            existingMember.setIssueDate(member.getIssueDate());
            existingMember.setFine(member.getFine());

            return memberRepository.save(existingMember);
        }
    }
}
