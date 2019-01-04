package com.moqiao.MCT.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class QqcMctwarningnew {
    private BigDecimal id;

    private String warntyep;

    private String mctguid;

    private BigDecimal mctstorey;

    private Date warndate;

    private String warncontent;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getWarntyep() {
        return warntyep;
    }

    public void setWarntyep(String warntyep) {
        this.warntyep = warntyep == null ? null : warntyep.trim();
    }

    public String getMctguid() {
        return mctguid;
    }

    public void setMctguid(String mctguid) {
        this.mctguid = mctguid == null ? null : mctguid.trim();
    }

    public BigDecimal getMctstorey() {
        return mctstorey;
    }

    public void setMctstorey(BigDecimal mctstorey) {
        this.mctstorey = mctstorey;
    }

    public Date getWarndate() {
        return warndate;
    }

    public void setWarndate(Date warndate) {
        this.warndate = warndate;
    }

    public String getWarncontent() {
        return warncontent;
    }

    public void setWarncontent(String warncontent) {
        this.warncontent = warncontent == null ? null : warncontent.trim();
    }
}