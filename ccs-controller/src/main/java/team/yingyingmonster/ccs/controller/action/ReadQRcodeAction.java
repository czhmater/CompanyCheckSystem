package team.yingyingmonster.ccs.controller.action;


import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.xml.transform.Result;
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
@RequestMapping("/readQRcode")
public class ReadQRcodeAction {
    /**
     * 读取二维码信息
     * @param filePath
     * @return
     */
    @RequestMapping("/getQRresult")
    public String getQRresult(String filePath){
        Result result=QRresult(filePath);
        if (result != null) {
            System.out.println("二维码内容：" + result.getText());
            if (result.getText() != null) {
                Long userId = result.getText();
                System.out.println(userId);
            }
            System.out.println("二维码格式：" + result.getBarcodeFormat());
        }

        return "";
    }

    public Result QRresult(String filePath){
        Result result = null;
        try {
            File file = new File(filePath);

            BufferedImage bufferedImage = ImageIO.read(file);
            BinaryBitmap bitmap = new BinaryBitmap(
                    new HybridBinarizer(new BufferedImageLuminanceSource(bufferedImage)));
            HashMap hints = new HashMap<>();
            hints.put(EncodeHintType.CHARACTER_SET, CHARTSET);
            result = new MultiFormatReader().decode(bitmap, hints);
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


}
