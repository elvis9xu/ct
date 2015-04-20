package com.xjd.ct.dal.dos;

public class ObjectResourceModelKey extends BaseDo {
    private String resId;

    private Byte objectType;

    private Long objectRefId;

    private Byte forClass;

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public Byte getObjectType() {
        return objectType;
    }

    public void setObjectType(Byte objectType) {
        this.objectType = objectType;
    }

    public Long getObjectRefId() {
        return objectRefId;
    }

    public void setObjectRefId(Long objectRefId) {
        this.objectRefId = objectRefId;
    }

    public Byte getForClass() {
        return forClass;
    }

    public void setForClass(Byte forClass) {
        this.forClass = forClass;
    }
}