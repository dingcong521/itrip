package com.itrip.dao.hotel;

import com.itrip.bean.pojo.Hotel;

import java.util.List;

/**
 * 旅店的数据访问接口
 */
public interface HotelMapper {
    //查询所有旅店
    List<Hotel> getHotels();
}
