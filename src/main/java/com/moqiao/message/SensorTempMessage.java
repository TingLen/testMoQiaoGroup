package com.moqiao.message;

import java.math.BigDecimal;
import java.util.Date;

/***
 * 传感器温度
 */
public class SensorTempMessage {
    private Date date;//日期
    private BigDecimal A;//A传感器
    private BigDecimal B;
    private BigDecimal C;
    private BigDecimal D;
    private BigDecimal E;
    private BigDecimal F;
    private BigDecimal G;
    private String CTSTATUS;//是否正常

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

    public String getCTSTATUS() {
        return CTSTATUS;
    }

    public void setCTSTATUS(String CTSTATUS) {
        this.CTSTATUS = CTSTATUS;
    }
}
