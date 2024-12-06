package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.ZhaopinfenleiDao;
import com.cl.entity.ZhaopinfenleiEntity;
import com.cl.service.ZhaopinfenleiService;
import com.cl.entity.view.ZhaopinfenleiView;

@Service("zhaopinfenleiService")
public class ZhaopinfenleiServiceImpl extends ServiceImpl<ZhaopinfenleiDao, ZhaopinfenleiEntity> implements ZhaopinfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaopinfenleiEntity> page = this.selectPage(
                new Query<ZhaopinfenleiEntity>(params).getPage(),
                new EntityWrapper<ZhaopinfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaopinfenleiEntity> wrapper) {
		  Page<ZhaopinfenleiView> page =new Query<ZhaopinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZhaopinfenleiView> selectListView(Wrapper<ZhaopinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaopinfenleiView selectView(Wrapper<ZhaopinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
