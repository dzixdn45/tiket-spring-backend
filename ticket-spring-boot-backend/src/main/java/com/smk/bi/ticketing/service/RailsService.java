package com.smk.bi.ticketing.service;

import com.smk.bi.ticketing.model.Rails;



import java.util.List;
public interface RailsService {
    Rails insertRails(Rails rails);
    Rails UpdateRails(Rails rails);
    void deleteRails(Rails rails);
    Rails findByIdt(Long idt);
    List<Rails> findByRailsName(String railsName);

}
