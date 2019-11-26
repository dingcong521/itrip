package com.itrip.biz.service.impl;

import com.itrip.bean.pojo.Hotel;
import com.itrip.biz.service.HotelService;

import com.itrip.dao.hotel.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelMapper hote;
    @Override
    public List<Hotel> getHotels() {
        return hote.getHotels();
    }
}
