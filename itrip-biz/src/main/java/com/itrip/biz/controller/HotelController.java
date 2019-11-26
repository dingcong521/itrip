package com.itrip.biz.controller;

import com.itrip.bean.dto.Dto;
import com.itrip.bean.pojo.Hotel;
import com.itrip.biz.service.HotelService;
import com.itrip.common.DtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {
    @Autowired
    private HotelService hotelService;
@RequestMapping(value ="/hotel",method= RequestMethod.GET,
        produces={"application/json;charset=UTF-8"} )
    public Dto queryHotels() {
        List<Hotel> hotels = hotelService.getHotels();
        return DtoUtil.returnSuccess("查询宾馆成功",hotels);
    }
}
