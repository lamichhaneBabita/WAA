package mum.edu.domain;

import java.io.Serializable;

public class Calculator implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer add1 = 0;
    private Integer add2 = 0;
    private Integer mult1 = 0;
    private Integer mult2 = 0;
    private Integer sum = 0;
    private Integer product = 0;


    public Calculator(Integer add1, Integer add2, Integer mult1, Integer mult2, Integer sum, Integer product) {
        this.add1 = add1;
        this.add2 = add2;
        this.mult1 = mult1;
        this.mult2 = mult2;
        this.sum = sum;
        this.product = product;
    }

    public Calculator() {
    }

    public Integer getAdd1() {
        return this.add1;
    }

    public Integer getAdd2() {
        return this.add2;
    }

    public Integer getMult1() {
        return this.mult1;
    }

    public Integer getMult2() {
        return this.mult2;
    }

    public Integer getSum() {
        return this.sum;
    }

    public Integer getProduct() {
        return this.product;
    }

    public void setAdd1(Integer add1) {
        this.add1 = add1;
    }

    public void setAdd2(Integer add2) {
        this.add2 = add2;
    }

    public void setMult1(Integer mult1) {
        this.mult1 = mult1;
    }

    public void setMult2(Integer mult2) {
        this.mult2 = mult2;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }
}
