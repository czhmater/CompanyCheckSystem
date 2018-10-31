package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ReportBean {
    private Long billId;
    private Long reportId;

    private String resportSummary;


}
