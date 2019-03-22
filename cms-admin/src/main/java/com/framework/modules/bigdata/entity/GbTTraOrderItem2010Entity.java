package com.framework.modules.bigdata.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 订单明细表
 * 
 * @author MIT
 * @email framework@gmail.com
 * @date 2019-03-08 17:11:42
 */
@TableName("gb_t_tra_order_item_2010")
public class GbTTraOrderItem2010Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long did;
	/**
	 * 
	 */
	private String accId;
	/**
	 * 经营企业确认或拒绝时间 退货时 退货人信息
	 */
	private Date acceptDate;
	/**
	 * 采购医院代码
	 */
	private BigDecimal buyerOrgCode;
	/**
	 * 
	 */
	private String commType;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 发货数量
	 */
	private BigDecimal deliveryQty;
	/**
	 * 药品编码
	 */
	private BigDecimal drugCode;
	/**
	 * 
	 */
	private String drugMode;
	/**
	 * 
	 */
	private String drugName;
	/**
	 * 
	 */
	private String drugSpec;
	/**
	 * 
	 */
	private String factoryName;
	/**
	 * 
	 */
	private String factoryOrgCode;
	/**
	 * 
	 */
	private String miniPack;
	/**
	 * 
	 */
	private String miniUsed;
	/**
	 * 
	 */
	private String oosFlag;
	/**
	 * 缺货修改日期
	 */
	private Date oosModifyDate;
	/**
	 * 缺货修改用户代码
	 */
	private Long oosModifyUserid;
	/**
	 * 记录唯一号
	 */
	private Long orderId;
	/**
	 * 
	 */
	private String orderState;
	/**
	 * 
	 */
	private String packMaterials;
	/**
	 * 产品编码
	 */
	private BigDecimal productId;
	/**
	 * 
	 */
	private String productName;
	/**
	 * 
	 */
	private String productSpec;
	/**
	 * 采购单唯一号
	 */
	private Long purchaseId;
	/**
	 * 医疗机构收货确认时间 医院撤销时间
	 */
	private Date receiveDate;
	/**
	 * 到货量
	 */
	private BigDecimal receiveQty;
	/**
	 * 订单数量
	 */
	private BigDecimal requestQty;
	/**
	 * 
	 */
	private String salerOrgCode;
	/**
	 * 经营企业发货时间
	 */
	private Date sendDate;
	/**
	 * 
	 */
	private String senderOrgCode;
	/**
	 * 单位转换比
	 */
	private BigDecimal standSpecRate;
	/**
	 * 挂网价格
	 */
	private BigDecimal tenderUnitPrice;
	/**
	 * 所属招标期次
	 */
	private String tenderYear;
	/**
	 * 单价
	 */
	private BigDecimal unitPrice;
	/**
	 * 
	 */
	private String type;

	/**
	 * 设置：
	 */
	public void setDid(Long did) {
		this.did = did;
	}
	/**
	 * 获取：
	 */
	public Long getDid() {
		return did;
	}
	/**
	 * 设置：
	 */
	public void setAccId(String accId) {
		this.accId = accId;
	}
	/**
	 * 获取：
	 */
	public String getAccId() {
		return accId;
	}
	/**
	 * 设置：经营企业确认或拒绝时间 退货时 退货人信息
	 */
	public void setAcceptDate(Date acceptDate) {
		this.acceptDate = acceptDate;
	}
	/**
	 * 获取：经营企业确认或拒绝时间 退货时 退货人信息
	 */
	public Date getAcceptDate() {
		return acceptDate;
	}
	/**
	 * 设置：采购医院代码
	 */
	public void setBuyerOrgCode(BigDecimal buyerOrgCode) {
		this.buyerOrgCode = buyerOrgCode;
	}
	/**
	 * 获取：采购医院代码
	 */
	public BigDecimal getBuyerOrgCode() {
		return buyerOrgCode;
	}
	/**
	 * 设置：
	 */
	public void setCommType(String commType) {
		this.commType = commType;
	}
	/**
	 * 获取：
	 */
	public String getCommType() {
		return commType;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * 设置：发货数量
	 */
	public void setDeliveryQty(BigDecimal deliveryQty) {
		this.deliveryQty = deliveryQty;
	}
	/**
	 * 获取：发货数量
	 */
	public BigDecimal getDeliveryQty() {
		return deliveryQty;
	}
	/**
	 * 设置：药品编码
	 */
	public void setDrugCode(BigDecimal drugCode) {
		this.drugCode = drugCode;
	}
	/**
	 * 获取：药品编码
	 */
	public BigDecimal getDrugCode() {
		return drugCode;
	}
	/**
	 * 设置：
	 */
	public void setDrugMode(String drugMode) {
		this.drugMode = drugMode;
	}
	/**
	 * 获取：
	 */
	public String getDrugMode() {
		return drugMode;
	}
	/**
	 * 设置：
	 */
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	/**
	 * 获取：
	 */
	public String getDrugName() {
		return drugName;
	}
	/**
	 * 设置：
	 */
	public void setDrugSpec(String drugSpec) {
		this.drugSpec = drugSpec;
	}
	/**
	 * 获取：
	 */
	public String getDrugSpec() {
		return drugSpec;
	}
	/**
	 * 设置：
	 */
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	/**
	 * 获取：
	 */
	public String getFactoryName() {
		return factoryName;
	}
	/**
	 * 设置：
	 */
	public void setFactoryOrgCode(String factoryOrgCode) {
		this.factoryOrgCode = factoryOrgCode;
	}
	/**
	 * 获取：
	 */
	public String getFactoryOrgCode() {
		return factoryOrgCode;
	}
	/**
	 * 设置：
	 */
	public void setMiniPack(String miniPack) {
		this.miniPack = miniPack;
	}
	/**
	 * 获取：
	 */
	public String getMiniPack() {
		return miniPack;
	}
	/**
	 * 设置：
	 */
	public void setMiniUsed(String miniUsed) {
		this.miniUsed = miniUsed;
	}
	/**
	 * 获取：
	 */
	public String getMiniUsed() {
		return miniUsed;
	}
	/**
	 * 设置：
	 */
	public void setOosFlag(String oosFlag) {
		this.oosFlag = oosFlag;
	}
	/**
	 * 获取：
	 */
	public String getOosFlag() {
		return oosFlag;
	}
	/**
	 * 设置：缺货修改日期
	 */
	public void setOosModifyDate(Date oosModifyDate) {
		this.oosModifyDate = oosModifyDate;
	}
	/**
	 * 获取：缺货修改日期
	 */
	public Date getOosModifyDate() {
		return oosModifyDate;
	}
	/**
	 * 设置：缺货修改用户代码
	 */
	public void setOosModifyUserid(Long oosModifyUserid) {
		this.oosModifyUserid = oosModifyUserid;
	}
	/**
	 * 获取：缺货修改用户代码
	 */
	public Long getOosModifyUserid() {
		return oosModifyUserid;
	}
	/**
	 * 设置：记录唯一号
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：记录唯一号
	 */
	public Long getOrderId() {
		return orderId;
	}
	/**
	 * 设置：
	 */
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	/**
	 * 获取：
	 */
	public String getOrderState() {
		return orderState;
	}
	/**
	 * 设置：
	 */
	public void setPackMaterials(String packMaterials) {
		this.packMaterials = packMaterials;
	}
	/**
	 * 获取：
	 */
	public String getPackMaterials() {
		return packMaterials;
	}
	/**
	 * 设置：产品编码
	 */
	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}
	/**
	 * 获取：产品编码
	 */
	public BigDecimal getProductId() {
		return productId;
	}
	/**
	 * 设置：
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * 获取：
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * 设置：
	 */
	public void setProductSpec(String productSpec) {
		this.productSpec = productSpec;
	}
	/**
	 * 获取：
	 */
	public String getProductSpec() {
		return productSpec;
	}
	/**
	 * 设置：采购单唯一号
	 */
	public void setPurchaseId(Long purchaseId) {
		this.purchaseId = purchaseId;
	}
	/**
	 * 获取：采购单唯一号
	 */
	public Long getPurchaseId() {
		return purchaseId;
	}
	/**
	 * 设置：医疗机构收货确认时间 医院撤销时间
	 */
	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}
	/**
	 * 获取：医疗机构收货确认时间 医院撤销时间
	 */
	public Date getReceiveDate() {
		return receiveDate;
	}
	/**
	 * 设置：到货量
	 */
	public void setReceiveQty(BigDecimal receiveQty) {
		this.receiveQty = receiveQty;
	}
	/**
	 * 获取：到货量
	 */
	public BigDecimal getReceiveQty() {
		return receiveQty;
	}
	/**
	 * 设置：订单数量
	 */
	public void setRequestQty(BigDecimal requestQty) {
		this.requestQty = requestQty;
	}
	/**
	 * 获取：订单数量
	 */
	public BigDecimal getRequestQty() {
		return requestQty;
	}
	/**
	 * 设置：
	 */
	public void setSalerOrgCode(String salerOrgCode) {
		this.salerOrgCode = salerOrgCode;
	}
	/**
	 * 获取：
	 */
	public String getSalerOrgCode() {
		return salerOrgCode;
	}
	/**
	 * 设置：经营企业发货时间
	 */
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	/**
	 * 获取：经营企业发货时间
	 */
	public Date getSendDate() {
		return sendDate;
	}
	/**
	 * 设置：
	 */
	public void setSenderOrgCode(String senderOrgCode) {
		this.senderOrgCode = senderOrgCode;
	}
	/**
	 * 获取：
	 */
	public String getSenderOrgCode() {
		return senderOrgCode;
	}
	/**
	 * 设置：单位转换比
	 */
	public void setStandSpecRate(BigDecimal standSpecRate) {
		this.standSpecRate = standSpecRate;
	}
	/**
	 * 获取：单位转换比
	 */
	public BigDecimal getStandSpecRate() {
		return standSpecRate;
	}
	/**
	 * 设置：挂网价格
	 */
	public void setTenderUnitPrice(BigDecimal tenderUnitPrice) {
		this.tenderUnitPrice = tenderUnitPrice;
	}
	/**
	 * 获取：挂网价格
	 */
	public BigDecimal getTenderUnitPrice() {
		return tenderUnitPrice;
	}
	/**
	 * 设置：所属招标期次
	 */
	public void setTenderYear(String tenderYear) {
		this.tenderYear = tenderYear;
	}
	/**
	 * 获取：所属招标期次
	 */
	public String getTenderYear() {
		return tenderYear;
	}
	/**
	 * 设置：单价
	 */
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * 获取：单价
	 */
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	/**
	 * 设置：
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：
	 */
	public String getType() {
		return type;
	}
}
