package com.smk.bi.ticketing.model;// Nama : Didin nur yahya

import javax.persistence.*;

// kelas : 16102087
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;
    private String cityName;
    private String valid;

    public Long getCityId() {
        return cityId;
    }
    public void setCityId(Long cityId){

        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public String getValid() {

        return valid;
    }

    public void setValid(String valid) {

        this.valid = valid;
    }


}
