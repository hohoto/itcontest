package com.itbs.entity;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class fbrecord {
    // 主键id
    private Integer id;

    // 发布人
    private String username;

    // 发布内容
    private String fbinformation;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFbinformation() {
        return fbinformation;
    }

    public void setFbinformation(String fbinformation) {
        this.fbinformation = fbinformation;
    }
}