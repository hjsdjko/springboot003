package com.cl.dao;

import com.cl.entity.LuquxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LuquxinxiView;


/**
 * 录取信息
 * 
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
public interface LuquxinxiDao extends BaseMapper<LuquxinxiEntity> {
	
	List<LuquxinxiView> selectListView(@Param("ew") Wrapper<LuquxinxiEntity> wrapper);

	List<LuquxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LuquxinxiEntity> wrapper);
	
	LuquxinxiView selectView(@Param("ew") Wrapper<LuquxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LuquxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LuquxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LuquxinxiEntity> wrapper);



}
