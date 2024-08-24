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


import com.cl.dao.LuquxinxiDao;
import com.cl.entity.LuquxinxiEntity;
import com.cl.service.LuquxinxiService;
import com.cl.entity.view.LuquxinxiView;

@Service("luquxinxiService")
public class LuquxinxiServiceImpl extends ServiceImpl<LuquxinxiDao, LuquxinxiEntity> implements LuquxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LuquxinxiEntity> page = this.selectPage(
                new Query<LuquxinxiEntity>(params).getPage(),
                new EntityWrapper<LuquxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LuquxinxiEntity> wrapper) {
		  Page<LuquxinxiView> page =new Query<LuquxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<LuquxinxiView> selectListView(Wrapper<LuquxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LuquxinxiView selectView(Wrapper<LuquxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<LuquxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<LuquxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<LuquxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
