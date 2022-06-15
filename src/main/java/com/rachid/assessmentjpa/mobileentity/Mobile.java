package com.rachid.assessmentjpa.mobileentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Mobile {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long mobile_id;

    private String Mobile_company;

    private String Mobile_Name;

    @OneToMany(mappedBy="mobile")
    private Set<App> apps;

    public void addApp(App app){
        apps.add(app);
    }
}
