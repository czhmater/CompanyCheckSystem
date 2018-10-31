package team.yingyingmonster.ccs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ModelDataBean {
   private Long recordId;
   private Long userCheckId;
   private Long modelDataId;

   private String modelValue;


}
