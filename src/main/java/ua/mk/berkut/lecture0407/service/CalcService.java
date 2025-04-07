package ua.mk.berkut.lecture0407.service;

import org.springframework.stereotype.Service;
import ua.mk.berkut.lecture0407.data.CalcResult;

@Service
public class CalcService {

    public CalcResult calc(Integer num1, Integer num2) {
        return new CalcResult(num1, num2, num1 + num2);
    }
}
