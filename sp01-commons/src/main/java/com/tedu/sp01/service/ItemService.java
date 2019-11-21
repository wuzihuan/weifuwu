package com.tedu.sp01.service;

import java.util.List;
import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//根据订单号,来获取商品列表
	List<Item> getItems(String orderId);
	//根据商品列表,来减少商品库存
	void decreaseNumbers(List<Item> list);
}

