package cz.pedro.homework.restconsumer.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class InsuranceHistoryDTO implements Serializable {

    @JsonProperty("policyPeriodFrom")
    private String policyPeriodFrom;
    @JsonProperty("policyPeriodTo")
    private String policyPeriodTo;

    public String getPolicyPeriodFrom() {
        return policyPeriodFrom;
    }

    public void setPolicyPeriodFrom(String policyPeriodFrom) {
        this.policyPeriodFrom = policyPeriodFrom;
    }

    public String getPolicyPeriodTo() {
        return policyPeriodTo;
    }

    public void setPolicyPeriodTo(String policyPeriodTo) {
        this.policyPeriodTo = policyPeriodTo;
    }

    @Override
    public String toString() {
        return "InsuranceHistoryDTO{" +
                "policyPeriodFrom='" + policyPeriodFrom + '\'' +
                ", policyPeriodTo='" + policyPeriodTo + '\'' +
                '}';
    }
}
