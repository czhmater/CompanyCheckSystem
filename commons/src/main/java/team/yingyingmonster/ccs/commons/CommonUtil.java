package team.yingyingmonster.ccs.commons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;
import team.yingyingmonster.ccs.commons.log4j2.JuerDataSource;

/**
 * @author Juer Whang <br/>
 * - project: CompanyCheckSystem
 * - create: 14:31 2018/10/29
 * -
 **/
@ContextConfiguration("classpath:spring-common.xml")
@Transactional("transactionManager")
public class CommonUtil {
    public static void main(String[] args) {
        // TODO: something...
//        JuerDataSource.init();
        Logger logger = LogManager.getLogger(CommonUtil.class);
        logger.debug("测试, " + logger.getClass());
    }
}
