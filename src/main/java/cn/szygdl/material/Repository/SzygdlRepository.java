package cn.szygdl.material.Repository;
import cn.szygdl.material.pojo.Szygdl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SzygdlRepository
        extends JpaRepository<Szygdl, Integer>, JpaSpecificationExecutor<Szygdl> {

 List<Szygdl> findAllByOrderByPpmaterialBarcoderId();

 List<Szygdl> findAllBySerialNo(String serialNo);



}
