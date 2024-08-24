package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学校信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
@TableName("xuexiaoxinxi")
public class XuexiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuexiaoxinxiEntity() {
		
	}
	
	public XuexiaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学校账号
	 */
					
	private String xuexiaozhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 学校名称
	 */
					
	private String xuexiaomingcheng;
	
	/**
	 * 学校图片
	 */
					
	private String xuexiaotupian;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 学校地址
	 */
					
	private String xuexiaodizhi;
	
	/**
	 * 学校简介
	 */
					
	private String xuexiaojianjie;
	
	/**
	 * 学校特色
	 */
					
	private String xuexiaotese;
	
	/**
	 * 办学理念
	 */
					
	private String banxuelinian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学校账号
	 */
	public void setXuexiaozhanghao(String xuexiaozhanghao) {
		this.xuexiaozhanghao = xuexiaozhanghao;
	}
	/**
	 * 获取：学校账号
	 */
	public String getXuexiaozhanghao() {
		return xuexiaozhanghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：学校名称
	 */
	public void setXuexiaomingcheng(String xuexiaomingcheng) {
		this.xuexiaomingcheng = xuexiaomingcheng;
	}
	/**
	 * 获取：学校名称
	 */
	public String getXuexiaomingcheng() {
		return xuexiaomingcheng;
	}
	/**
	 * 设置：学校图片
	 */
	public void setXuexiaotupian(String xuexiaotupian) {
		this.xuexiaotupian = xuexiaotupian;
	}
	/**
	 * 获取：学校图片
	 */
	public String getXuexiaotupian() {
		return xuexiaotupian;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：学校地址
	 */
	public void setXuexiaodizhi(String xuexiaodizhi) {
		this.xuexiaodizhi = xuexiaodizhi;
	}
	/**
	 * 获取：学校地址
	 */
	public String getXuexiaodizhi() {
		return xuexiaodizhi;
	}
	/**
	 * 设置：学校简介
	 */
	public void setXuexiaojianjie(String xuexiaojianjie) {
		this.xuexiaojianjie = xuexiaojianjie;
	}
	/**
	 * 获取：学校简介
	 */
	public String getXuexiaojianjie() {
		return xuexiaojianjie;
	}
	/**
	 * 设置：学校特色
	 */
	public void setXuexiaotese(String xuexiaotese) {
		this.xuexiaotese = xuexiaotese;
	}
	/**
	 * 获取：学校特色
	 */
	public String getXuexiaotese() {
		return xuexiaotese;
	}
	/**
	 * 设置：办学理念
	 */
	public void setBanxuelinian(String banxuelinian) {
		this.banxuelinian = banxuelinian;
	}
	/**
	 * 获取：办学理念
	 */
	public String getBanxuelinian() {
		return banxuelinian;
	}

}
