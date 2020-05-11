package cn.szygdl.material.pojo;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "WMS_BARCODE", catalog = "test")
public class Wms {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mseq4")
    @SequenceGenerator(name="mseq4",sequenceName="seq_WMS_BARCODE",allocationSize=1)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "mbarcode_id")
    private int mbarcodeId;

    @Column(name = "pporder_h_id")
    private String pporderHId;

    @Column(name = "material_id")
    private String materialId;

    @Column(name = "material_desc")
    private String materialDesc;

    @Column(name = "material_spec")
    private String materialSpec;

    @Column(name = "qty")
    private int qty;

    @Column(name = "serial_no")
    private String serialNo;

    @Column(name = "baccoder_id")
    private String baccoderId;

    @Column(name = "plant_english_id")
    private String plantEnglishId;

    @Column(name = "plant_desc")
    private String plantDesc;

    @Column(name = "usage_id")
    private String usageId;

    @Column(name = "margin_id")
    private String marginId;

    @Column(name = "usage_data")
    private String usageData;

    @Column(name = "unstandardinfo")
    private String unstandardinfo;

    @Column(name = "checkinfo")
    private String checkinfo;

    @Column(name = "reserve")
    private String reserve;

    @Column(name = "printcount")
    private int printcount;

    @Column(name = "genbarcodecount")
    private int genbarcodecount;

    @Column(name = "vendor_self_id")
    private String vendorSelfId;

    @Column(name = "version_id")
    private String versionId;

    @Column(name = "delete_flag_id")
    private String deleteFlagId;

    @Column(name = "delete_data")
    private String deleteData;

    @Column(name = "reprint_data")
    private String reprintData;

    @Column(name = "regen_data")
    private String regenData;


    @Column(name = " unit_id")
    private String  unitId;


    @Column(name = "barcode_path")
    private String barcodePath;


    @Column(name = "frombarcodenum")
    private String frombarcodenum;


    @Column(name = "tobarcodenum")
    private String tobarcodenum;


    @Column(name = "creator")
    private String creator;


    @Column(name = "creat_dat")
    private Date creatDat;


    @Column(name = "cpudt")
    private Date cpudt;


    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getRegenData() {
        return regenData;
    }

    public void setRegenData(String regenData) {
        this.regenData = regenData;
    }

    public String getBarcodePath() {
        return barcodePath;
    }

    public void setBarcodePath(String barcodePath) {
        this.barcodePath = barcodePath;
    }

    public String getFrombarcodenum() {
        return frombarcodenum;
    }

    public void setFrombarcodenum(String frombarcodenum) {
        this.frombarcodenum = frombarcodenum;
    }

    public String getTobarcodenum() {
        return tobarcodenum;
    }

    public void setTobarcodenum(String tobarcodenum) {
        this.tobarcodenum = tobarcodenum;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatDat() {
        return creatDat;
    }

    public void setCreatDat(Date creatDat) {
        this.creatDat = creatDat;
    }

    public Date getCpudt() {
        return cpudt;
    }

    public void setCpudt(Date cpudt) {
        this.cpudt = cpudt;
    }


    public int getMbarcodeId() {
        return mbarcodeId;
    }

    public void setMbarcodeId(int mbarcodeId) {
        this.mbarcodeId = mbarcodeId;
    }

    public String getPporderHId() {
        return pporderHId;
    }

    public void setPporderHId(String pporderHId) {
        this.pporderHId = pporderHId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getMaterialDesc() {
        return materialDesc;
    }

    public void setMaterialDesc(String materialDesc) {
        this.materialDesc = materialDesc;
    }

    public String getMaterialSpec() {
        return materialSpec;
    }

    public void setMaterialSpec(String materialSpec) {
        this.materialSpec = materialSpec;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getBaccoderId() {
        return baccoderId;
    }

    public void setBaccoderId(String baccoderId) {
        this.baccoderId = baccoderId;
    }

    public String getPlantEnglishId() {
        return plantEnglishId;
    }

    public void setPlantEnglishId(String plantEnglishId) {
        this.plantEnglishId = plantEnglishId;
    }

    public String getPlantDesc() {
        return plantDesc;
    }

    public void setPlantDesc(String plantDesc) {
        this.plantDesc = plantDesc;
    }

    public String getUsageId() {
        return usageId;
    }

    public void setUsageId(String usageId) {
        this.usageId = usageId;
    }

    public String getMarginId() {
        return marginId;
    }

    public void setMarginId(String marginId) {
        this.marginId = marginId;
    }

    public String getUsageData() {
        return usageData;
    }

    public void setUsageData(String usageData) {
        this.usageData = usageData;
    }

    public String getUnstandardinfo() {
        return unstandardinfo;
    }

    public void setUnstandardinfo(String unstandardinfo) {
        this.unstandardinfo = unstandardinfo;
    }

    public String getCheckinfo() {
        return checkinfo;
    }

    public void setCheckinfo(String checkinfo) {
        this.checkinfo = checkinfo;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public int getPrintcount() {
        return printcount;
    }

    public void setPrintcount(int printcount) {
        this.printcount = printcount;
    }

    public int getGenbarcodecount() {
        return genbarcodecount;
    }

    public void setGenbarcodecount(int genbarcodecount) {
        this.genbarcodecount = genbarcodecount;
    }

    public String getVendorSelfId() {
        return vendorSelfId;
    }

    public void setVendorSelfId(String vendorSelfId) {
        this.vendorSelfId = vendorSelfId;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getDeleteFlagId() {
        return deleteFlagId;
    }

    public void setDeleteFlagId(String deleteFlagId) {
        this.deleteFlagId = deleteFlagId;
    }

    public String getDeleteData() {
        return deleteData;
    }

    public void setDeleteData(String deleteData) {
        this.deleteData = deleteData;
    }

    public String getReprintData() {
        return reprintData;
    }

    public void setReprintData(String reprintData) {
        this.reprintData = reprintData;
    }
}
