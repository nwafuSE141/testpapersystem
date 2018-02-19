package edu.nwafu.testpapersystem.domain.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author TinChiWay
 * @date 2018/3/5
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class ChapterMapperTest {

    @Autowired
    private ChapterMapper mapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void selectAll() {
        mapper.selectAll();
    }

    @Test
    public void updateByPrimaryKey() {
    }
}