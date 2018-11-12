package team.yingyingmonster.ccs.controller.action;


import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import team.yingyingmonster.ccs.database.bean.AccountBean;
import team.yingyingmonster.ccs.database.bean.CompanyBean;
import team.yingyingmonster.ccs.database.bean.UserBean;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author Zhao Han Wei <br/>
 * - project: CompanyCheckSystem
 * - create: 21:03 2018/10/30
 * - 读取二维码信息的类
 **/

@Controller
@RequestMapping("/read-qr-code1")
public class Test {
    public static final String FORMAT = "png";
    public static final String CHARTSET = "utf-8";
    /**
     * 读取二维码信息
     * @param filePath
     * @return
     */
    @RequestMapping("/get-qr-result1")
    @ResponseBody
    public UserBean getQRresult(@RequestParam(value = "uploadUserCode" , required = true)MultipartFile uploadUserCode){
        CommonsMultipartFile cf= (CommonsMultipartFile)uploadUserCode;
        DiskFileItem fi = (DiskFileItem)cf.getFileItem();
        File f = fi.getStoreLocation();

        UserBean user = new UserBean();
        user.setUserName("张三");
        user.setUserAge(12);
        user.setUserGender(1);
        user.setUserPhone("1300000000");
        user.setUserCardCode("350321199903999300");
        CompanyBean companyBean = new CompanyBean();
        AccountBean accountBean = new AccountBean();
        accountBean.setAccountName("传一");
        companyBean.setAccountByCompanyId(accountBean);
        user.setCompanyByCompanyId(companyBean);
        Result result=QRresult(f);
        if (result != null) {
            System.out.println("二维码内容：" + result.getText());
            if (result.getText() != null) {
                Long userId = Long.valueOf(result.getText());
                System.out.println(userId);
            }
            System.out.println("二维码格式：" + result.getBarcodeFormat());
        }

        return user;
    }

    public Result QRresult(File file){
        Result result = null;
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            BinaryBitmap bitmap = new BinaryBitmap(
                    new HybridBinarizer(new BufferedImageLuminanceSource(bufferedImage)));
            HashMap hints = new HashMap<>();
            hints.put(EncodeHintType.CHARACTER_SET, CHARTSET);
            result = new MultiFormatReader().decode(bitmap, hints);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (com.google.zxing.NotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
