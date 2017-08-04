package com.dimdark.service.impl;

import com.dimdark.dao.CityDao;
import com.dimdark.domain.City;
import com.dimdark.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dimdark
 * @date 2017-08-04
 * @time 11:26 PM
 */
@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao;

    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
