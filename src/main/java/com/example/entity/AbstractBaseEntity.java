package com.example.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractBaseEntity
{
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  protected Long id;
  @Column(updatable=false)
  protected Timestamp createdAt = new Timestamp(System.currentTimeMillis());
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public void setCreatedAt(Timestamp createdAt)
  {
    this.createdAt = createdAt;
  }
  
  public Timestamp getCreatedAt()
  {
    return this.createdAt;
  }
  
  public String getCreatedDay()
  {
    if (this.createdAt == null) {
      return "";
    }
    return new Date(this.createdAt.getTime()).toString();
  }
  
  public String getCreatedTime()
  {
    if (this.createdAt == null) {
      return "";
    }
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    return format.format(new Date(this.createdAt.getTime()));
  }
  
  public String getCreatedAtStr()
  {
    if (this.createdAt == null) {
      return "";
    }
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    return format.format(new Date(this.createdAt.getTime()));
  }
  
  public String getCreatedStr()
  {
    if (this.createdAt == null) {
      return "";
    }
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    return format.format(new Date(this.createdAt.getTime()));
  }
}
