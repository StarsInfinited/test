package cn.e3mall.service;

import java.util.List;

import cn.e3mall.common.vo.EasyUITreeNode;

public interface ItemCatService {
	List<EasyUITreeNode> getCatList(long id);
}
