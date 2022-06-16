package com.rachid.assessmentjpa.mobilerepo;

import com.rachid.assessmentjpa.mobileentity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MobileRepo extends JpaRepository<Mobile,Long> {
    @Query("select m.mobile_id, m.mobile_Name, a.app_name from Mobile m , App as  a")
    List<?> getAllMobileWithAppName();

    @Query("select m.mobile_id, m.mobile_Name, a.app_name from Mobile m , App as  a where m.mobile_Name = :mobileName"  )
    List<?> getAllAppByMobileName(@Param("mobileName")String mobileName);


}
