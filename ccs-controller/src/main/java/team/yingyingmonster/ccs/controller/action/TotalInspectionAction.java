package team.yingyingmonster.ccs.controller.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Zhao Han Wei <br/>
 * - project: CompanyCheckSystem
 * - create: 17:37 2018/10/31
 * - 总检
 **/

@Controller

@RequestMapping("/total-inspection")

public class TotalInspectionAction {

    @RequestMapping("/index")
    public String index(){
        return "totalinspection/total-inspection";
    }

    @RequestMapping("/write")
    public String writeTotalInspection(){
        return "";
    }


}
