package com.zhang.dianping.model;

import java.math.BigDecimal;
import java.util.Date;

public class ShopModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.id
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.created_at
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.updated_at
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.name
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.remark_score
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private BigDecimal remarkScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.price_per_man
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private Integer pricePerMan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.latitude
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private BigDecimal latitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.longitude
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private BigDecimal longitude;

    private Integer distance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.category_id
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private Integer categoryId;

    private CategoryModel categoryModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.tags
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private String tags;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.start_time
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private String startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.end_time
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private String endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.address
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.seller_id
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private Integer sellerId;

    private SellerModel sellerModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.icon_url
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    private String iconUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.id
     *
     * @return the value of shop.id
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.id
     *
     * @param id the value for shop.id
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public CategoryModel getCategoryModel() {
        return categoryModel;
    }

    public void setCategoryModel(CategoryModel categoryModel) {
        this.categoryModel = categoryModel;
    }

    public SellerModel getSellerModel() {
        return sellerModel;
    }

    public void setSellerModel(SellerModel sellerModel) {
        this.sellerModel = sellerModel;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.created_at
     *
     * @return the value of shop.created_at
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.created_at
     *
     * @param createdAt the value for shop.created_at
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.updated_at
     *
     * @return the value of shop.updated_at
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.updated_at
     *
     * @param updatedAt the value for shop.updated_at
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.name
     *
     * @return the value of shop.name
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.name
     *
     * @param name the value for shop.name
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.remark_score
     *
     * @return the value of shop.remark_score
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public BigDecimal getRemarkScore() {
        return remarkScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.remark_score
     *
     * @param remarkScore the value for shop.remark_score
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setRemarkScore(BigDecimal remarkScore) {
        this.remarkScore = remarkScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.price_per_man
     *
     * @return the value of shop.price_per_man
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public Integer getPricePerMan() {
        return pricePerMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.price_per_man
     *
     * @param pricePerMan the value for shop.price_per_man
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setPricePerMan(Integer pricePerMan) {
        this.pricePerMan = pricePerMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.latitude
     *
     * @return the value of shop.latitude
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.latitude
     *
     * @param latitude the value for shop.latitude
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.longitude
     *
     * @return the value of shop.longitude
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.longitude
     *
     * @param longitude the value for shop.longitude
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.category_id
     *
     * @return the value of shop.category_id
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.category_id
     *
     * @param categoryId the value for shop.category_id
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.tags
     *
     * @return the value of shop.tags
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.tags
     *
     * @param tags the value for shop.tags
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.start_time
     *
     * @return the value of shop.start_time
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.start_time
     *
     * @param startTime the value for shop.start_time
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.end_time
     *
     * @return the value of shop.end_time
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.end_time
     *
     * @param endTime the value for shop.end_time
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.address
     *
     * @return the value of shop.address
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.address
     *
     * @param address the value for shop.address
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.seller_id
     *
     * @return the value of shop.seller_id
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.seller_id
     *
     * @param sellerId the value for shop.seller_id
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.icon_url
     *
     * @return the value of shop.icon_url
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.icon_url
     *
     * @param iconUrl the value for shop.icon_url
     *
     * @mbg.generated Sun Jul 21 18:38:57 CST 2019
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }
}