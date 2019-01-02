package com.yto.mapper;

import com.yto.bean.Diary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author czw
 */
@Mapper
public interface DiaryMapper {

    /**
     * 获取文章内容
     *
     * @param id
     * @return
     */
    Diary getDiaryById(@Param("id") Integer id);

    /**
     * 获取文章内容
     *
     * @param id
     * @return
     */
     Diary getDiaryByIdOnly(@Param("id") Integer id);

    /**
     * 获取所有文章
     *
     * @return
     */
     List<Diary> getAllDiary();

    /**
     * 添加文章
     */
     int insertDiary(Diary diary);

    /**
     * 更新文章
     *
     * @param
     */
     int updateDiary(Diary diary);

    /**
     * 删除文章
     * @param id 用来让xml
     * @return
     */
     Integer deleteDiary(@Param("id") Integer id);

}
