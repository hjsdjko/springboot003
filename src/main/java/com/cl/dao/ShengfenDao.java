package com.cl.dao;

import com.cl.entity.ShengfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShengfenView;


/**
 * 省份
 * 
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
public interface ShengfenDao extends BaseMapper<ShengfenEntity> {
	
	List<ShengfenView> selectListView(@Param("ew") Wrapper<ShengfenEntity> wrapper);

	List<ShengfenView> selectListView(Pagination page,@Param("ew") Wrapper<ShengfenEntity> wrapper);
	
	ShengfenView selectView(@Param("ew") Wrapper<ShengfenEntity> wrapper);
	

}
