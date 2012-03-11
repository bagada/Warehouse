package com.poliformas.warehouse.integration.entity;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class AbstractModel implements Serializable{

    private String commonError_1;
    private String commonError_2;
    private String commonError_3;
    private String commonError_4;
    private String commonError_5;
    private String commonError_6;

    /**
     * @return the commonError_1
     */
    public String getCommonError_1() {
        return commonError_1;
    }

    /**
     * @param commonError_1 the commonError_1 to set
     */
    public void setCommonError_1(String commonError_1) {
        this.commonError_1 = commonError_1;
    }

    /**
     * @return the commonError_2
     */
    public String getCommonError_2() {
        return commonError_2;
    }

    /**
     * @param commonError_2 the commonError_2 to set
     */
    public void setCommonError_2(String commonError_2) {
        this.commonError_2 = commonError_2;
    }

    /**
     * @return the commonError_3
     */
    public String getCommonError_3() {
        return commonError_3;
    }

    /**
     * @param commonError_3 the commonError_3 to set
     */
    public void setCommonError_3(String commonError_3) {
        this.commonError_3 = commonError_3;
    }

    /**
     * @return the commonError_4
     */
    public String getCommonError_4() {
        return commonError_4;
    }

    /**
     * @param commonError_4 the commonError_4 to set
     */
    public void setCommonError_4(String commonError_4) {
        this.commonError_4 = commonError_4;
    }

    /**
     * @return the commonError_5
     */
    public String getCommonError_5() {
        return commonError_5;
    }

    /**
     * @param commonError_5 the commonError_5 to set
     */
    public void setCommonError_5(String commonError_5) {
        this.commonError_5 = commonError_5;
    }

    /**
     * @return the commonError_6
     */
    public String getCommonError_6() {
        return commonError_6;
    }

    /**
     * @param commonError_6 the commonError_6 to set
     */
    public void setCommonError_6(String commonError_6) {
        this.commonError_6 = commonError_6;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


}
