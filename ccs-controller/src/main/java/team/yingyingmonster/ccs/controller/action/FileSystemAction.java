package team.yingyingmonster.ccs.controller.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/**
 * @author 翁国宝 <br/>
 * - project: CompanyCheckSystem
 * - create: 9:17 2018/11/1
 * - 处理文件相关业务
 **/
@Controller
@RequestMapping("/file")
public class FileSystemAction {


    @RequestMapping("uploadusercode")
    public String uploadUserCode(HttpServletRequest request,RedirectAttributes redirectAttributes) throws IOException {
        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
                request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        if(multipartResolver.isMultipart(request))
        {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
            //获取multiRequest 中所有的文件名
            Iterator iter=multiRequest.getFileNames();

            while(iter.hasNext())
            {
                //一次遍历所有文件
                MultipartFile file=multiRequest.getFile(iter.next().toString());
                if(file!=null)
                {
                    String path="D:/testupload"+file.getOriginalFilename();
                    //上传
                    file.transferTo(new File(path));
                    redirectAttributes.addAttribute("filepath",path);
                    return "redirect:/read-qr-code/get-qr-result";
                }

            }

        }
        return "/success";
    }
}
