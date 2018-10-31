package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class DoctorBean {
    private Long doctorId;
    private Long accountId;
    private Long deptId;
    private Integer doctorGrender;
    private Integer doctorAge;
    private String doctorPhone;
    private String doctorHeader;


}
