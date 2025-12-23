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
 * 挂科统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-24 21:37:34
 */
@TableName("guaketongji")
public class GuaketongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuaketongjiEntity() {
		
	}
	
	public GuaketongjiEntity(T t) {
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
	 * 科目名称
	 */
					
	private String kemumingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tongjishijian;
	
	
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
	 * 设置：科目名称
	 */
	public void setKemumingcheng(String kemumingcheng) {
		this.kemumingcheng = kemumingcheng;
	}
	/**
	 * 获取：科目名称
	 */
	public String getKemumingcheng() {
		return kemumingcheng;
	}
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
