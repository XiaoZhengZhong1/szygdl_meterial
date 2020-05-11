package cn.szygdl.material.pojo;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "WMS_PPORDER_MATERIAL", catalog = "test")
public class WMS_PPORDER_MATERIAL {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mseq2")
    @SequenceGenerator(name="mseq2",sequenceName="seq_WMS_PPORDER_MATERIAL",allocationSize=1)

    @Column(name = "pporder_material_id")
    private int pporderMaterialId;

    @Column(name = "company_id")
    private String companyId;

    @Column(name = "plant_id")
    private String plantId;

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

    @Column(name = "unit_id")
    private String unitId;

    @Column(name = "pporder_dat")
    private Date pporderDat;

    @Column(name = "pporder_doc_dat")
    private Date pporderDocDat;

    @Column(name = "pporder_end_dat")
    private Date pporderEndDat;

    @Column(name = "state11")
    private String state11;

    @Column(name = "state22")
    private String state22;

    @Column(name = "genbarcodecount")
    private int genbarcodecount;

    @Column(name = "rereason_data")
    private String rereasonData;

    @Column(name = "frombarcodenum")
    private String frombarcodenum;

    @Column(name = "crea")
    private Date crea;

    @Column(name = "cpudt")
    private Date cpudt;

    public int getPporderMaterialId() {
        return pporderMaterialId;
    }

    public void setPporderMaterialId(int pporderMaterialId) {
        this.pporderMaterialId = pporderMaterialId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId;
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

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public Date getPporderDat() {
        return pporderDat;
    }

    public void setPporderDat(Date pporderDat) {
        this.pporderDat = pporderDat;
    }

    public Date getPporderDocDat() {
        return pporderDocDat;
    }

    public void setPporderDocDat(Date pporderDocDat) {
        this.pporderDocDat = pporderDocDat;
    }

    public Date getPporderEndDat() {
        return pporderEndDat;
    }

    public void setPporderEndDat(Date pporderEndDat) {
        this.pporderEndDat = pporderEndDat;
    }

    public String getState11() {
        return state11;
    }

    public void setState11(String state11) {
        this.state11 = state11;
    }

    public String getState22() {
        return state22;
    }

    public void setState22(String state22) {
        this.state22 = state22;
    }

    public int getGenbarcodecount() {
        return genbarcodecount;
    }

    public void setGenbarcodecount(int genbarcodecount) {
        this.genbarcodecount = genbarcodecount;
    }

    public String getRereasonData() {
        return rereasonData;
    }

    public void setRereasonData(String rereasonData) {
        this.rereasonData = rereasonData;
    }

    public String getFrombarcodenum() {
        return frombarcodenum;
    }

    public void setFrombarcodenum(String frombarcodenum) {
        this.frombarcodenum = frombarcodenum;
    }

    public Date getCrea() {
        return crea;
    }

    public void setCrea(Date crea) {
        this.crea = crea;
    }

    public Date getCpudt() {
        return cpudt;
    }

    public void setCpudt(Date cpudt) {
        this.cpudt = cpudt;
    }
}
