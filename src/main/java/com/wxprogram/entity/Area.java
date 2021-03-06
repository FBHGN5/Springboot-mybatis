package com.wxprogram.entity;

import lombok.Data;

/**
 * Created By Cx On 2018/5/2 18:24
 */
@Data
public class Area {
    private Integer id;
    private String name;
    private Integer priority;
    private Long createTime;
    private Long lastEditTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Long lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }
}
