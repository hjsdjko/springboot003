package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZhuanyeleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhuanyeleixingView;


/**
 * 专业类型
 *
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
public interface ZhuanyeleixingService extends IService<ZhuanyeleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanyeleixingView> selectListView(Wrapper<ZhuanyeleixingEntity> wrapper);
   	
   	ZhuanyeleixingView selectView(@Param("ew") Wrapper<ZhuanyeleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanyeleixingEntity> wrapper);
   	

}

