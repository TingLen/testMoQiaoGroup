package com.moqiao.pojo;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
@Repository
public class QqcMct {
    private BigDecimal id;

    private Date datetime;

    private BigDecimal storey;

    private BigDecimal conTemp1;

    private BigDecimal conTemp2;

    private BigDecimal conTemp3;

    private BigDecimal conTemp4;

    private BigDecimal conTemp5;

    private BigDecimal conTemp6;

    private BigDecimal conTemp7;

    private BigDecimal waterinlet;

    private BigDecimal wateroutlet1;

    private BigDecimal wateroutlet2;

    private BigDecimal coldwaterTemp1;

    private BigDecimal coldwaterTemp2;

    private BigDecimal hotwaterTemp1;

    private BigDecimal hotwaterTemp2;

    private BigDecimal et;

    private BigDecimal flow;

    private String guid;

    private String castingstate;

    private String ctstatus;

    private BigDecimal jwsl;

    private String jwslb;

    private BigDecimal swws;

    private String swwsb;

    private BigDecimal cjwc;

    private String cjwcb;

    private BigDecimal lbwc;

    private String lbwcb;

    private BigDecimal ctmax;

    private String ctmaxb;

    private BigDecimal inttCtmax;

    private String inttCtmaxb;

    private String parts;

    private BigDecimal tempcc;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public BigDecimal getStorey() {
        return storey;
    }

    public void setStorey(BigDecimal storey) {
        this.storey = storey;
    }

    public BigDecimal getConTemp1() {
        return conTemp1;
    }

    public void setConTemp1(BigDecimal conTemp1) {
        this.conTemp1 = conTemp1;
    }

    public BigDecimal getConTemp2() {
        return conTemp2;
    }

    public void setConTemp2(BigDecimal conTemp2) {
        this.conTemp2 = conTemp2;
    }

    public BigDecimal getConTemp3() {
        return conTemp3;
    }

    public void setConTemp3(BigDecimal conTemp3) {
        this.conTemp3 = conTemp3;
    }

    public BigDecimal getConTemp4() {
        return conTemp4;
    }

    public void setConTemp4(BigDecimal conTemp4) {
        this.conTemp4 = conTemp4;
    }

    public BigDecimal getConTemp5() {
        return conTemp5;
    }

    public void setConTemp5(BigDecimal conTemp5) {
        this.conTemp5 = conTemp5;
    }

    public BigDecimal getConTemp6() {
        return conTemp6;
    }

    public void setConTemp6(BigDecimal conTemp6) {
        this.conTemp6 = conTemp6;
    }

    public BigDecimal getConTemp7() {
        return conTemp7;
    }

    public void setConTemp7(BigDecimal conTemp7) {
        this.conTemp7 = conTemp7;
    }

    public BigDecimal getWaterinlet() {
        return waterinlet;
    }

    public void setWaterinlet(BigDecimal waterinlet) {
        this.waterinlet = waterinlet;
    }

    public BigDecimal getWateroutlet1() {
        return wateroutlet1;
    }

    public void setWateroutlet1(BigDecimal wateroutlet1) {
        this.wateroutlet1 = wateroutlet1;
    }

    public BigDecimal getWateroutlet2() {
        return wateroutlet2;
    }

    public void setWateroutlet2(BigDecimal wateroutlet2) {
        this.wateroutlet2 = wateroutlet2;
    }

    public BigDecimal getColdwaterTemp1() {
        return coldwaterTemp1;
    }

    public void setColdwaterTemp1(BigDecimal coldwaterTemp1) {
        this.coldwaterTemp1 = coldwaterTemp1;
    }

    public BigDecimal getColdwaterTemp2() {
        return coldwaterTemp2;
    }

    public void setColdwaterTemp2(BigDecimal coldwaterTemp2) {
        this.coldwaterTemp2 = coldwaterTemp2;
    }

    public BigDecimal getHotwaterTemp1() {
        return hotwaterTemp1;
    }

    public void setHotwaterTemp1(BigDecimal hotwaterTemp1) {
        this.hotwaterTemp1 = hotwaterTemp1;
    }

    public BigDecimal getHotwaterTemp2() {
        return hotwaterTemp2;
    }

    public void setHotwaterTemp2(BigDecimal hotwaterTemp2) {
        this.hotwaterTemp2 = hotwaterTemp2;
    }

    public BigDecimal getEt() {
        return et;
    }

    public void setEt(BigDecimal et) {
        this.et = et;
    }

    public BigDecimal getFlow() {
        return flow;
    }

    public void setFlow(BigDecimal flow) {
        this.flow = flow;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getCastingstate() {
        return castingstate;
    }

    public void setCastingstate(String castingstate) {
        this.castingstate = castingstate == null ? null : castingstate.trim();
    }

    public String getCtstatus() {
        return ctstatus;
    }

    public void setCtstatus(String ctstatus) {
        this.ctstatus = ctstatus == null ? null : ctstatus.trim();
    }

    public BigDecimal getJwsl() {
        return jwsl;
    }

    public void setJwsl(BigDecimal jwsl) {
        this.jwsl = jwsl;
    }

    public String getJwslb() {
        return jwslb;
    }

    public void setJwslb(String jwslb) {
        this.jwslb = jwslb == null ? null : jwslb.trim();
    }

    public BigDecimal getSwws() {
        return swws;
    }

    public void setSwws(BigDecimal swws) {
        this.swws = swws;
    }

    public String getSwwsb() {
        return swwsb;
    }

    public void setSwwsb(String swwsb) {
        this.swwsb = swwsb == null ? null : swwsb.trim();
    }

    public BigDecimal getCjwc() {
        return cjwc;
    }

    public void setCjwc(BigDecimal cjwc) {
        this.cjwc = cjwc;
    }

    public String getCjwcb() {
        return cjwcb;
    }

    public void setCjwcb(String cjwcb) {
        this.cjwcb = cjwcb == null ? null : cjwcb.trim();
    }

    public BigDecimal getLbwc() {
        return lbwc;
    }

    public void setLbwc(BigDecimal lbwc) {
        this.lbwc = lbwc;
    }

    public String getLbwcb() {
        return lbwcb;
    }

    public void setLbwcb(String lbwcb) {
        this.lbwcb = lbwcb == null ? null : lbwcb.trim();
    }

    public BigDecimal getCtmax() {
        return ctmax;
    }

    public void setCtmax(BigDecimal ctmax) {
        this.ctmax = ctmax;
    }

    public String getCtmaxb() {
        return ctmaxb;
    }

    public void setCtmaxb(String ctmaxb) {
        this.ctmaxb = ctmaxb == null ? null : ctmaxb.trim();
    }

    public BigDecimal getInttCtmax() {
        return inttCtmax;
    }

    public void setInttCtmax(BigDecimal inttCtmax) {
        this.inttCtmax = inttCtmax;
    }

    public String getInttCtmaxb() {
        return inttCtmaxb;
    }

    public void setInttCtmaxb(String inttCtmaxb) {
        this.inttCtmaxb = inttCtmaxb == null ? null : inttCtmaxb.trim();
    }

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts == null ? null : parts.trim();
    }

    public BigDecimal getTempcc() {
        return tempcc;
    }

    public void setTempcc(BigDecimal tempcc) {
        this.tempcc = tempcc;
    }




}