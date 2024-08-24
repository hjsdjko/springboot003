package com.cl.dao;

import com.cl.entity.ZhuanyeleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhuanyeleixingView;


/**
 * 专业类型
 * 
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
public interface ZhuanyeleixingDao extends BaseMapper<ZhuanyeleixingEntity> {
	
	List<ZhuanyeleixingView> selectListView(@Param("ew") Wrapper<ZhuanyeleixingEntity> wrapper);

	List<ZhuanyeleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanyeleixingEntity> wrapper);
	
	ZhuanyeleixingView selectView(@Param("ew") Wrapper<ZhuanyeleixingEntity> wrapper);
	

}
