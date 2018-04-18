package cn.it.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.it.common.PageResult;
import cn.it.common.PageSource;
import cn.it.pojo.TbItem;
import cn.it.pojo.TbItemExample;
import cn.it.service.ItemService;

@Controller
public class MyTest {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/first1")
	public String first1(Model model, @RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "50") Integer rows, HttpServletRequest request) {
		TbItemExample example = new TbItemExample();
		PageHelper.startPage(page.intValue(), rows.intValue());
		List list = this.itemService.selectByExample(example);
		System.out.println(request.getQueryString());
		model.addAttribute("itemList", list);
		return "itemList";
	}

	@RequestMapping("/first2")
	@ResponseBody
	public PageResult first2(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "50") Integer rows) {
		System.out.println(page +"----"+rows);
		TbItemExample example = new TbItemExample();
		PageHelper.startPage(page.intValue(), rows.intValue());
		List<TbItem> list = this.itemService.selectByExample(example);
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		PageResult pageResult = new PageResult();
		pageResult.setTotal(pageInfo.getTotal());
		pageResult.setRows(pageInfo.getList());
		return pageResult;
	}
	@RequestMapping("/first3")
	@ResponseBody
	public PageResult first3(PageSource ps) {
		System.out.println(ps.getPage() +"----"+ps.getRows());
		TbItemExample example = new TbItemExample();
		PageHelper.startPage(ps.getPage().intValue(), ps.getRows());
		List<TbItem> list = this.itemService.selectByExample(example);
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		PageResult pageResult = new PageResult();
		pageResult.setTotal(pageInfo.getTotal());
		pageResult.setRows(pageInfo.getList());
		return pageResult;
	}
}