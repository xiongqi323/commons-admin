package com.github.commons.admin.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_system_job
 */
public class SystemJob implements Serializable {
    /**
     * 主键
     * database column t_system_job.id
     */
    private Long id;

    /**
     * 任务名称
     * database column t_system_job.job_name
     */
    private String jobName;

    /**
     * 任务类名
     * database column t_system_job.job_class_name
     */
    private String jobClassName;

    /**
     * 任务状态
     * database column t_system_job.job_status
     */
    private Byte jobStatus;

    /**
     * 任务cron表达式
     * database column t_system_job.cron
     */
    private String cron;

    /**
     * 上次执行时间
     * database column t_system_job.pre_fire_time
     */
    private Date preFireTime;

    /**
     * 下次执行时间
     * database column t_system_job.next_fire_time
     */
    private Date nextFireTime;

    /**
     * 任务开始时间
     * database column t_system_job.start_time
     */
    private Date startTime;

    /**
     * 任务结束时间
     * database column t_system_job.end_time
     */
    private Date endTime;

    /**
     * 创建时间
     * database column t_system_job.created
     */
    private Date created;

    /**
     * 修改时间
     * database column t_system_job.modified
     */
    private Date modified;

    private static final long serialVersionUID = 1L;

    /**
     * @return the value of t_system_job.id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the value for t_system_job.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the value of t_system_job.job_name
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @param jobName the value for t_system_job.job_name
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * @return the value of t_system_job.job_class_name
     */
    public String getJobClassName() {
        return jobClassName;
    }

    /**
     * @param jobClassName the value for t_system_job.job_class_name
     */
    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName == null ? null : jobClassName.trim();
    }

    /**
     * @return the value of t_system_job.job_status
     */
    public Byte getJobStatus() {
        return jobStatus;
    }

    /**
     * @param jobStatus the value for t_system_job.job_status
     */
    public void setJobStatus(Byte jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * @return the value of t_system_job.cron
     */
    public String getCron() {
        return cron;
    }

    /**
     * @param cron the value for t_system_job.cron
     */
    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }

    /**
     * @return the value of t_system_job.pre_fire_time
     */
    public Date getPreFireTime() {
        return preFireTime;
    }

    /**
     * @param preFireTime the value for t_system_job.pre_fire_time
     */
    public void setPreFireTime(Date preFireTime) {
        this.preFireTime = preFireTime;
    }

    /**
     * @return the value of t_system_job.next_fire_time
     */
    public Date getNextFireTime() {
        return nextFireTime;
    }

    /**
     * @param nextFireTime the value for t_system_job.next_fire_time
     */
    public void setNextFireTime(Date nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    /**
     * @return the value of t_system_job.start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the value for t_system_job.start_time
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the value of t_system_job.end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the value for t_system_job.end_time
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the value of t_system_job.created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created the value for t_system_job.created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return the value of t_system_job.modified
     */
    public Date getModified() {
        return modified;
    }

    /**
     * @param modified the value for t_system_job.modified
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }
}