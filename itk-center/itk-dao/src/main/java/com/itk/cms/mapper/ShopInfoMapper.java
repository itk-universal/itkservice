package com.itk.cms.mapper;

import com.itk.cms.model.ShopInfo;
import com.itk.cms.model.ShopInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopInfoMapper {
    int countByExample(ShopInfoExample example);

    int deleteByExample(ShopInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShopInfo record);

    int insertSelective(ShopInfo record);

    List<ShopInfo> selectByExample(ShopInfoExample example);

    ShopInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShopInfo record, @Param("example") ShopInfoExample example);

    int updateByExample(@Param("record") ShopInfo record, @Param("example") ShopInfoExample example);

    int updateByPrimaryKeySelective(ShopInfo record);

    int updateByPrimaryKey(ShopInfo record);
}