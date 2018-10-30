package team.yingyingmonster.ccs.commons.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Juer Whang <br/>
 * - project: CompanyCheckSystem
 * - create: 16:24 2018/10/29
 * -
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-common.xml")
@Transactional("transactionManager")
@Rollback(false)
public class TestLogger {
    @Test
    public void testLog() {
        Logger logger = LogManager.getLogger(this.getClass());
        logger.debug("测试, " + logger.getClass());
    }
}
