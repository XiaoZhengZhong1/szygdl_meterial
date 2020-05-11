package cn.szygdl.material.Repository;
import cn.szygdl.material.pojo.Wms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WmsRepository extends JpaRepository<Wms, Integer>, JpaSpecificationExecutor<Wms>  {



    @Query(value = "select count(*) from  WMS_BARCODE",nativeQuery = true)
    int countaaa();


    @Query(value = "select mbarcodeId from  Wms",nativeQuery = false)
    int countaaa1();


    @Query(value = "select * from  WMS_BARCODE",nativeQuery = true)
    List<Wms> selectall();




}
