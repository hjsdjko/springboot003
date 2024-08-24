package com.cl.dao;

import com.cl.entity.ZhiyuantianbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhiyuantianbaoView;


/**
 * 志愿填报
 * 
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
public interface ZhiyuantianbaoDao extends BaseMapper<ZhiyuantianbaoEntity> {
	
	List<ZhiyuantianbaoView> selectListView(@Param("ew") Wrapper<ZhiyuantianbaoEntity> wrapper);

	List<ZhiyuantianbaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuantianbaoEntity> wrapper);
	
	ZhiyuantianbaoView selectView(@Param("ew") Wrapper<ZhiyuantianbaoEntity> wrapper);
	

}
