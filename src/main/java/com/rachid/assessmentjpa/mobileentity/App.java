package com.rachid.assessmentjpa.mobileentity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class App {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long app_id;

    private String app_name;

    @ManyToOne
    @JoinColumn(name="mobile_id", nullable=false)
    private Mobile mobile;
}
