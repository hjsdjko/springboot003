package com.cl.dao;

import com.cl.entity.ForumEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ForumView;


/**
 * 国际交流
 * 
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
public interface ForumDao extends BaseMapper<ForumEntity> {
	
	List<ForumView> selectListView(@Param("ew") Wrapper<ForumEntity> wrapper);

	List<ForumView> selectListView(Pagination page,@Param("ew") Wrapper<ForumEntity> wrapper);
	
	ForumView selectView(@Param("ew") Wrapper<ForumEntity> wrapper);
	

}