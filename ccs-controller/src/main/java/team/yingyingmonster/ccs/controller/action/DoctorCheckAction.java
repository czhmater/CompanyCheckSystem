package team.yingyingmonster.ccs.controller.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 翁国宝 <br/>
 * - project: CompanyCheckSystem
 * - create: 13:20 2018/10/30
 * - 医生检查控制类
 **/
@Controller
@RequestMapping("/doctorcheck")
public class DoctorCheckAction {

    @RequestMapping("/index")
    public String index(){
        return "doctorcheck/index";
    }

    @RequestMapping("/userinfo")
    public String userInfo(){
        return "doctorcheck/user-info";
    }
}
