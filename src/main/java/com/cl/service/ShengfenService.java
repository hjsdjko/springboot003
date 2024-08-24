package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShengfenEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShengfenView;


/**
 * 省份
 *
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
public interface ShengfenService extends IService<ShengfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengfenView> selectListView(Wrapper<ShengfenEntity> wrapper);
   	
   	ShengfenView selectView(@Param("ew") Wrapper<ShengfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengfenEntity> wrapper);
   	

}

