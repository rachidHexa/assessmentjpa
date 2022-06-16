package com.rachid.assessmentjpa.mobilecontroller;

import com.rachid.assessmentjpa.mobileentity.App;
import com.rachid.assessmentjpa.mobileservice.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/apps")
public class AppController {

    @Autowired
    AppService appService;


    @GetMapping("/")
    List<App> getAllApps(){
        return appService.getAllApps();
    }

    @PostMapping("/")
    App addApp(@RequestBody App app){
        return appService.addApp(app);
    }

}
