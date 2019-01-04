package com.moqiao.MCT.message;

import java.math.BigDecimal;
import java.util.Date;

public class CoolingRateMessage {
    private Date date;
    private BigDecimal C;
    private BigDecimal PC;
    private BigDecimal TR;
    private String CTSTATUS;
    private String STATUS;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getC() {
        return C;
    }

    public void setC(BigDecimal c) {
        C = c;
    }

    public BigDecimal getPC() {
        return PC;
    }

    public void setPC(BigDecimal PC) {
        this.PC = PC;
    }

    public BigDecimal getTR() {
        return TR;
    }

    public void setTR(BigDecimal TR) {
        this.TR = TR;
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
