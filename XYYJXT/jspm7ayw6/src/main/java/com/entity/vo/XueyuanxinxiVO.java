package com.entity.vo;

import com.entity.XueyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学院信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
public class XueyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学院类型
	 */
	
	private String xueyuanleixing;
		
	/**
	 * 学院地址
	 */
	
	private String xueyuandizhi;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 学院电话
	 */
	
	private String xueyuandianhua;
		
	/**
	 * 学院简介
	 */
	
	private String xueyuanjianjie;
				
	
	/**
	 * 设置：学院类型
	 */
	 
	public void setXueyuanleixing(String xueyuanleixing) {
		this.xueyuanleixing = xueyuanleixing;
	}
	
	/**
	 * 获取：学院类型
	 */
	public String getXueyuanleixing() {
		return xueyuanleixing;
	}
				
	
	/**
	 * 设置：学院地址
	 */
	 
	public void setXueyuandizhi(String xueyuandizhi) {
		this.xueyuandizhi = xueyuandizhi;
	}
	
	/**
	 * 获取：学院地址
	 */
	public String getXueyuandizhi() {
		return xueyuandizhi;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：学院电话
	 */
	 
	public void setXueyuandianhua(String xueyuandianhua) {
		this.xueyuandianhua = xueyuandianhua;
	}
	
	/**
	 * 获取：学院电话
	 */
	public String getXueyuandianhua() {
		return xueyuandianhua;
	}
				
	
	/**
	 * 设置：学院简介
	 */
	 
	public void setXueyuanjianjie(String xueyuanjianjie) {
		this.xueyuanjianjie = xueyuanjianjie;
	}
	
	/**
	 * 获取：学院简介
	 */
	public String getXueyuanjianjie() {
		return xueyuanjianjie;
	}
			
}
