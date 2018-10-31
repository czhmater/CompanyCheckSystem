package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class MenuBean {
    private Long menuId;
    private Integer menuState;

    private String menuName;
    private String menuUrl;


}
