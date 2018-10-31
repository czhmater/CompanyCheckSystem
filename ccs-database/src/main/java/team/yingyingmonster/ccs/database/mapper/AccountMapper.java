package team.yingyingmonster.ccs.database.mapper;

import team.yingyingmonster.ccs.database.bean.AccountBean;
import team.yingyingmonster.ccs.database.bean.PageBean;

import java.util.List;

public interface AccountMapper {
    public int accountAdd(AccountBean accountBean);
    public List<AccountBean> accountList(PageBean pageBean);//总用户并分页
    public int resultPage(PageBean pageBean);//用户总页数
}
