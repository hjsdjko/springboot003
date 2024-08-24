package com.cl.entity.view;

import com.cl.entity.ShengfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 省份
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
@TableName("shengfen")
public class ShengfenView  extends ShengfenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengfenView(){
	}
 
 	public ShengfenView(ShengfenEntity shengfenEntity){
 	try {
			BeanUtils.copyProperties(this, shengfenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
