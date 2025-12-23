package com.entity.vo;

import com.entity.KemuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 科目信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
public class KemuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 开课学期
	 */
	
	private String kaikexueqi;
		
	/**
	 * 科目简介
	 */
	
	private String kemujianjie;
		
	/**
	 * 开课时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaikeshijian;
		
	/**
	 * 结课时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiekeshijian;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
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
	 * 设置：科目简介
	 */
	 
	public void setKemujianjie(String kemujianjie) {
		this.kemujianjie = kemujianjie;
	}
	
	/**
	 * 获取：科目简介
	 */
	public String getKemujianjie() {
		return kemujianjie;
	}
				
	
	/**
	 * 设置：开课时间
	 */
	 
	public void setKaikeshijian(Date kaikeshijian) {
		this.kaikeshijian = kaikeshijian;
	}
	
	/**
	 * 获取：开课时间
	 */
	public Date getKaikeshijian() {
		return kaikeshijian;
	}
				
	
	/**
	 * 设置：结课时间
	 */
	 
	public void setJiekeshijian(Date jiekeshijian) {
		this.jiekeshijian = jiekeshijian;
	}
	
	/**
	 * 获取：结课时间
	 */
	public Date getJiekeshijian() {
		return jiekeshijian;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
			
}
