package com.smk.bi.ticketing.controller;// Nama : Didin nur yahya
import com.smk.bi.ticketing.model.Rails;
import com.smk.bi.ticketing.service.RailsService;
import groovy.transform.AutoClone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// kelas : 16102087
@RestController
@RequestMapping("/rails")
public class RailsController {
    @Autowired
    RailsService railsService;

    @PostMapping("/save")
    public Rails saveRails(@RequestBody Rails rails){
        return railsService.insertRails(rails);

    }
    @PostMapping("/delete")
    public Map<String,Object> deleteRails(@RequestBody Rails rails){
        Map<String,Object> result = new HashMap<>();
        railsService.deleteRails(rails);
        result.put("Status","OK");
        result.put("Message","OK");
        return result;
    }

    @PostMapping("/findByIdt")
    public Rails findByIdt(@RequestBody Rails rails){
        return railsService.findByIdt(rails.getRailsId());
    }
    @PostMapping("/findByRailsName")
    public List<Rails> findByRailsName(@RequestBody Rails rails){
        return railsService.findByRailsName(rails.getRailsName());
    }


}
