package com.framework.modules.sys.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.framework.common.utils.PageUtils;
import com.framework.common.utils.R;
import com.framework.common.validator.ValidatorUtils;
import com.framework.modules.sys.entity.SeCollectionEntity;
import com.framework.modules.sys.service.SeCollectionService;
import com.framework.modules.sys.shiro.ShiroUtils;



/**
 * 
 *
 * @author MIT
 * @email framework@gmail.com
 * @date 2018-09-26 10:16:24
 */
@RestController
@RequestMapping("sys/secollection")
public class SeCollectionController {
    @Autowired
    private SeCollectionService seCollectionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:secollection:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = seCollectionService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:secollection:info")
    public R info(@PathVariable("id") String id){
        SeCollectionEntity seCollection = seCollectionService.selectById(id);
        
        return R.ok().put("seCollection", seCollection);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:secollection:save")
    public R save(@RequestBody SeCollectionEntity seCollection){
    	//创建日期
    	seCollection.setCreateTime(new Date());
    	//设置所属用户
    	seCollection.setUserId(ShiroUtils.getUserEntity().getUserId());
        seCollectionService.insert(seCollection);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:secollection:update")
    public R update(@RequestBody SeCollectionEntity seCollection){
        ValidatorUtils.validateEntity(seCollection);
        seCollectionService.updateAllColumnById(seCollection);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:secollection:delete")
    public R delete(@RequestBody String[] ids){
        seCollectionService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
