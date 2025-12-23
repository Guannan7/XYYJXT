package com.dao;

import com.entity.BukaoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BukaoyuyueVO;
import com.entity.view.BukaoyuyueView;


/**
 * 补考预约
 * 
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
public interface BukaoyuyueDao extends BaseMapper<BukaoyuyueEntity> {
	
	List<BukaoyuyueVO> selectListVO(@Param("ew") Wrapper<BukaoyuyueEntity> wrapper);
	
	BukaoyuyueVO selectVO(@Param("ew") Wrapper<BukaoyuyueEntity> wrapper);
	
	List<BukaoyuyueView> selectListView(@Param("ew") Wrapper<BukaoyuyueEntity> wrapper);

	List<BukaoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<BukaoyuyueEntity> wrapper);
	
	BukaoyuyueView selectView(@Param("ew") Wrapper<BukaoyuyueEntity> wrapper);
	

}
