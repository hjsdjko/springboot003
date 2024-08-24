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
 * 录取信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
@TableName("luquxinxi")
public class LuquxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LuquxinxiEntity() {
		
	}
	
	public LuquxinxiEntity(T t) {
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
	 * 录取分数线
	 */
					
	private Integer luqufenshuxian;
	
	/**
	 * 省份
	 */
					
	private String shengfen;
	
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
	 * 填报专业
	 */
					
	private String tianbaozhuanye;
	
	/**
	 * 学生账号
	 */
					
	private String xueshengzhanghao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 填报时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tianbaoshijian;
	
	/**
	 * 考试总分
	 */
					
	private Double kaoshizongfen;
	
	/**
	 * 录取专业
	 */
					
	private String luquzhuanye;
	
	/**
	 * 公布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gongbushijian;
	
	
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
	 * 设置：录取分数线
	 */
	public void setLuqufenshuxian(Integer luqufenshuxian) {
		this.luqufenshuxian = luqufenshuxian;
	}
	/**
	 * 获取：录取分数线
	 */
	public Integer getLuqufenshuxian() {
		return luqufenshuxian;
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
	 * 设置：填报专业
	 */
	public void setTianbaozhuanye(String tianbaozhuanye) {
		this.tianbaozhuanye = tianbaozhuanye;
	}
	/**
	 * 获取：填报专业
	 */
	public String getTianbaozhuanye() {
		return tianbaozhuanye;
	}
	/**
	 * 设置：学生账号
	 */
	public void setXueshengzhanghao(String xueshengzhanghao) {
		this.xueshengzhanghao = xueshengzhanghao;
	}
	/**
	 * 获取：学生账号
	 */
	public String getXueshengzhanghao() {
		return xueshengzhanghao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：填报时间
	 */
	public void setTianbaoshijian(Date tianbaoshijian) {
		this.tianbaoshijian = tianbaoshijian;
	}
	/**
	 * 获取：填报时间
	 */
	public Date getTianbaoshijian() {
		return tianbaoshijian;
	}
	/**
	 * 设置：考试总分
	 */
	public void setKaoshizongfen(Double kaoshizongfen) {
		this.kaoshizongfen = kaoshizongfen;
	}
	/**
	 * 获取：考试总分
	 */
	public Double getKaoshizongfen() {
		return kaoshizongfen;
	}
	/**
	 * 设置：录取专业
	 */
	public void setLuquzhuanye(String luquzhuanye) {
		this.luquzhuanye = luquzhuanye;
	}
	/**
	 * 获取：录取专业
	 */
	public String getLuquzhuanye() {
		return luquzhuanye;
	}
	/**
	 * 设置：公布时间
	 */
	public void setGongbushijian(Date gongbushijian) {
		this.gongbushijian = gongbushijian;
	}
	/**
	 * 获取：公布时间
	 */
	public Date getGongbushijian() {
		return gongbushijian;
	}

}
