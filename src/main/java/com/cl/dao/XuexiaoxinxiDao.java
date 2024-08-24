package com.cl.dao;

import com.cl.entity.XuexiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XuexiaoxinxiView;


/**
 * 学校信息
 * 
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
public interface XuexiaoxinxiDao extends BaseMapper<XuexiaoxinxiEntity> {
	
	List<XuexiaoxinxiView> selectListView(@Param("ew") Wrapper<XuexiaoxinxiEntity> wrapper);

	List<XuexiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiaoxinxiEntity> wrapper);
	
	XuexiaoxinxiView selectView(@Param("ew") Wrapper<XuexiaoxinxiEntity> wrapper);
	

}
