package team.yingyingmonster.ccs.commons;

import org.junit.Test;

/**
 * @author Juer Whang <br/>
 * - project: CompanyCheckSystem
 * - create: 10:33 2018/10/30
 * -
 **/
public class CommonUtilTest {
    @Test
    public void isNullTest() {
        System.out.println(null instanceof String);
        System.out.println(CommonUtil.isNull("2333"));
        System.out.println(CommonUtil.isNull(1,4,null,42));
    }
}
