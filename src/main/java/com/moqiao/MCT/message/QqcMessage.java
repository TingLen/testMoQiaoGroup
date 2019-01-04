package com.moqiao.MCT.message;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QqcMessage {
    private Date DATETIME ;
    private BigDecimal COLDWATER_TEMP1;
    private BigDecimal COLDWATER_TEMP2;
    private BigDecimal HOTWATER_TEMP1;

    public BigDecimal getCOLDWATER_TEMP2() {
        return COLDWATER_TEMP2;
    }

    public void setCOLDWATER_TEMP2(BigDecimal COLDWATER_TEMP2) {
        this.COLDWATER_TEMP2 = COLDWATER_TEMP2;
    }

    private BigDecimal ET;
    private List<BigDecimal> _temps1=new ArrayList<BigDecimal>();
    private List<BigDecimal> _temps2=new ArrayList<BigDecimal>();
    private List<BigDecimal> _temps3=new ArrayList<BigDecimal>();
    private List<BigDecimal> _temps4=new ArrayList<BigDecimal>();
    private List<BigDecimal> _temps5=new ArrayList<BigDecimal>();
    private List<BigDecimal> _temps6=new ArrayList<BigDecimal>();
    private List<BigDecimal> _temps7=new ArrayList<BigDecimal>();
    private List<BigDecimal> _temps8=new ArrayList<BigDecimal>();

    public Date getDATETIME() {
        return DATETIME;
    }

    public void setDATETIME(Date DATETIME) {
        this.DATETIME = DATETIME;
    }

    public BigDecimal getCOLDWATER_TEMP1() {
        return COLDWATER_TEMP1;
    }

    public void setCOLDWATER_TEMP1(BigDecimal COLDWATER_TEMP1) {
        this.COLDWATER_TEMP1 = COLDWATER_TEMP1;
    }

    public BigDecimal getHOTWATER_TEMP1() {
        return HOTWATER_TEMP1;
    }

    public void setHOTWATER_TEMP1(BigDecimal HOTWATER_TEMP1) {
        this.HOTWATER_TEMP1 = HOTWATER_TEMP1;
    }

    public BigDecimal getET() {
        return ET;
    }

    public void setET(BigDecimal ET) {
        this.ET = ET;
    }

    public List<BigDecimal> get_temps1() {
        return _temps1;
    }

    public void set_temps1(List<BigDecimal> _temps1) {
        this._temps1 = _temps1;
    }

    public List<BigDecimal> get_temps2() {
        return _temps2;
    }

    public void set_temps2(List<BigDecimal> _temps2) {
        this._temps2 = _temps2;
    }

    public List<BigDecimal> get_temps3() {
        return _temps3;
    }

    public void set_temps3(List<BigDecimal> _temps3) {
        this._temps3 = _temps3;
    }

    public List<BigDecimal> get_temps4() {
        return _temps4;
    }

    public void set_temps4(List<BigDecimal> _temps4) {
        this._temps4 = _temps4;
    }

    public List<BigDecimal> get_temps5() {
        return _temps5;
    }

    public void set_temps5(List<BigDecimal> _temps5) {
        this._temps5 = _temps5;
    }

    public List<BigDecimal> get_temps6() {
        return _temps6;
    }

    public void set_temps6(List<BigDecimal> _temps6) {
        this._temps6 = _temps6;
    }

    public List<BigDecimal> get_temps7() {
        return _temps7;
    }

    public void set_temps7(List<BigDecimal> _temps7) {
        this._temps7 = _temps7;
    }

    public List<BigDecimal> get_temps8() {
        return _temps8;
    }

    public void set_temps8(List<BigDecimal> _temps8) {
        this._temps8 = _temps8;
    }

    public List<BigDecimal> get_temps9() {
        return _temps9;
    }

    public void set_temps9(List<BigDecimal> _temps9) {
        this._temps9 = _temps9;
    }

    public List<BigDecimal> get_temps10() {
        return _temps10;
    }

    public void set_temps10(List<BigDecimal> _temps10) {
        this._temps10 = _temps10;
    }

    private List<BigDecimal> _temps9=new ArrayList<BigDecimal>();
    private List<BigDecimal> _temps10=new ArrayList<BigDecimal>();


}
