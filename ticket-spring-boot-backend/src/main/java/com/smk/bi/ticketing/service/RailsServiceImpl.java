package com.smk.bi.ticketing.service;// Nama : Didin nur yahya
import com.smk.bi.ticketing.model.Rails;
import com.smk.bi.ticketing.repository.RailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
// kelas : 16102087
@Service
public class RailsServiceImpl {
    @Autowired
    private RailsRepository railsRepository;
    @Override
    public Rails insertRails(Rails rails) {
        return railsRepository.save(rails);
    }
    @Override
    public Rails UpdateRails(Rails rails) {
        return railsRepository.save(rails);
    }

    @Override
    public void deleteRails(Rails rails) {
        railsRepository.delete(rails.getRailsId());
    }

    @Override
    public Rails findByIdt(Long idt) {
        return railsRepository.findOne(idt);
    }
    @Override
    public List<Rails> findByName(String railsName) { return railsRepository.findByRailsName(railsName
    );
    }



}
