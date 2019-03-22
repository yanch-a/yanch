package com.framework.modules.bigdata.service;

import com.baomidou.mybatisplus.service.IService;
import com.framework.common.utils.PageUtils;
import com.framework.modules.bigdata.entity.GbTTraOrderItem2010Entity;

import java.util.Map;

/**
 * 订单明细表
 *
 * @author MIT
 * @email framework@gmail.com
 * @date 2019-03-08 17:11:42
 */
public interface GbTTraOrderItem2010Service extends IService<GbTTraOrderItem2010Entity> {

    PageUtils queryPage(Map<String, Object> params);
}

