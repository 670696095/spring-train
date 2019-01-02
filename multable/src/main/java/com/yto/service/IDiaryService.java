package com.yto.service;

import com.yto.bean.Diary;

import java.util.List;

/**
 * @author czw
 */
public interface IDiaryService {
   int addDiary(Diary diary);
   Diary getDiaryById(int id);
   List<Diary> getAllDiary();
   Diary getDiaryByIdOnly(int id);
   int deleteDiary(int id);
   int updateDiary(Diary diary);


}
