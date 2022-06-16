package com.rachid.assessmentjpa.mobileentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mobile_id;

    private String mobile_company;

    private String mobile_Name;

    @OneToMany( mappedBy = "mobile")
    private Set<App> apps ;

    public void addApp(App app){
        apps.add(app);
    }


}
