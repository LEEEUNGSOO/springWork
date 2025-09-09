package com.multi.di.di1.di3;

public class MemberServiceWithSetter {
    private MemberRepository memberRepository;

    public void setMemberRepository(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void  join(Member m){
        memberRepository.save(m);
    }
    public Member get(Long id) {
        return memberRepository.findById(id);
    }
}
