package com.yto.controller;

import com.yto.bean.Girl;
import com.yto.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author czw
 */
@RestController
@RequestMapping("beautiful")
public class GirlController {
   @Autowired
    private GirlService girlService;
    /**
     * 七夕女朋友
     */
    @RequestMapping("Girl")
    public String findGirlFriend(){
        Girl 幻想的女朋友 = new Girl();
        幻想的女朋友.setAge(18);
        幻想的女朋友.setName("女神");
        幻想的女朋友.setCupSize("G");
        return girlService.saveGirl(幻想的女朋友);

    }
}
