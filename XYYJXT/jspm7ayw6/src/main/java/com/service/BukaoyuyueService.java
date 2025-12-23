package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BukaoyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BukaoyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BukaoyuyueView;


/**
 * 补考预约
 *
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
public interface BukaoyuyueService extends IService<BukaoyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BukaoyuyueVO> selectListVO(Wrapper<BukaoyuyueEntity> wrapper);
   	
   	BukaoyuyueVO selectVO(@Param("ew") Wrapper<BukaoyuyueEntity> wrapper);
   	
   	List<BukaoyuyueView> selectListView(Wrapper<BukaoyuyueEntity> wrapper);
   	
   	BukaoyuyueView selectView(@Param("ew") Wrapper<BukaoyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BukaoyuyueEntity> wrapper);
   	

}

