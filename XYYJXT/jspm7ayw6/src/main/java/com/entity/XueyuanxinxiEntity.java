package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学院信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
@TableName("xueyuanxinxi")
public class XueyuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueyuanxinxiEntity() {
		
	}
	
	public XueyuanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学院名称
	 */
					
	private String xueyuanmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学院名称
	 */
	public void setXueyuanmingcheng(String xueyuanmingcheng) {
		this.xueyuanmingcheng = xueyuanmingcheng;
	}
	/**
	 * 获取：学院名称
	 */
	public String getXueyuanmingcheng() {
		return xueyuanmingcheng;
	}
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
