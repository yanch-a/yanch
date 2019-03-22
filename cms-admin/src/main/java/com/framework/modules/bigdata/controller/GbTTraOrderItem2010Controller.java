package com.framework.modules.bigdata.controller;

import java.util.Arrays;
import java.util.Map;

import com.framework.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.framework.modules.bigdata.entity.GbTTraOrderItem2010Entity;
import com.framework.modules.bigdata.service.GbTTraOrderItem2010Service;
import com.framework.common.utils.PageUtils;
import com.framework.common.utils.R;



/**
 * 订单明细表
 *
 * @author MIT
 * @email framework@gmail.com
 * @date 2019-03-08 17:11:42
 */
@RestController
@RequestMapping("front/bigdata/traorderitem")
public class GbTTraOrderItem2010Controller {
    @Autowired
    private GbTTraOrderItem2010Service gbTTraOrderItem2010Service;

    /**
     * 列表
     */
    @RequestMapping("/list.html")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = gbTTraOrderItem2010Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{did}")
    @RequiresPermissions("bigdata:gbttraorderitem2010:info")
    public R info(@PathVariable("did") Long did){
        GbTTraOrderItem2010Entity gbTTraOrderItem2010 = gbTTraOrderItem2010Service.selectById(did);

        return R.ok().put("gbTTraOrderItem2010", gbTTraOrderItem2010);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("bigdata:gbttraorderitem2010:save")
    public R save(@RequestBody GbTTraOrderItem2010Entity gbTTraOrderItem2010){
        gbTTraOrderItem2010Service.insert(gbTTraOrderItem2010);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("bigdata:gbttraorderitem2010:update")
    public R update(@RequestBody GbTTraOrderItem2010Entity gbTTraOrderItem2010){
        ValidatorUtils.validateEntity(gbTTraOrderItem2010);
        gbTTraOrderItem2010Service.updateAllColumnById(gbTTraOrderItem2010);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("bigdata:gbttraorderitem2010:delete")
    public R delete(@RequestBody Long[] dids){
        gbTTraOrderItem2010Service.deleteBatchIds(Arrays.asList(dids));

        return R.ok();
    }

}
