package cn.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.it.mapper.TbItemMapper;
import cn.it.pojo.TbItem;
import cn.it.pojo.TbItemExample;

@Service
public class ItemService {
	@Autowired
	private TbItemMapper itemMapper;

	public List<TbItem> selectByExample(TbItemExample example) {
		return this.itemMapper.selectByExample(example);
	}
}