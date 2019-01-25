package com.atguigu.springcloud;

import com.atguigu.springcloud.dao.DeptDao;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
@Ignore
public class AppTest 
{
    @Autowired

    private DeptDao dao ;


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void  shujuku(){

//        List<Dept> daoAll = dao.findAll();
//
//        System.out.println(daoAll);

;        dao.findById(1l);
    }
}
