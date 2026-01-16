package com.example.lab1practice.service;

import org.hibernate.annotations.CurrentTimestamp;
import org.springframework.stereotype.Service;


import java.time.LocalTime;

@Service
public class TimeService {
    public String getTime(){
        return LocalTime.now().toString();
    }

}
