package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZhiyuantianbaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhiyuantianbaoView;


/**
 * 志愿填报
 *
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
public interface ZhiyuantianbaoService extends IService<ZhiyuantianbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuantianbaoView> selectListView(Wrapper<ZhiyuantianbaoEntity> wrapper);
   	
   	ZhiyuantianbaoView selectView(@Param("ew") Wrapper<ZhiyuantianbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuantianbaoEntity> wrapper);
   	

}

