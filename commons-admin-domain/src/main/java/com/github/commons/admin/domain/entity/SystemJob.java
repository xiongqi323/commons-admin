package com.github.commons.admin.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_system_job
 */
public class SystemJob implements Serializable {
    /**
     * 主键
     * t_system_job.id
     */
    private Long id;

    /**
     * 任务名称
     * t_system_job.job_name
     */
    private String jobName;

    /**
     * 任务类名
     * t_system_job.job_class_name
     */
    private String jobClassName;

    /**
     * 任务状态
     * t_system_job.job_status
     */
    private Byte jobStatus;

    /**
     * 任务cron表达式
     * t_system_job.cron
     */
    private String cron;

    /**
     * 上次执行时间
     * t_system_job.pre_fire_time
     */
    private Date preFireTime;

    /**
     * 下次执行时间
     * t_system_job.next_fire_time
     */
    private Date nextFireTime;

    /**
     * 任务开始时间
     * t_system_job.start_time
     */
    private Date startTime;

    /**
     * 任务结束时间
     * t_system_job.end_time
     */
    private Date endTime;

    /**
     * 创建时间
     * t_system_job.created
     */
    private Date created;

    /**
     * 修改时间
     * t_system_job.modified
     */
    private Date modified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName == null ? null : jobClassName.trim();
    }

    public Byte getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Byte jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }

    public Date getPreFireTime() {
        return preFireTime;
    }

    public void setPreFireTime(Date preFireTime) {
        this.preFireTime = preFireTime;
    }

    public Date getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(Date nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}