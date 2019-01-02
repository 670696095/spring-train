package com.yto.service;

import com.yto.bean.Diary;
import com.yto.mapper.DiaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author czw
 */
@Service
public class IDiaryServiceImpl implements IDiaryService {
    @Autowired
    private DiaryMapper diaryMapper;
    @Override
    public int addDiary(Diary diary) {
        int result = diaryMapper.insertDiary(diary);
        return  result;
    }

    @Override
    public Diary getDiaryById(int id) {
        Diary diary = diaryMapper.getDiaryById(id);
        return diary;
    }

    @Override
    public List<Diary> getAllDiary() {
        return diaryMapper.getAllDiary();
    }

    @Override
    public Diary getDiaryByIdOnly(int id) {
        return diaryMapper.getDiaryByIdOnly(id);
    }

    @Override
    public int deleteDiary(int id) {
        return diaryMapper.deleteDiary(id);
    }

    @Override
    public int updateDiary(Diary diary) {
        return diaryMapper.updateDiary(diary);
    }


}
