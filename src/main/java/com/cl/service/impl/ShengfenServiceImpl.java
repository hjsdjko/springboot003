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


import com.cl.dao.ShengfenDao;
import com.cl.entity.ShengfenEntity;
import com.cl.service.ShengfenService;
import com.cl.entity.view.ShengfenView;

@Service("shengfenService")
public class ShengfenServiceImpl extends ServiceImpl<ShengfenDao, ShengfenEntity> implements ShengfenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengfenEntity> page = this.selectPage(
                new Query<ShengfenEntity>(params).getPage(),
                new EntityWrapper<ShengfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengfenEntity> wrapper) {
		  Page<ShengfenView> page =new Query<ShengfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShengfenView> selectListView(Wrapper<ShengfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengfenView selectView(Wrapper<ShengfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
