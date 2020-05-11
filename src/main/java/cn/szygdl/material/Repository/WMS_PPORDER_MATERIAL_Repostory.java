package cn.szygdl.material.Repository;

import cn.szygdl.material.pojo.WMS_PPORDER_MATERIAL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
public interface WMS_PPORDER_MATERIAL_Repostory
        extends JpaRepository<WMS_PPORDER_MATERIAL, Integer>, JpaSpecificationExecutor<WMS_PPORDER_MATERIAL>{
}
