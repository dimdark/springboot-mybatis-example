package com.dimdark.service;

import com.dimdark.domain.City;

/**
 * @author dimdark
 * @date 2017-08-04
 * @time 11:25 PM
 */
public interface CityService {

    City findCityByName(String cityName);

}
