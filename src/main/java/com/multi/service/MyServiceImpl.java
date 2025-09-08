// src/main/java/com/multi/service/MyServiceImpl.java
package com.multi.service;

import com.multi.repository.MyRepository;

public class MyServiceImpl implements MyService {

    private final MyRepository myRepository;
    private String prefix = "[DEFAULT]";

    public MyServiceImpl(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    @Override
    public String performAction(String name) {
        return prefix + " " + myRepository.getMessage(name);
    }
}

