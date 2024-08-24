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


import com.cl.dao.ZhuanyeleixingDao;
import com.cl.entity.ZhuanyeleixingEntity;
import com.cl.service.ZhuanyeleixingService;
import com.cl.entity.view.ZhuanyeleixingView;

@Service("zhuanyeleixingService")
public class ZhuanyeleixingServiceImpl extends ServiceImpl<ZhuanyeleixingDao, ZhuanyeleixingEntity> implements ZhuanyeleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanyeleixingEntity> page = this.selectPage(
                new Query<ZhuanyeleixingEntity>(params).getPage(),
                new EntityWrapper<ZhuanyeleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanyeleixingEntity> wrapper) {
		  Page<ZhuanyeleixingView> page =new Query<ZhuanyeleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZhuanyeleixingView> selectListView(Wrapper<ZhuanyeleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanyeleixingView selectView(Wrapper<ZhuanyeleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
