package mum.edu.service.impl;

import mum.edu.domain.User;
import mum.edu.repository.AdviceRepository;
import mum.edu.repository.UserRepository;
import mum.edu.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdviceUserImpl implements AdviceService {
    @Autowired
    AdviceRepository adviceRepository;

    public List<String> getListByType(String type) {
        return adviceRepository.getListByType(type);
    }

    public Map<Integer, String> getAllRoasts() {
        return 	adviceRepository.getAllRoasts();
    }

    public String getRoast(Integer key) {
        return adviceRepository.getRoast(key);
    }
}



