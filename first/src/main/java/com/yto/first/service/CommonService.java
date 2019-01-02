package com.yto.first.service;

import com.yto.first.mapper.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {
    @Autowired
    public Common commonmapper;
    public String login(String sno, String password){
        return commonmapper.login(sno, password);
    }
}