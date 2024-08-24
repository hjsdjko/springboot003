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

import com.cl.entity.ZhaoshengxinxiEntity;
import com.cl.entity.view.ZhaoshengxinxiView;

import com.cl.service.ZhaoshengxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 招生信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
@RestController
@RequestMapping("/zhaoshengxinxi")
public class ZhaoshengxinxiController {
    @Autowired
    private ZhaoshengxinxiService zhaoshengxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhaoshengxinxiEntity zhaoshengxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuexiaoxinxi")) {
			zhaoshengxinxi.setXuexiaozhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhaoshengxinxiEntity> ew = new EntityWrapper<ZhaoshengxinxiEntity>();

		PageUtils page = zhaoshengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaoshengxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhaoshengxinxiEntity zhaoshengxinxi, 
		HttpServletRequest request){
        EntityWrapper<ZhaoshengxinxiEntity> ew = new EntityWrapper<ZhaoshengxinxiEntity>();

		PageUtils page = zhaoshengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaoshengxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhaoshengxinxiEntity zhaoshengxinxi){
       	EntityWrapper<ZhaoshengxinxiEntity> ew = new EntityWrapper<ZhaoshengxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhaoshengxinxi, "zhaoshengxinxi")); 
        return R.ok().put("data", zhaoshengxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhaoshengxinxiEntity zhaoshengxinxi){
        EntityWrapper< ZhaoshengxinxiEntity> ew = new EntityWrapper< ZhaoshengxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhaoshengxinxi, "zhaoshengxinxi")); 
		ZhaoshengxinxiView zhaoshengxinxiView =  zhaoshengxinxiService.selectView(ew);
		return R.ok("查询招生信息成功").put("data", zhaoshengxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhaoshengxinxiEntity zhaoshengxinxi = zhaoshengxinxiService.selectById(id);
		zhaoshengxinxi = zhaoshengxinxiService.selectView(new EntityWrapper<ZhaoshengxinxiEntity>().eq("id", id));
        return R.ok().put("data", zhaoshengxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhaoshengxinxiEntity zhaoshengxinxi = zhaoshengxinxiService.selectById(id);
		zhaoshengxinxi = zhaoshengxinxiService.selectView(new EntityWrapper<ZhaoshengxinxiEntity>().eq("id", id));
        return R.ok().put("data", zhaoshengxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhaoshengxinxiEntity zhaoshengxinxi, HttpServletRequest request){
    	zhaoshengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhaoshengxinxi);
        zhaoshengxinxiService.insert(zhaoshengxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhaoshengxinxiEntity zhaoshengxinxi, HttpServletRequest request){
    	zhaoshengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhaoshengxinxi);
        zhaoshengxinxiService.insert(zhaoshengxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhaoshengxinxiEntity zhaoshengxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhaoshengxinxi);
        zhaoshengxinxiService.updateById(zhaoshengxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhaoshengxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	





    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<ZhaoshengxinxiEntity> ew = new EntityWrapper<ZhaoshengxinxiEntity>();
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuexiaoxinxi")) {
            ew.eq("xuexiaozhanghao", (String)request.getSession().getAttribute("username"));
		}
        List<Map<String, Object>> result = zhaoshengxinxiService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计(多)）
     */
    @RequestMapping("/valueMul/{xColumnName}")
    public R valueMul(@PathVariable("xColumnName") String xColumnName,@RequestParam String yColumnNameMul, HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<ZhaoshengxinxiEntity> ew = new EntityWrapper<ZhaoshengxinxiEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuexiaoxinxi")) {
            ew.eq("xuexiaozhanghao", (String)request.getSession().getAttribute("username"));
        }
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = zhaoshengxinxiService.selectValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<ZhaoshengxinxiEntity> ew = new EntityWrapper<ZhaoshengxinxiEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuexiaoxinxi")) {
            ew.eq("xuexiaozhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = zhaoshengxinxiService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型(多)
     */
    @RequestMapping("/valueMul/{xColumnName}/{timeStatType}")
    public R valueMulDay(@PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,@RequestParam String yColumnNameMul,HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("timeStatType", timeStatType);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<ZhaoshengxinxiEntity> ew = new EntityWrapper<ZhaoshengxinxiEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuexiaoxinxi")) {
            ew.eq("xuexiaozhanghao", (String)request.getSession().getAttribute("username"));
        }
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = zhaoshengxinxiService.selectTimeStatValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<ZhaoshengxinxiEntity> ew = new EntityWrapper<ZhaoshengxinxiEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuexiaoxinxi")) {
            ew.eq("xuexiaozhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = zhaoshengxinxiService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }




    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,ZhaoshengxinxiEntity zhaoshengxinxi, HttpServletRequest request){
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xuexiaoxinxi")) {
            zhaoshengxinxi.setXuexiaozhanghao((String)request.getSession().getAttribute("username"));
        }
        EntityWrapper<ZhaoshengxinxiEntity> ew = new EntityWrapper<ZhaoshengxinxiEntity>();
        int count = zhaoshengxinxiService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaoshengxinxi), params), params));
        return R.ok().put("data", count);
    }


}
