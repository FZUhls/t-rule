package com.example.base.dao.test;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.base.dao.TBusinessDao;
import com.example.base.model.TBusiness;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class DaoTest {
    @Autowired
    TBusinessDao tBusinessDao;
    @Test
    void test1(){
        List<TBusiness> businessList = tBusinessDao.selectList(Wrappers.emptyWrapper());

        log.info(businessList.toString());
    }
}
