package com.entity.vo;

import com.entity.GuaketongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 挂科统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
public class GuaketongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 开课学期
	 */
	
	private String kaikexueqi;
		
	/**
	 * 挂科人数
	 */
	
	private Integer guakerenshu;
		
	/**
	 * 统计时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongjishijian;
				
	
	/**
	 * 设置：开课学期
	 */
	 
	public void setKaikexueqi(String kaikexueqi) {
		this.kaikexueqi = kaikexueqi;
	}
	
	/**
	 * 获取：开课学期
	 */
	public String getKaikexueqi() {
		return kaikexueqi;
	}
				
	
	/**
	 * 设置：挂科人数
	 */
	 
	public void setGuakerenshu(Integer guakerenshu) {
		this.guakerenshu = guakerenshu;
	}
	
	/**
	 * 获取：挂科人数
	 */
	public Integer getGuakerenshu() {
		return guakerenshu;
	}
				
	
	/**
	 * 设置：统计时间
	 */
	 
	public void setTongjishijian(Date tongjishijian) {
		this.tongjishijian = tongjishijian;
	}
	
	/**
	 * 获取：统计时间
	 */
	public Date getTongjishijian() {
		return tongjishijian;
	}
			
}
