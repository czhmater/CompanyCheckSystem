package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserCheckBean {
    private Long userId;
    private Long userCheckId;
    private Long teamFormComboCheckId;


}
