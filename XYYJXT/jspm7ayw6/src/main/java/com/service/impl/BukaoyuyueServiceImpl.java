package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BukaoyuyueDao;
import com.entity.BukaoyuyueEntity;
import com.service.BukaoyuyueService;
import com.entity.vo.BukaoyuyueVO;
import com.entity.view.BukaoyuyueView;

@Service("bukaoyuyueService")
public class BukaoyuyueServiceImpl extends ServiceImpl<BukaoyuyueDao, BukaoyuyueEntity> implements BukaoyuyueService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BukaoyuyueEntity> page = this.selectPage(
                new Query<BukaoyuyueEntity>(params).getPage(),
                new EntityWrapper<BukaoyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BukaoyuyueEntity> wrapper) {
		  Page<BukaoyuyueView> page =new Query<BukaoyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BukaoyuyueVO> selectListVO(Wrapper<BukaoyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BukaoyuyueVO selectVO(Wrapper<BukaoyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BukaoyuyueView> selectListView(Wrapper<BukaoyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BukaoyuyueView selectView(Wrapper<BukaoyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
