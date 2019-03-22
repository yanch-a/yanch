package com.framework.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.framework.common.utils.PageUtils;
import com.framework.common.utils.Query;

import com.framework.modules.sys.dao.SeCollectionDao;
import com.framework.modules.sys.entity.SeCollectionEntity;
import com.framework.modules.sys.service.SeCollectionService;
import com.framework.modules.sys.shiro.ShiroUtils;


@Service("seCollectionService")
public class SeCollectionServiceImpl extends ServiceImpl<SeCollectionDao, SeCollectionEntity> implements SeCollectionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
    	Long userId = ShiroUtils.getUserEntity().getUserId();
        Page<SeCollectionEntity> page = this.selectPage(
                new Query<SeCollectionEntity>(params).getPage(),
                new EntityWrapper<SeCollectionEntity>().eq("USER_ID", userId)
        );

        return new PageUtils(page);
    }

}
