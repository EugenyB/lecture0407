package ua.mk.berkut.lecture0407.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public Integer calc(Integer num1, Integer num2) {
        return num1 + num2;
    }
}
