package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ExcelBean {
    private Long excelId;
    private Long companyId;

    private String excelName;
    private String excelUrl;


}
