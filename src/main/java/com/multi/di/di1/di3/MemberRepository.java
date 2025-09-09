package com.multi.di.di1.di3;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long id);
}
