package com.moqiao.MCT.message;

import java.math.BigDecimal;
import java.util.Date;

public class IODiffTempMessage {
    private Date date;
    private BigDecimal A;
    private BigDecimal E;
    private BigDecimal F;
    private BigDecimal PMAX;
    private String CTSTATUS;
    private String LBWCB;
    private BigDecimal TD;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getA() {
        return A;
    }

    public void setA(BigDecimal a) {
        A = a;
    }

    public BigDecimal getE() {
        return E;
    }

    public void setE(BigDecimal e) {
        E = e;
    }

    public BigDecimal getF() {
        return F;
    }

    public void setF(BigDecimal f) {
        F = f;
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

    public String getLBWCB() {
        return LBWCB;
    }

    public void setLBWCB(String LBWCB) {
        this.LBWCB = LBWCB;
    }

    public BigDecimal getTD() {
        return TD;
    }

    public void setTD(BigDecimal TD) {
        this.TD = TD;
    }
}
