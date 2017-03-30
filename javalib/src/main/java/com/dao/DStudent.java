package com.dao;

import com.entity.EStudent;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/3/30.
 */

public class DStudent extends DBase{
    /**
     * 通过姓名获取学生信息（不含教师、班级信息）
     * @param name 学生姓名
     * @return
     */
    public EStudent getJustStudentInfo(String name){
        EStudent ret = null;
        SqlSession session = openSession();
        try{
            StudentMapper sm = session.getMapper(StudentMapper.class);
            ret = sm.getJustStudentInfo(name);
        }
        finally{
            session.close();
        }

        return ret;
    }

    /**
     * 通过姓名模糊查询学生信息（不含教师、班级信息）
     * @param name 学生姓名
     * @return
     */
    public List<EStudent> getJustStudentInfos(String name){
        List<EStudent> ret = null;
        SqlSession session = openSession();
        try{
            StudentMapper sm = session.getMapper(StudentMapper.class);
            ret = sm.getJustStudentInfos(name);
        }
        finally{
            session.close();
        }

        return ret;
    }

    /**
     * 通过姓名和班级名称获取学生信息（含教师、班级信息）
     * @param name 学生姓名
     * @param className 班级名称
     * @return
     */
    public EStudent getStudentInfo(String name, String className){
        EStudent ret = null;
        SqlSession session = openSession();
        try{
            StudentMapper sm = session.getMapper(StudentMapper.class);
            ret = sm.getStudentInfo(name, className);
        }
        finally{
            session.close();
        }

        return ret;
    }

    /**
     * 新增学生信息
     * @param student
     */
    public void addStudent(EStudent student){
        SqlSession session = openSession();
        try{
            StudentMapper sm = session.getMapper(StudentMapper.class);
            sm.addStudent(student);
            session.commit();
        }
        finally{
            session.close();
        }
    }

    /**
     * 删除学生信息
     * @param id
     */
    public void delStudent(int id){
        SqlSession session = openSession();
        try{
            StudentMapper sm = session.getMapper(StudentMapper.class);
            sm.delStudent(id);
            session.commit();
        }
        finally{
            session.close();
        }
    }
}
