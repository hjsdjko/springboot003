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

import com.cl.entity.ShengfenEntity;
import com.cl.entity.view.ShengfenView;

import com.cl.service.ShengfenService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 省份
 * 后端接口
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
@RestController
@RequestMapping("/shengfen")
public class ShengfenController {
    @Autowired
    private ShengfenService shengfenService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShengfenEntity shengfen,
		HttpServletRequest request){
        EntityWrapper<ShengfenEntity> ew = new EntityWrapper<ShengfenEntity>();

		PageUtils page = shengfenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shengfen), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShengfenEntity shengfen, 
		HttpServletRequest request){
        EntityWrapper<ShengfenEntity> ew = new EntityWrapper<ShengfenEntity>();

		PageUtils page = shengfenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shengfen), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShengfenEntity shengfen){
       	EntityWrapper<ShengfenEntity> ew = new EntityWrapper<ShengfenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shengfen, "shengfen")); 
        return R.ok().put("data", shengfenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShengfenEntity shengfen){
        EntityWrapper< ShengfenEntity> ew = new EntityWrapper< ShengfenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shengfen, "shengfen")); 
		ShengfenView shengfenView =  shengfenService.selectView(ew);
		return R.ok("查询省份成功").put("data", shengfenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShengfenEntity shengfen = shengfenService.selectById(id);
		shengfen = shengfenService.selectView(new EntityWrapper<ShengfenEntity>().eq("id", id));
        return R.ok().put("data", shengfen);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShengfenEntity shengfen = shengfenService.selectById(id);
		shengfen = shengfenService.selectView(new EntityWrapper<ShengfenEntity>().eq("id", id));
        return R.ok().put("data", shengfen);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShengfenEntity shengfen, HttpServletRequest request){
    	shengfen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shengfen);
        shengfenService.insert(shengfen);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShengfenEntity shengfen, HttpServletRequest request){
    	shengfen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shengfen);
        shengfenService.insert(shengfen);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShengfenEntity shengfen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shengfen);
        shengfenService.updateById(shengfen);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shengfenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
