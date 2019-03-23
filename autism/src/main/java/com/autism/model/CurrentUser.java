package com.autism.model;

public class CurrentUser {
  private String id;
  private String userName;
  
  public CurrentUser(String id,String userName){
    this.id = id;
    this.userName = userName;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

}
