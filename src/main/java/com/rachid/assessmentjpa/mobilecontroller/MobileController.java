package com.rachid.assessmentjpa.mobilecontroller;

import com.rachid.assessmentjpa.mobileentity.Mobile;
import com.rachid.assessmentjpa.mobileservice.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/mobile")
public class MobileController {

    @Autowired
    MobileService mobileService;



    @GetMapping("/")
    List<Mobile> getAllMobile(){
        return mobileService.getAllMobile();
    }

    @PostMapping("/")
    Mobile addMobile(@RequestBody Mobile mobile){
            return mobileService.addMobile(mobile);
    }

    @PutMapping("/{mobile_id}/{app_id}")
    Mobile addAppToMobile(@PathVariable Long mobile_id, @PathVariable Long app_id) {
        Mobile mobile = mobileService.addAppToMobile(mobile_id, app_id);
       return mobile;
    }

    @GetMapping("/mobilewname")
    public List<?> getAllMobileAppName() {
        return mobileService.getAllMobileWithAppName();
    }

    @GetMapping("/mobileName")
    public List<?> getAllAppByMobileName(@RequestParam String mobileName) {
        return mobileService.getAllAppByMobileName( mobileName);
    }
}
