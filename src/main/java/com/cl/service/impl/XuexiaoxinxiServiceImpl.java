package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.XuexiaoxinxiDao;
import com.cl.entity.XuexiaoxinxiEntity;
import com.cl.service.XuexiaoxinxiService;
import com.cl.entity.view.XuexiaoxinxiView;

@Service("xuexiaoxinxiService")
public class XuexiaoxinxiServiceImpl extends ServiceImpl<XuexiaoxinxiDao, XuexiaoxinxiEntity> implements XuexiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiaoxinxiEntity> page = this.selectPage(
                new Query<XuexiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<XuexiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiaoxinxiEntity> wrapper) {
		  Page<XuexiaoxinxiView> page =new Query<XuexiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XuexiaoxinxiView> selectListView(Wrapper<XuexiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexiaoxinxiView selectView(Wrapper<XuexiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
