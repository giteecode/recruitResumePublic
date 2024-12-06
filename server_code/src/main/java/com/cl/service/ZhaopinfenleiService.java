package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZhaopinfenleiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhaopinfenleiView;


/**
 * 招聘分类
 *
 * @author 
 * @email 
 * @date 2024-04-05 14:26:20
 */
public interface ZhaopinfenleiService extends IService<ZhaopinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaopinfenleiView> selectListView(Wrapper<ZhaopinfenleiEntity> wrapper);
   	
   	ZhaopinfenleiView selectView(@Param("ew") Wrapper<ZhaopinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaopinfenleiEntity> wrapper);
   	

}

