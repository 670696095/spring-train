package com.yto.service;

import com.yto.bean.Girl;
import org.springframework.stereotype.Service;

@Service
public class IGirlService implements GirlService {
    @Override
    public String saveGirl(Girl girl) {
        return "你的女朋友";
    }
}
