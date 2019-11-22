package com.example.work.util.service;

import cn.hutool.core.convert.Convert;
import cn.hutool.json.JSONUtil;

import com.example.work.util.dao.AreaDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2019/11/22 9:58
 */
@Service
public class AreaService {
  @Autowired
  private AreaDao areaDao;

  public void gen() {

    // province
    List<Map<String, Object>> proviceList = areaDao.getprovince();

    List resutlList = new LinkedList();

    for (Map<String, Object> proviceMap : proviceList) {
      AreaVO proviceVO = new AreaVO();
      resutlList.add(proviceVO);

      proviceVO.setName(Convert.toStr(proviceMap.get("name")));
      proviceVO.setId(Convert.toStr(proviceMap.get("province_id")));

      List<Map<String, Object>> cityList = areaDao.getcity(proviceVO.getId());
      List cityVOList = new LinkedList();
      proviceVO.setCityList(cityVOList);
      for(Map<String, Object> cityMap : cityList){
        AreaVO cityVO = new AreaVO();
        cityVOList.add(cityVO);
        cityVO.setName(Convert.toStr(cityMap.get("name")));
        cityVO.setId(Convert.toStr(cityMap.get("city_id")));

        List<Map<String, Object>> countryList = areaDao.getcounty(cityVO.getId());
        List countryVOList = new LinkedList();
        cityVO.setCityList(countryVOList);
        for(Map<String, Object> countryMap : countryList){
          AreaVO countryVO = new AreaVO();
          countryVOList.add(countryVO);
          countryVO.setName(Convert.toStr(countryMap.get("name")));
          countryVO.setId(Convert.toStr(countryMap.get("county_id")));

        }

      }


    }

    // city

    // county

    System.out.println(JSONUtil.toJsonPrettyStr(resutlList));

  }



}

class AreaVO {

  private String id;
  private String name;
  private List<AreaVO> cityList;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<AreaVO> getCityList() {
    return cityList;
  }

  public void setCityList(List<AreaVO> cityList) {
    this.cityList = cityList;
  }
}