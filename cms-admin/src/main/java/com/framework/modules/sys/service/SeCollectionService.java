package com.framework.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.framework.common.utils.PageUtils;
import com.framework.modules.sys.entity.SeCollectionEntity;

import java.util.Map;

/**
 * 
 *
 * @author MIT
 * @email framework@gmail.com
 * @date 2018-09-26 10:16:24
 */
public interface SeCollectionService extends IService<SeCollectionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

