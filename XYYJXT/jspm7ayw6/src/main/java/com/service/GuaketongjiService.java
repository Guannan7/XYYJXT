package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuaketongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuaketongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuaketongjiView;


/**
 * 挂科统计
 *
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
public interface GuaketongjiService extends IService<GuaketongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuaketongjiVO> selectListVO(Wrapper<GuaketongjiEntity> wrapper);
   	
   	GuaketongjiVO selectVO(@Param("ew") Wrapper<GuaketongjiEntity> wrapper);
   	
   	List<GuaketongjiView> selectListView(Wrapper<GuaketongjiEntity> wrapper);
   	
   	GuaketongjiView selectView(@Param("ew") Wrapper<GuaketongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuaketongjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<GuaketongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<GuaketongjiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<GuaketongjiEntity> wrapper);



}

