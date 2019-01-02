package com.yto.controller;

import com.yto.bean.Diary;
import com.yto.service.IDiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author czw
 */

@RestController

public class DiaryMappingController {

    @Autowired
    private IDiaryService iDiaryService;


    /**
     * 测试
     * @return
     */
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(){
        return "测试";
    }

    /**
     * 添加新文章
     * @param diary
     * @return
     */
    @RequestMapping (value = "/insert")
    public String  Insert(Diary diary) {
        int message =iDiaryService.addDiary(diary);
        System.out.println(message);
        if(message>0){
            return "成功";
        }else{
            return  "失败";
        }

    }
    /**
     * 获取指定文章内容
     */
    @RequestMapping(value = "/getContent/{id}")
    public Diary getDiaryById(@PathVariable("id")int id ){
        return iDiaryService.getDiaryById(id);
    }

    /**
     * 获取所有文章
     */
    @RequestMapping(value = "/getAll")
    public List<Diary> getALL(){
        return iDiaryService.getAllDiary();
    }

    /**
     * 获取指定文章
     */
    @RequestMapping(value = "/getContentOnly/{id}")
    public Diary getDiaryByIdOnly(@PathVariable("id") int id){
        return iDiaryService.getDiaryByIdOnly(id);
    }
    /**
     * 删除文章
     */
    @RequestMapping(value = "/deleteDiary/{id}")
    public int deleteDiary(@PathVariable("id") int id){
        return iDiaryService.deleteDiary(id);
    }
    /**
     * 更新文章
     *
     */
    @PostMapping(value = "/updateDiary")
    public String updateDiary(Diary diary){

        int result =  iDiaryService.updateDiary(diary);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }






}
