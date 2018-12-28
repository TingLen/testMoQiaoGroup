package com.moqiao.message;

import java.math.BigDecimal;
import java.util.Date;

public class ConcreteTempMessage {
    private Date DATETIME;
    private BigDecimal PMAX;
    private String CTSTATUS;
    private String STATUS;

    public Date getDATETIME() {
        return DATETIME;
    }

    public void setDATETIME(Date DATETIME) {
        this.DATETIME = DATETIME;
    }

    public BigDecimal getPMAX() {
        return PMAX;
    }

    public void setPMAX(BigDecimal PMAX) {
        this.PMAX = PMAX;
    }

    public String getCTSTATUS() {
        return CTSTATUS;
    }

    public void setCTSTATUS(String CTSTATUS) {
        this.CTSTATUS = CTSTATUS;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}
