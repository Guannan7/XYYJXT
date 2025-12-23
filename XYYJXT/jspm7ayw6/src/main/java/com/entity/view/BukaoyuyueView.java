package com.entity.view;

import com.entity.BukaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 补考预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
@TableName("bukaoyuyue")
public class BukaoyuyueView  extends BukaoyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BukaoyuyueView(){
	}
 
 	public BukaoyuyueView(BukaoyuyueEntity bukaoyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, bukaoyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
