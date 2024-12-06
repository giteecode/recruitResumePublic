package com.cl.dao;

import com.cl.entity.GangweishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GangweishenqingView;


/**
 * 岗位申请
 * 
 * @author 
 * @email 
 * @date 2024-04-05 14:26:20
 */
public interface GangweishenqingDao extends BaseMapper<GangweishenqingEntity> {
	
	List<GangweishenqingView> selectListView(@Param("ew") Wrapper<GangweishenqingEntity> wrapper);

	List<GangweishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<GangweishenqingEntity> wrapper);
	
	GangweishenqingView selectView(@Param("ew") Wrapper<GangweishenqingEntity> wrapper);
	

}
