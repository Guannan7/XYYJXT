package com.dao;

import com.entity.KemuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KemuxinxiVO;
import com.entity.view.KemuxinxiView;


/**
 * 科目信息
 * 
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
public interface KemuxinxiDao extends BaseMapper<KemuxinxiEntity> {
	
	List<KemuxinxiVO> selectListVO(@Param("ew") Wrapper<KemuxinxiEntity> wrapper);
	
	KemuxinxiVO selectVO(@Param("ew") Wrapper<KemuxinxiEntity> wrapper);
	
	List<KemuxinxiView> selectListView(@Param("ew") Wrapper<KemuxinxiEntity> wrapper);

	List<KemuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KemuxinxiEntity> wrapper);
	
	KemuxinxiView selectView(@Param("ew") Wrapper<KemuxinxiEntity> wrapper);
	

}
