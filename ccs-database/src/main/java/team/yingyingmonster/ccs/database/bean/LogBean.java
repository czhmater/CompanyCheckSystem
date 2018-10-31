package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class LogBean {
    private Long LogId;

    private String logTime;
    private String logLevel;
    private String logClass;
    private String logLocate;
    private String logThread;

    private Long logMessage;


}
