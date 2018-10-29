package team.yingyingmonster.ccs.database.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Juer Whang <br/>
 * - project: anfspf
 * - create: 3:44 2018/10/23
 * -
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-database.xml")
@Transactional("transactionManager")
@Rollback(false)
public class UserMapperTest {
//    @Autowired
//    private UserMapper userMapper;

    @Test
    public void selectUsersByConditionTest() {
//        User user = new User();
//        user.setId(10000l);
//        System.out.println(JsonUtil.getString(userMapper.selectUsersByCondition(user), JsonUtil.GsonType.SERIALIZE_NULL_AND_PRETTY));
    }
}
