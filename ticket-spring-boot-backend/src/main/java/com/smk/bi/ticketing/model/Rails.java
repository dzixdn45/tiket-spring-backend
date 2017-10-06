package com.smk.bi.ticketing.model;// Nama : Didin nur yahya

import javax.persistence.*;

// kelas : 16102087
@Entity
@Table(name = "rails")
public class Rails {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long railsId;
    private String railsName;
    private Integer capacityRails;


    public Long getRailsId() {

        return railsId;
    }

    public void setRailsId(Long railsId) {

        this.railsId = railsId;
    }

    public String getRailsName() {
        return railsName;
    }

    public void setRailsName(String railsName) {
        this.railsName = railsName;
    }

    public Integer getCapacityRails() {
        return capacityRails;
    }

    public void setCapacityRails() (Integer capacityRails) {
        this.capacityRails = capacityRails;
    }
}
