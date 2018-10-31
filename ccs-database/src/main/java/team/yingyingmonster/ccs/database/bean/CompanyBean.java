package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CompanyBean {
    private Long companyId;
    private Long accountId;
    private Integer companyPrice;
    private String companyEmail;
    private String companyPhone;


}
