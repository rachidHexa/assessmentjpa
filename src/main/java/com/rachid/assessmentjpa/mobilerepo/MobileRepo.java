package com.rachid.assessmentjpa.mobilerepo;

import com.rachid.assessmentjpa.mobileentity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepo extends JpaRepository<Mobile,Long> {
}
