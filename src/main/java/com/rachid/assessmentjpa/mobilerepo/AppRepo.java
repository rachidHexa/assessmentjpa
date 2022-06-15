package com.rachid.assessmentjpa.mobilerepo;

import com.rachid.assessmentjpa.mobileentity.App;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepo extends JpaRepository<App, Long> {
}
