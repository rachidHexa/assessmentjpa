package com.rachid.assessmentjpa.mobileservice;

import com.rachid.assessmentjpa.mobileentity.Mobile;
import com.rachid.assessmentjpa.mobilerepo.AppRepo;
import com.rachid.assessmentjpa.mobilerepo.MobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileService {

    @Autowired
    MobileRepo mobileRepo;

    @Autowired
    AppRepo appRepo;

    public List<Mobile> getAllMobile() {
        return mobileRepo.findAll();
    }

    public Mobile addMobile(Mobile mobile) {
        return mobileRepo.save(mobile);
    }

    public Mobile addAppToMobile(Long mobile_id, Long app_id) {
        Mobile mobile;
        if(mobileRepo.findById(mobile_id).isPresent() && appRepo.findById(app_id).isPresent()){
            mobile =  mobileRepo.findById(mobile_id).get();
            mobile.addApp(appRepo.findById(app_id).get());

            return  mobileRepo.save(mobile);
        }
        else
            return null;
    }

    public List<?> getAllMobileWithAppName() {
        return mobileRepo.getAllMobileWithAppName();
    }

    public List<?> getAllAppByMobileName(String mobileName) {
        return mobileRepo.getAllAppByMobileName(mobileName);
    }
}
