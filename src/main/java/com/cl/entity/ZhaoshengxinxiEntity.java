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
 * 招生信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
@TableName("zhaoshengxinxi")
public class ZhaoshengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhaoshengxinxiEntity() {
		
	}
	
	public ZhaoshengxinxiEntity(T t) {
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
	 * 学校名称
	 */
					
	private String xuexiaomingcheng;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 学校地址
	 */
					
	private String xuexiaodizhi;
	
	/**
	 * 专业类型
	 */
					
	private String zhuanyeleixing;
	
	/**
	 * 招生计划
	 */
					
	private String zhaoshengjihua;
	
	/**
	 * 学校图片
	 */
					
	private String xuexiaotupian;
	
	/**
	 * 录取分数线
	 */
					
	private Double luqufenshuxian;
	
	/**
	 * 学费标准
	 */
					
	private Integer xuefeibiaozhun;
	
	/**
	 * 报名时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date baomingshijian;
	
	/**
	 * 考试时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date kaoshishijian;
	
	/**
	 * 招生政策
	 */
					
	private String zhaoshengzhengce;
	
	/**
	 * 专业介绍
	 */
					
	private String zhuanyejieshao;
	
	/**
	 * 就业前景
	 */
					
	private String jiuyeqianjing;
	
	/**
	 * 省份
	 */
					
	private String shengfen;
	
	
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
	 * 设置：专业类型
	 */
	public void setZhuanyeleixing(String zhuanyeleixing) {
		this.zhuanyeleixing = zhuanyeleixing;
	}
	/**
	 * 获取：专业类型
	 */
	public String getZhuanyeleixing() {
		return zhuanyeleixing;
	}
	/**
	 * 设置：招生计划
	 */
	public void setZhaoshengjihua(String zhaoshengjihua) {
		this.zhaoshengjihua = zhaoshengjihua;
	}
	/**
	 * 获取：招生计划
	 */
	public String getZhaoshengjihua() {
		return zhaoshengjihua;
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
	 * 设置：录取分数线
	 */
	public void setLuqufenshuxian(Double luqufenshuxian) {
		this.luqufenshuxian = luqufenshuxian;
	}
	/**
	 * 获取：录取分数线
	 */
	public Double getLuqufenshuxian() {
		return luqufenshuxian;
	}
	/**
	 * 设置：学费标准
	 */
	public void setXuefeibiaozhun(Integer xuefeibiaozhun) {
		this.xuefeibiaozhun = xuefeibiaozhun;
	}
	/**
	 * 获取：学费标准
	 */
	public Integer getXuefeibiaozhun() {
		return xuefeibiaozhun;
	}
	/**
	 * 设置：报名时间
	 */
	public void setBaomingshijian(Date baomingshijian) {
		this.baomingshijian = baomingshijian;
	}
	/**
	 * 获取：报名时间
	 */
	public Date getBaomingshijian() {
		return baomingshijian;
	}
	/**
	 * 设置：考试时间
	 */
	public void setKaoshishijian(Date kaoshishijian) {
		this.kaoshishijian = kaoshishijian;
	}
	/**
	 * 获取：考试时间
	 */
	public Date getKaoshishijian() {
		return kaoshishijian;
	}
	/**
	 * 设置：招生政策
	 */
	public void setZhaoshengzhengce(String zhaoshengzhengce) {
		this.zhaoshengzhengce = zhaoshengzhengce;
	}
	/**
	 * 获取：招生政策
	 */
	public String getZhaoshengzhengce() {
		return zhaoshengzhengce;
	}
	/**
	 * 设置：专业介绍
	 */
	public void setZhuanyejieshao(String zhuanyejieshao) {
		this.zhuanyejieshao = zhuanyejieshao;
	}
	/**
	 * 获取：专业介绍
	 */
	public String getZhuanyejieshao() {
		return zhuanyejieshao;
	}
	/**
	 * 设置：就业前景
	 */
	public void setJiuyeqianjing(String jiuyeqianjing) {
		this.jiuyeqianjing = jiuyeqianjing;
	}
	/**
	 * 获取：就业前景
	 */
	public String getJiuyeqianjing() {
		return jiuyeqianjing;
	}
	/**
	 * 设置：省份
	 */
	public void setShengfen(String shengfen) {
		this.shengfen = shengfen;
	}
	/**
	 * 获取：省份
	 */
	public String getShengfen() {
		return shengfen;
	}

}
