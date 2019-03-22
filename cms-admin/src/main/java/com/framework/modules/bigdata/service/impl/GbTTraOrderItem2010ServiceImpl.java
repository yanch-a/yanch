package com.framework.modules.bigdata.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.framework.common.utils.PageUtils;
import com.framework.common.utils.Query;

import com.framework.modules.bigdata.dao.GbTTraOrderItem2010Dao;
import com.framework.modules.bigdata.entity.GbTTraOrderItem2010Entity;
import com.framework.modules.bigdata.service.GbTTraOrderItem2010Service;


@Service("gbTTraOrderItem2010Service")
public class GbTTraOrderItem2010ServiceImpl extends ServiceImpl<GbTTraOrderItem2010Dao, GbTTraOrderItem2010Entity> implements GbTTraOrderItem2010Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GbTTraOrderItem2010Entity> page = this.selectPage(
                new Query<GbTTraOrderItem2010Entity>(params).getPage(),
                new EntityWrapper<GbTTraOrderItem2010Entity>()
        );

        return new PageUtils(page);
    }

}
