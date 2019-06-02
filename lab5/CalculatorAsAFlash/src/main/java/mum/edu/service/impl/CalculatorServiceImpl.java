package mum.edu.service.impl;

import mum.edu.domain.Calculator;
import mum.edu.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public void add(Calculator calculator){
        calculator.setSum(calculator.getAdd1() + calculator.getAdd2());
        return;
    }
public  void mult(Calculator calculator){
        calculator.setProduct(calculator.getMult1() * calculator.getMult2());
        return;
}

}
