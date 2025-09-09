package com.multi.di.di1.di3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryMemberRepository implements MemberRepository {
    private final Map<Long,Member> store = new ConcurrentHashMap<>();
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);

    }
    @Override
    public Member findById(Long id) {
        return store.get(id);
    }
}
