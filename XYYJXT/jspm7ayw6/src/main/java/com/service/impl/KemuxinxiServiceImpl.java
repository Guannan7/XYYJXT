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


import com.dao.KemuxinxiDao;
import com.entity.KemuxinxiEntity;
import com.service.KemuxinxiService;
import com.entity.vo.KemuxinxiVO;
import com.entity.view.KemuxinxiView;

@Service("kemuxinxiService")
public class KemuxinxiServiceImpl extends ServiceImpl<KemuxinxiDao, KemuxinxiEntity> implements KemuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KemuxinxiEntity> page = this.selectPage(
                new Query<KemuxinxiEntity>(params).getPage(),
                new EntityWrapper<KemuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KemuxinxiEntity> wrapper) {
		  Page<KemuxinxiView> page =new Query<KemuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KemuxinxiVO> selectListVO(Wrapper<KemuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KemuxinxiVO selectVO(Wrapper<KemuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KemuxinxiView> selectListView(Wrapper<KemuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KemuxinxiView selectView(Wrapper<KemuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
