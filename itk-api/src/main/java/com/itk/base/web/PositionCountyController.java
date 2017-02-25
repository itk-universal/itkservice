package com.itk.base.web;

import com.itk.base.service.PositionCountyServiceImpl;
import com.itk.utils.WebResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enchen on 2/23/17.
 */
@RestController
@RequestMapping("/base/position/county")
public class PositionCountyController {

    @Autowired
    private PositionCountyServiceImpl countyService;

    @RequestMapping(value = "/selectCountyByCityId/{cityId}", method = RequestMethod.GET)
    public WebResult selectCountyByCityId(@PathVariable(value = "cityId") Long cityId) throws Exception {
        return WebResult.ok(countyService.selectCountyByCityId(cityId));
    }

    @RequestMapping(value = "/selectCountyByCountyId/{countyId}", method = RequestMethod.GET)
    public WebResult selectCountyByCountyId(@PathVariable(value = "countyId") Long countyId) throws Exception {
        return WebResult.ok(countyService.selectCountyByCountyId(countyId));
    }
}