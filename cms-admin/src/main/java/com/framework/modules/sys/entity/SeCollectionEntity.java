package com.framework.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author MIT
 * @email framework@gmail.com
 * @date 2018-09-26 10:16:24
 */
@TableName("se_collection")
public class SeCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String id;
	/**
	 * 站点名称
	 */
	private String siteName;
	/**
	 * URL
	 */
	private String url;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 登录密码
	 */
	private String password;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 排序
	 */
	private Integer seq;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 用户主键
	 */
	private Long userId;
	/**
	 * LOGO
	 */
	private String logo;
	
	/**
	 * 站点类型
	 */
	private String siteType;
	
	/**
	 * 站点来源
	 */
	private String origin;

	/**
	 * 设置：主键
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：站点名称
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	/**
	 * 获取：站点名称
	 */
	public String getSiteName() {
		return siteName;
	}
	/**
	 * 设置：URL
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：URL
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：用户名
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：登录密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：登录密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：排序
	 */
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	/**
	 * 获取：排序
	 */
	public Integer getSeq() {
		return seq;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：用户主键
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户主键
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：LOGO
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}
	/**
	 * 获取：LOGO
	 */
	public String getLogo() {
		return logo;
	}
	public String getSiteType() {
		return siteType;
	}
	public void setSiteType(String siteType) {
		this.siteType = siteType;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
}
