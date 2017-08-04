package com.dimdark.dao;

import com.dimdark.domain.City;
import org.apache.ibatis.annotations.Param;

/**
 * @author dimdark
 * @date 2017-08-04
 * @time 10:11 PM
 */
public interface CityDao {

    City findByName(@Param("cityName") String cityName);

}
