package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ZhiyuantianbaoEntity;
import com.cl.entity.view.ZhiyuantianbaoView;

import com.cl.service.ZhiyuantianbaoService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 志愿填报
 * 后端接口
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
@RestController
@RequestMapping("/zhiyuantianbao")
public class ZhiyuantianbaoController {
    @Autowired
    private ZhiyuantianbaoService zhiyuantianbaoService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhiyuantianbaoEntity zhiyuantianbao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuexiaoxinxi")) {
			zhiyuantianbao.setXuexiaozhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			zhiyuantianbao.setXueshengzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhiyuantianbaoEntity> ew = new EntityWrapper<ZhiyuantianbaoEntity>();

		PageUtils page = zhiyuantianbaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuantianbao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhiyuantianbaoEntity zhiyuantianbao, 
		HttpServletRequest request){
        EntityWrapper<ZhiyuantianbaoEntity> ew = new EntityWrapper<ZhiyuantianbaoEntity>();

		PageUtils page = zhiyuantianbaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuantianbao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhiyuantianbaoEntity zhiyuantianbao){
       	EntityWrapper<ZhiyuantianbaoEntity> ew = new EntityWrapper<ZhiyuantianbaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhiyuantianbao, "zhiyuantianbao")); 
        return R.ok().put("data", zhiyuantianbaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhiyuantianbaoEntity zhiyuantianbao){
        EntityWrapper< ZhiyuantianbaoEntity> ew = new EntityWrapper< ZhiyuantianbaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhiyuantianbao, "zhiyuantianbao")); 
		ZhiyuantianbaoView zhiyuantianbaoView =  zhiyuantianbaoService.selectView(ew);
		return R.ok("查询志愿填报成功").put("data", zhiyuantianbaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhiyuantianbaoEntity zhiyuantianbao = zhiyuantianbaoService.selectById(id);
		zhiyuantianbao = zhiyuantianbaoService.selectView(new EntityWrapper<ZhiyuantianbaoEntity>().eq("id", id));
        return R.ok().put("data", zhiyuantianbao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhiyuantianbaoEntity zhiyuantianbao = zhiyuantianbaoService.selectById(id);
		zhiyuantianbao = zhiyuantianbaoService.selectView(new EntityWrapper<ZhiyuantianbaoEntity>().eq("id", id));
        return R.ok().put("data", zhiyuantianbao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhiyuantianbaoEntity zhiyuantianbao, HttpServletRequest request){
    	zhiyuantianbao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhiyuantianbao);
        zhiyuantianbaoService.insert(zhiyuantianbao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhiyuantianbaoEntity zhiyuantianbao, HttpServletRequest request){
    	zhiyuantianbao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhiyuantianbao);
        zhiyuantianbaoService.insert(zhiyuantianbao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhiyuantianbaoEntity zhiyuantianbao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiyuantianbao);
        zhiyuantianbaoService.updateById(zhiyuantianbao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhiyuantianbaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}