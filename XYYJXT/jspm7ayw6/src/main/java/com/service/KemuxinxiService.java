package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KemuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KemuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KemuxinxiView;


/**
 * 科目信息
 *
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
public interface KemuxinxiService extends IService<KemuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KemuxinxiVO> selectListVO(Wrapper<KemuxinxiEntity> wrapper);
   	
   	KemuxinxiVO selectVO(@Param("ew") Wrapper<KemuxinxiEntity> wrapper);
   	
   	List<KemuxinxiView> selectListView(Wrapper<KemuxinxiEntity> wrapper);
   	
   	KemuxinxiView selectView(@Param("ew") Wrapper<KemuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KemuxinxiEntity> wrapper);
   	

}

