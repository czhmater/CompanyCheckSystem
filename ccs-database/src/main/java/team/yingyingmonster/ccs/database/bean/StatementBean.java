package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class StatementBean {
    private Long statementId;
    private Long companyId;
    private Integer statementPrice;
    private Integer statementType;
    private String statementDate;


}
