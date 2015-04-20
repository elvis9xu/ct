package com.xjd.ct.dal.dos;

import java.util.Date;

public class ReportModel extends BaseDo {
    private Long reportId;

    private Byte objectType;

    private Long reportRefId;

    private Byte reportReasonType;

    private String reportReasonDetail;

    private Date addTime;

    private Date updTime;

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public Byte getObjectType() {
        return objectType;
    }

    public void setObjectType(Byte objectType) {
        this.objectType = objectType;
    }

    public Long getReportRefId() {
        return reportRefId;
    }

    public void setReportRefId(Long reportRefId) {
        this.reportRefId = reportRefId;
    }

    public Byte getReportReasonType() {
        return reportReasonType;
    }

    public void setReportReasonType(Byte reportReasonType) {
        this.reportReasonType = reportReasonType;
    }

    public String getReportReasonDetail() {
        return reportReasonDetail;
    }

    public void setReportReasonDetail(String reportReasonDetail) {
        this.reportReasonDetail = reportReasonDetail;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }
}