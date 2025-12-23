package com.dao;

import com.entity.GuaketongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuaketongjiVO;
import com.entity.view.GuaketongjiView;


/**
 * 挂科统计
 * 
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
public interface GuaketongjiDao extends BaseMapper<GuaketongjiEntity> {
	
	List<GuaketongjiVO> selectListVO(@Param("ew") Wrapper<GuaketongjiEntity> wrapper);
	
	GuaketongjiVO selectVO(@Param("ew") Wrapper<GuaketongjiEntity> wrapper);
	
	List<GuaketongjiView> selectListView(@Param("ew") Wrapper<GuaketongjiEntity> wrapper);

	List<GuaketongjiView> selectListView(Pagination page,@Param("ew") Wrapper<GuaketongjiEntity> wrapper);
	
	GuaketongjiView selectView(@Param("ew") Wrapper<GuaketongjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GuaketongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GuaketongjiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GuaketongjiEntity> wrapper);



}
