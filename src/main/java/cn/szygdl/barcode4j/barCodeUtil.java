
package cn.szygdl.barcode4j;

import cn.szygdl.material.Repository.WMS_PPORDER_MATERIAL_Repostory;
import cn.szygdl.material.Repository.WmsRepository;
import cn.szygdl.material.pojo.WMS_PPORDER_MATERIAL;
import cn.szygdl.material.pojo.Wms;
import org.apache.commons.lang3.StringUtils;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.List;

@RestController
public class barCodeUtil {

    @Autowired
    private WmsRepository wpb;

    @Autowired
    private WMS_PPORDER_MATERIAL_Repostory WpbR;

    @Autowired
    private Wms Wmsbarcode;


    public static void getBarCode(String msg, String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.getParentFile().mkdir();
            }
            OutputStream ous = new FileOutputStream(file);
            if (StringUtils.isEmpty(msg) || ous == null)
                return;
            //选择条形码类型(好多类型可供选择)
            Code128Bean bean = new Code128Bean();
            //设置长宽
            final double moduleWidth = 0.20;
            final int resolution = 150;
            bean.setModuleWidth(moduleWidth);
            bean.doQuietZone(false);
            String format = "image/png";
            // 输出流
            BitmapCanvasProvider canvas = new BitmapCanvasProvider(ous, format,
                    resolution, BufferedImage.TYPE_BYTE_BINARY, false, 0);
            //生成条码
            bean.generateBarcode(canvas, msg);
            canvas.finish();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        for (int i=0;i<5;i++) {
            String msg = "A101690014202004280"+i;
            String path = "F:/material" + msg + ".jpg";
            barCodeUtil.getBarCode(msg, path);
        }

    }


}




