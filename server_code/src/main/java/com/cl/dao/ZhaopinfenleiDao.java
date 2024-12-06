package com.cl.dao;

import com.cl.entity.ZhaopinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhaopinfenleiView;


/**
 * 招聘分类
 * 
 * @author 
 * @email 
 * @date 2024-04-05 14:26:20
 */
public interface ZhaopinfenleiDao extends BaseMapper<ZhaopinfenleiEntity> {
	
	List<ZhaopinfenleiView> selectListView(@Param("ew") Wrapper<ZhaopinfenleiEntity> wrapper);

	List<ZhaopinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaopinfenleiEntity> wrapper);
	
	ZhaopinfenleiView selectView(@Param("ew") Wrapper<ZhaopinfenleiEntity> wrapper);
	

}
