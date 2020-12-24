package com.ssm.bean;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * APP用户账户表
 * 
 * @author wcyong
 * 
 * @date 2020-12-23
 */
@Component
public class TbAccount {
    private Integer id;

    /**
     * 经销商id,也就是sys_user表的id
     */
    private Long dealerId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 机器序列码
     */
    private String serialNo;

    /**
     * 机型ID
     */
    private Integer phoneModelId;

    /**
     * 机型名称
     */
    private String phoneModelName;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 状态 0禁用 1启用 
     */
    private Integer status;

    /**
     * 注册时间
     */
    private Date createTime;

    private Date updateTime;

    /**
     * 删除标记
     */
    private Integer deleteFlag;

    /**
     * 剩余次数
     */
    private Integer remainTimes;

    /**
     * 已用次数
     */
    private Integer useTimes;

    /**
     * 1 有限次数  2 不限次数
     */
    private Integer type;

    /**
     * 备注名称
     */
    private String remarks;

    /**
     * 用户类型 1 普通用户 2 机器用户
     */
    private Integer userType;

    /**
     * 机器版本A与B
     */
    private String deviceType;

    /**
     * 批次号
     */
    private Integer batchNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    public Integer getPhoneModelId() {
        return phoneModelId;
    }

    public void setPhoneModelId(Integer phoneModelId) {
        this.phoneModelId = phoneModelId;
    }

    public String getPhoneModelName() {
        return phoneModelName;
    }

    public void setPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName == null ? null : phoneModelName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getRemainTimes() {
        return remainTimes;
    }

    public void setRemainTimes(Integer remainTimes) {
        this.remainTimes = remainTimes;
    }

    public Integer getUseTimes() {
        return useTimes;
    }

    public void setUseTimes(Integer useTimes) {
        this.useTimes = useTimes;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public Integer getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(Integer batchNum) {
        this.batchNum = batchNum;
    }

    @Override
    public String toString() {
        return "TbAccount{" +
                "id=" + id +
                ", dealerId=" + dealerId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", serialNo='" + serialNo + '\'' +
                ", phoneModelId=" + phoneModelId +
                ", phoneModelName='" + phoneModelName + '\'' +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", deleteFlag=" + deleteFlag +
                ", remainTimes=" + remainTimes +
                ", useTimes=" + useTimes +
                ", type=" + type +
                ", remarks='" + remarks + '\'' +
                ", userType=" + userType +
                ", deviceType='" + deviceType + '\'' +
                ", batchNum=" + batchNum +
                '}';
    }
}