package com.cl.entity.view;

import com.cl.entity.ZhuanyeleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 专业类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
@TableName("zhuanyeleixing")
public class ZhuanyeleixingView  extends ZhuanyeleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanyeleixingView(){
	}
 
 	public ZhuanyeleixingView(ZhuanyeleixingEntity zhuanyeleixingEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanyeleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
