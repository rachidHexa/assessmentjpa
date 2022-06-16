package com.rachid.assessmentjpa.mobileservice;

import com.rachid.assessmentjpa.mobileentity.App;
import com.rachid.assessmentjpa.mobilerepo.AppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {

    @Autowired
    AppRepo appRepo;



    public  List<App> getAllApps() {
        return  appRepo.findAll();
    }


    public App addApp(App app) {
        return appRepo.save(app);
    }
}
