package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Juer Whang <br/>
 * - project: CompanyCheckSystem
 * - create: 14:15 2018/10/30
 * -
 **/
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Menu {
    private Long menuId;
    private String menuName;
    private String menuUrl;
    private Integer menuState;
}
