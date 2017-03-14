package com.itk.item.service;


import com.itk.item.model.ItemInfo;

import java.util.List;

/**
 * Created by enchen on 2/21/17.
 */
public interface ItemInfoService {

    int addItemInfo(ItemInfo itemInfo);

    int updateItemInfo(ItemInfo itemInfo);

    int delItemInfo(Integer id);

    ItemInfo selectByPrimaryKey(Integer id);

    List<ItemInfo> selectByCategoryIdAndStatus(Long categoryId, Integer status);

    List<ItemInfo> selectByShopIdAndStatus(Long shopId, Integer status);

    List<ItemInfo> selectByShopCategoryIdAndStatus(Integer shopCategoryId, Integer status);
}