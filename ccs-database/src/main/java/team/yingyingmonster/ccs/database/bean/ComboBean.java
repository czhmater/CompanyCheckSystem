package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ComboBean {
    private Long comboId;
    private Integer comboRatio;

    private  String comboName;
    private String comboSummary;


}
