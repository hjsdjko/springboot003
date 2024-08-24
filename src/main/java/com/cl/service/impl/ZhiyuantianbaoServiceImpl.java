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


import com.cl.dao.ZhiyuantianbaoDao;
import com.cl.entity.ZhiyuantianbaoEntity;
import com.cl.service.ZhiyuantianbaoService;
import com.cl.entity.view.ZhiyuantianbaoView;

@Service("zhiyuantianbaoService")
public class ZhiyuantianbaoServiceImpl extends ServiceImpl<ZhiyuantianbaoDao, ZhiyuantianbaoEntity> implements ZhiyuantianbaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuantianbaoEntity> page = this.selectPage(
                new Query<ZhiyuantianbaoEntity>(params).getPage(),
                new EntityWrapper<ZhiyuantianbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuantianbaoEntity> wrapper) {
		  Page<ZhiyuantianbaoView> page =new Query<ZhiyuantianbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZhiyuantianbaoView> selectListView(Wrapper<ZhiyuantianbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuantianbaoView selectView(Wrapper<ZhiyuantianbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
