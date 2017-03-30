package com.dao;

import com.entity.EStudent;

import java.util.List;

/**
 * Created by Administrator on 2017/3/30.
 */

public interface StudentMapper{
    /**
     * 通过姓名获取学生信息（不含教师、班级信息）
     * @param name 学生姓名
     * @return
     */
    EStudent getJustStudentInfo(String name);

    /**
     * 通过姓名模糊查询学生信息（不含教师、班级信息）
     * @param name 学生姓名
     * @return
     */
    List<EStudent> getJustStudentInfos(String name);

    /**
     * 通过姓名和班级名称获取学生信息（含教师、班级信息）
     * @param studentName 学生姓名
     * @param className 班级名称
     * @return
     */
    EStudent getStudentInfo(String studentName, String className);

    /**
     * 新增学生信息
     * @param student
     * @return
     */
    void addStudent(EStudent student);

    /**
     * 删除学生信息
     * @param id
     * @return
     */
    void delStudent(int id);
}
