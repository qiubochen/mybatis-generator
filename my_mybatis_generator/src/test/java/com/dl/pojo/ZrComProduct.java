package com.dl.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`zr_com_product`")
public class ZrComProduct implements Serializable {
    private Long productId;

    private String productCode;

    private String descripetion;

    private String name;

    private Long combinationId;

    private String risk;

    private String investmentStrategy;

    private String lables;

    private String state;

    private String spareText1;

    private String spareText2;

    private Long createTime;

    private Long changeTime;

    private Long endTime;

    private static final long serialVersionUID = 1L;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDescripetion() {
        return descripetion;
    }

    public void setDescripetion(String descripetion) {
        this.descripetion = descripetion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCombinationId() {
        return combinationId;
    }

    public void setCombinationId(Long combinationId) {
        this.combinationId = combinationId;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getInvestmentStrategy() {
        return investmentStrategy;
    }

    public void setInvestmentStrategy(String investmentStrategy) {
        this.investmentStrategy = investmentStrategy;
    }

    public String getLables() {
        return lables;
    }

    public void setLables(String lables) {
        this.lables = lables;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSpareText1() {
        return spareText1;
    }

    public void setSpareText1(String spareText1) {
        this.spareText1 = spareText1;
    }

    public String getSpareText2() {
        return spareText2;
    }

    public void setSpareText2(String spareText2) {
        this.spareText2 = spareText2;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Long changeTime) {
        this.changeTime = changeTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}