package com.itk.cms.model;

import java.io.Serializable;
import java.util.Date;

public class Skupos implements Serializable {
    private Long id;

    /**
    * 首页顺序表id
    */
    private Integer pageSortId;

    /**
    * 名称
    */
    private String name;

    /**
    * 图片上传
    */
    private String src;

    /**
    * 位置
    */
    private Long position;

    /**
    * 商品id
    */
    private Long productId;

    /**
    * 跳转链接
    */
    private String action;

    /**
    * 优先级
    */
    private Long priority;

    /**
    * 删除状态 0:正常 1:删除
    */
    private Integer isDel;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 最后更新时间
    */
    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPageSortId() {
        return pageSortId;
    }

    public void setPageSortId(Integer pageSortId) {
        this.pageSortId = pageSortId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}