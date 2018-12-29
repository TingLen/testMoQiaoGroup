package com.moqiao.message;

import java.math.BigDecimal;
import java.util.Date;

public class ItemDiffTempMessage {
    private Date date;
    private BigDecimal A;
    private BigDecimal B;
    private BigDecimal C;
    private BigDecimal D;
    private BigDecimal E;
    private BigDecimal F;
    private BigDecimal G;
    private BigDecimal PMAX;
    private String CTSTATUS;
    private String STATUS;

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

    public BigDecimal getB() {
        return B;
    }

    public void setB(BigDecimal b) {
        B = b;
    }

    public BigDecimal getC() {
        return C;
    }

    public void setC(BigDecimal c) {
        C = c;
    }

    public BigDecimal getD() {
        return D;
    }

    public void setD(BigDecimal d) {
        D = d;
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

    public BigDecimal getG() {
        return G;
    }

    public void setG(BigDecimal g) {
        G = g;
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
