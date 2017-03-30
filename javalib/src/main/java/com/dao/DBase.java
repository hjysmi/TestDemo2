package com.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by Administrator on 2017/3/30.
 * http://www.blogjava.net/davidjefiny/archive/2013/12/22/mybatis.html
 * http://www.cnblogs.com/fsjohnhuang/p/4014819.html
 */

public class DBase{
    private static SqlSessionFactory factory = null;
    public DBase(){
        if (factory != null) return;

        InputStream is = this.getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(is);
    }

    /**
     * 获取SqlSession实例，使用后需调用实例的close()函数释放资源
     * @return
     */
    protected SqlSession openSession(){
        return factory.openSession();
    }
}
