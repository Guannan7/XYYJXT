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


import com.dao.GuaketongjiDao;
import com.entity.GuaketongjiEntity;
import com.service.GuaketongjiService;
import com.entity.vo.GuaketongjiVO;
import com.entity.view.GuaketongjiView;

@Service("guaketongjiService")
public class GuaketongjiServiceImpl extends ServiceImpl<GuaketongjiDao, GuaketongjiEntity> implements GuaketongjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuaketongjiEntity> page = this.selectPage(
                new Query<GuaketongjiEntity>(params).getPage(),
                new EntityWrapper<GuaketongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuaketongjiEntity> wrapper) {
		  Page<GuaketongjiView> page =new Query<GuaketongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuaketongjiVO> selectListVO(Wrapper<GuaketongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuaketongjiVO selectVO(Wrapper<GuaketongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuaketongjiView> selectListView(Wrapper<GuaketongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuaketongjiView selectView(Wrapper<GuaketongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<GuaketongjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<GuaketongjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<GuaketongjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
