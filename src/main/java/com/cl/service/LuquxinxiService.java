package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.LuquxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LuquxinxiView;


/**
 * 录取信息
 *
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
public interface LuquxinxiService extends IService<LuquxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LuquxinxiView> selectListView(Wrapper<LuquxinxiEntity> wrapper);
   	
   	LuquxinxiView selectView(@Param("ew") Wrapper<LuquxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LuquxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<LuquxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<LuquxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<LuquxinxiEntity> wrapper);



}

