package com.hr.system.po;


public class Organizers {

  private long id;
  private long createUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp modifyTime;
  private long deleted;
  private String createUserName;
  private String infoName;
  private String infoContent;
  private long infoStatus;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(long createUserId) {
    this.createUserId = createUserId;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(java.sql.Timestamp modifyTime) {
    this.modifyTime = modifyTime;
  }


  public long getDeleted() {
    return deleted;
  }

  public void setDeleted(long deleted) {
    this.deleted = deleted;
  }


  public String getCreateUserName() {
    return createUserName;
  }

  public void setCreateUserName(String createUserName) {
    this.createUserName = createUserName;
  }


  public String getInfoName() {
    return infoName;
  }

  public void setInfoName(String infoName) {
    this.infoName = infoName;
  }


  public String getInfoContent() {
    return infoContent;
  }

  public void setInfoContent(String infoContent) {
    this.infoContent = infoContent;
  }


  public long getInfoStatus() {
    return infoStatus;
  }

  public void setInfoStatus(long infoStatus) {
    this.infoStatus = infoStatus;
  }

}
