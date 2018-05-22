package cn.e3mall.service;

import cn.e3mall.common.vo.EasyUIDataGridResult;
import cn.e3mall.pojo.TbItem;

public interface ItemService {
	TbItem getItemById(Long itemId);
	EasyUIDataGridResult getItemList(int page,int rows);
}
