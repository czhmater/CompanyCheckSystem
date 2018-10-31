package team.yingyingmonster.ccs.commons;

/**
 * @author DingLi <br/>
 * - project: CompanyCheckSystem
 * - create: 9:20 2018/10/31
 * - 瞎JB写的分页工具包
 **/

public class PageUtil {
    public static int pageTotal(int count) {
        int pageTotal;
        if (count == 0) {
            pageTotal = 1;
        } else if (count % 5 == 0) {
            pageTotal = count/5;
        } else {
            pageTotal = count/5+1;
        }
        return pageTotal;
    }

}
