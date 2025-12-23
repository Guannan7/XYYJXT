package com.entity.model;

import com.entity.YujingxiaoxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 预警消息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
public class YujingxiaoxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 消息内容
	 */
	
	private String xiaoxineirong;
		
	/**
	 * 发送时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fasongshijian;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：消息内容
	 */
	 
	public void setXiaoxineirong(String xiaoxineirong) {
		this.xiaoxineirong = xiaoxineirong;
	}
	
	/**
	 * 获取：消息内容
	 */
	public String getXiaoxineirong() {
		return xiaoxineirong;
	}
				
	
	/**
	 * 设置：发送时间
	 */
	 
	public void setFasongshijian(Date fasongshijian) {
		this.fasongshijian = fasongshijian;
	}
	
	/**
	 * 获取：发送时间
	 */
	public Date getFasongshijian() {
		return fasongshijian;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
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
