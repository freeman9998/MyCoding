package com.itwill0.annotation.a;

import java.util.Date;

class User{

  private String name;
  private String password;
  @CreatedTime
  public Date createdTime;

  public User(String name, String password) {
    this.name = name;
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", createdTime=" + createdTime +
            '}';
  }
}