package com.itbs.persistence.entity;

public class TBasicSku {
    private Integer id;

    private Integer skuId;

    private String skuCode;

    private String skuDesc;

    private Object skuDetail;

    private Integer spuId;

    private Object skuOther;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc == null ? null : skuDesc.trim();
    }

    public Object getSkuDetail() {
        return skuDetail;
    }

    public void setSkuDetail(Object skuDetail) {
        this.skuDetail = skuDetail;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public Object getSkuOther() {
        return skuOther;
    }

    public void setSkuOther(Object skuOther) {
        this.skuOther = skuOther;
    }
}