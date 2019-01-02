package com.moqiao.message;

import java.math.BigDecimal;
import java.util.Date;

public class WaterTempMessage {
    private Date date;
    private BigDecimal INPUT;
    private BigDecimal OUTPUT1;
    private BigDecimal OUTPUT2;
    private BigDecimal IOMAX;
    private String CTSTATUS;
    private String STATUS;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getINPUT() {
        return INPUT;
    }

    public void setINPUT(BigDecimal INPUT) {
        this.INPUT = INPUT;
    }

    public BigDecimal getOUTPUT1() {
        return OUTPUT1;
    }

    public void setOUTPUT1(BigDecimal OUTPUT1) {
        this.OUTPUT1 = OUTPUT1;
    }

    public BigDecimal getOUTPUT2() {
        return OUTPUT2;
    }

    public void setOUTPUT2(BigDecimal OUTPUT2) {
        this.OUTPUT2 = OUTPUT2;
    }

    public BigDecimal getIOMAX() {
        return IOMAX;
    }

    public void setIOMAX(BigDecimal IOMAX) {
        this.IOMAX = IOMAX;
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
