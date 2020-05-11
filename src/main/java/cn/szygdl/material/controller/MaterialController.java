package cn.szygdl.material.controller;
import cn.szygdl.barcode4j.barCodeUtil;
import cn.szygdl.material.Repository.SzygdlRepository;
import cn.szygdl.material.Repository.WMS_PPORDER_MATERIAL_Repostory;
import cn.szygdl.material.Repository.WmsRepository;
import cn.szygdl.material.pojo.Szygdl;
import cn.szygdl.material.pojo.WMS_PPORDER_MATERIAL;
import cn.szygdl.material.pojo.Wms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.List;
@RestController
public class MaterialController {

    @Autowired
    private SzygdlRepository szygdlRepository;


    @Autowired
    private WMS_PPORDER_MATERIAL_Repostory WpbR;

    @Autowired
    private WmsRepository wmsr;


    @GetMapping("saveData2")
    public void saveData2(Szygdl zygdl) {
        szygdlRepository.save(zygdl);

    }

    @GetMapping("getData")
    public List<Szygdl> getData() {
        List<Szygdl> zygdl = szygdlRepository.findAll();
        return zygdl;
    }


    @GetMapping("getData3")
    public List<WMS_PPORDER_MATERIAL> getData3() {
        List<WMS_PPORDER_MATERIAL> all2 = WpbR.findAll();
        return all2;
    }


    @GetMapping("saveData")
    public void saveData(Szygdl szygdl) {
        szygdl.setCreateDate(new Date());
        szygdl.setPporderDate(new Date());
         szygdlRepository.save(szygdl);
    }


    @GetMapping("testmain2")
    public void testMain(Wms wms){
        wms.setBaccoderId("");
        wmsr.save(wms);
    }

    @GetMapping("testmain3")
    public void testMain3(){
        List<WMS_PPORDER_MATERIAL> all = WpbR.findAll();
        WMS_PPORDER_MATERIAL wms_pporder_material = all.get(0);
        int qty = wms_pporder_material.getQty();

        List<Wms> countaaa = wmsr.selectall();

//        System.out.print(countaaa);

        for (int i = 0; i < qty; i++) {
            Wms wms = new Wms();
            String msg = "A101690014202004280" + i;
            String path = "F:/material/" + msg + ".jpg";
            //barCodeUtil.getBarCode(msg, path);
            wms.setBaccoderId(null);
            wms.setSerialNo(msg);
            wms.setMbarcodeId(2);
            wms.setPporderHId(wms_pporder_material.getPporderHId());
            wms.setMaterialId(wms_pporder_material.getMaterialId());
            wms.setMaterialDesc(wms_pporder_material.getMaterialDesc());
            wms.setMaterialSpec(wms_pporder_material.getMaterialSpec());
            wms.setCpudt(wms_pporder_material.getCpudt());
            wms.setBarcodePath(path);
            wms.setCheckinfo(null);
            wms.setCreatDat(null);
            wms.setCreator(null);
            wms.setDeleteData(null);
            wms.setDeleteFlagId(null);
            wms.setPrintcount(i);
            wms.setQty(wms_pporder_material.getQty());
            wms.setRegenData(wms_pporder_material.getRereasonData());
            wms.setVersionId(null);
            wms.setVendorSelfId(null);
            wms.setTobarcodenum(null);
            wms.setUnitId(wms_pporder_material.getUnitId());
            wms.setUsageId(null);
            wms.setPlantDesc(null);
            wms.setFrombarcodenum(null);
            wms.setPlantEnglishId(null);
            wms.setUnstandardinfo(null);
            wms.setMarginId(null);
            wms.setUsageData(null);
            wms.setReserve(null);
            wms.setGenbarcodecount(wms_pporder_material.getGenbarcodecount());
            wms.setReprintData(wms_pporder_material.getRereasonData());
            wmsr.save(wms);
            barCodeUtil.getBarCode(msg,path);
        }
        //List<Wms> all1 = wpb.findAll();
    
    }


}