package com.vishal.springjpa.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("outofworkinghoursexperience")
//@RefreshScope
@Data
public class Time {
    private List<TimeValue> timeValueList = new ArrayList<>();

    @Data
    static public class TimeValue{
        private String locale;
        private String timeZone;
        private String startTime;
        private String endTime;
    }
}


