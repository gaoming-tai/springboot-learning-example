package com.gm.springmvcdemo;

import com.gm.springmvcdemo.domain.ConfigProperty;
import com.gm.springmvcdemo.domain.T_bh_dcasemsg;
import com.gm.springmvcdemo.service.TbhCaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)   //运行器  指定测试开始自动创建Spring应用上下文
@SpringBootTest
public class SpringmvcdemoApplicationTests {
    Logger logger = LoggerFactory.getLogger(SpringmvcdemoApplication.class);
    @Autowired
    private TbhCaseService tbhCaseService;
    @Autowired
    private ConfigProperty configProperty;
    @Autowired
    private Environment environment;

    @Test
    public void findAll() {
        List<T_bh_dcasemsg> list = tbhCaseService.findAll("201908020001416");
        for (T_bh_dcasemsg t_bh_dcasemsg : list) {
            logger.info("caseId:" + t_bh_dcasemsg.getCase_id());
        }
    }

    //加载application.properties自定义属性
    @Test
    public void testReadConfigProperty(){
        logger.info(configProperty.getUrl());
        logger.info(configProperty.getPort());
        logger.info(configProperty.getTimeout());
    }

    @Test
    public void testEnvironmentReadProperty(){
        logger.info(environment.getProperty("spring.tai.url"));
        logger.info(environment.getProperty("spring.tai.port"));
        logger.info(environment.getProperty("spring.tai.timeout"));
    }

}
