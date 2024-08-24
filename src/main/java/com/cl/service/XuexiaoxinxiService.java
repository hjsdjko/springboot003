package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XuexiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XuexiaoxinxiView;


/**
 * 学校信息
 *
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
public interface XuexiaoxinxiService extends IService<XuexiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiaoxinxiView> selectListView(Wrapper<XuexiaoxinxiEntity> wrapper);
   	
   	XuexiaoxinxiView selectView(@Param("ew") Wrapper<XuexiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiaoxinxiEntity> wrapper);
   	

}

