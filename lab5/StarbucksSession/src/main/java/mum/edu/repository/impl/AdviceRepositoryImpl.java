package mum.edu.repository.impl;

import mum.edu.data.Database;
import mum.edu.repository.AdviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class AdviceRepositoryImpl  implements AdviceRepository {
    @Autowired
    Database data;
    public List<String> getListByType(String type){
        return data.advice.get(type);
    }
    public Map<Integer, String>getAllRoasts(){
        return data.roasts;
    }
    public String getRoast(Integer key){
        return data.roasts.get(key);
    }
}
