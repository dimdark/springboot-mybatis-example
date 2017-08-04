package com.dimdark.controller;

import com.dimdark.domain.City;
import com.dimdark.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dimdark
 * @date 2017-08-04
 * @time 11:29 PM
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @GetMapping("/api/city")
    public City findOneCity(@RequestParam(value = "cityName") String cityName) {
        return cityService.findCityByName(cityName);
    }

}
