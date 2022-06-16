package com.rachid.assessmentjpa.mobileentity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class App {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long app_id;

    private String app_name;

    @ManyToOne
    @JoinColumn(name = "mobile_id")
    private Mobile mobile;


}
