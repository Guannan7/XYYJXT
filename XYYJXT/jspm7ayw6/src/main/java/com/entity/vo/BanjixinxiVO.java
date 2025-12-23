package com.entity.vo;

import com.entity.BanjixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 班级信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
public class BanjixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 班级类型
	 */
	
	private String banjileixing;
		
	/**
	 * 班级位置
	 */
	
	private String banjiweizhi;
		
	/**
	 * 班级人数
	 */
	
	private String banjirenshu;
		
	/**
	 * 班主任
	 */
	
	private String banzhuren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
				
	
	/**
	 * 设置：班级类型
	 */
	 
	public void setBanjileixing(String banjileixing) {
		this.banjileixing = banjileixing;
	}
	
	/**
	 * 获取：班级类型
	 */
	public String getBanjileixing() {
		return banjileixing;
	}
				
	
	/**
	 * 设置：班级位置
	 */
	 
	public void setBanjiweizhi(String banjiweizhi) {
		this.banjiweizhi = banjiweizhi;
	}
	
	/**
	 * 获取：班级位置
	 */
	public String getBanjiweizhi() {
		return banjiweizhi;
	}
				
	
	/**
	 * 设置：班级人数
	 */
	 
	public void setBanjirenshu(String banjirenshu) {
		this.banjirenshu = banjirenshu;
	}
	
	/**
	 * 获取：班级人数
	 */
	public String getBanjirenshu() {
		return banjirenshu;
	}
				
	
	/**
	 * 设置：班主任
	 */
	 
	public void setBanzhuren(String banzhuren) {
		this.banzhuren = banzhuren;
	}
	
	/**
	 * 获取：班主任
	 */
	public String getBanzhuren() {
		return banzhuren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
			
}
