package cz.pedro.homework.restconsumer.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class LoanDTO implements Serializable {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("name")
    private String name;
    @JsonProperty("story")
    private String story;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("photos")
    private PhotoDTO[] photos;
    @JsonProperty("userId")
    private Long userId;
    @JsonProperty("nickName")
    private String nickName;
    @JsonProperty("termInMonths")
    private Integer termInMonths;
    @JsonProperty("interestRate")
    private Double interestRate;
    @JsonProperty("revenueRate")
    private Double revenueRate;
    @JsonProperty("annuity")
    private Long annuity;
    @JsonProperty("premium")
    private Long premium;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("topped")
    private Boolean topped;
    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("remainingInvestment")
    private Long remainingInvestment;
    @JsonProperty("investmentRate")
    private Double investmentRate;
    @JsonProperty("covered")
    private Boolean covered;
    @JsonProperty("reservedAmount")
    private Long reservedAmount;
    @JsonProperty("datePublished")
    private Date datePublished;
    @JsonProperty("published")
    private Boolean published;
    @JsonProperty("deadLine")
    private Date deadline;
    @JsonProperty("myOtherInvestments")
    private String myOtherInvestments;
    @JsonProperty("borrowerRelatedInvestmentInfo")
    private String borrowerRelatedInvestmentInfo;
    @JsonProperty("investmentsCount")
    private Long investmentsCount;
    @JsonProperty("questionsCount")
    private Long questionsCount;
    @JsonProperty("region")
    private String region;
    @JsonProperty("mainIncomeType")
    private String mainIncomeType;
    @JsonProperty("questionsAllowed")
    private Boolean questionsAllowed;
    @JsonProperty("activeLoansCount")
    private Long activeLoansCount;
    @JsonProperty("insuranceActive")
    private Boolean insuranceActive;
    @JsonProperty("insuranceHistory")
    private InsuranceHistoryDTO[] insuranceHistoryDTOS;
    @JsonProperty("fastcash")
    private Boolean fastCash;
    @JsonProperty("multicash")
    private Boolean multicash;
    @JsonProperty("annuityWithInsurance")
    private Long annuityWithInsurance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public PhotoDTO[] getPhotos() {
        return photos;
    }

    public void setPhotos(PhotoDTO[] photos) {
        this.photos = photos;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(Integer termInMonths) {
        this.termInMonths = termInMonths;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getRevenueRate() {
        return revenueRate;
    }

    public void setRevenueRate(Double revenueRate) {
        this.revenueRate = revenueRate;
    }

    public Long getAnnuity() {
        return annuity;
    }

    public void setAnnuity(Long annuity) {
        this.annuity = annuity;
    }

    public Long getPremium() {
        return premium;
    }

    public void setPremium(Long premium) {
        this.premium = premium;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Boolean getTopped() {
        return topped;
    }

    public void setTopped(Boolean topped) {
        this.topped = topped;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getRemainingInvestment() {
        return remainingInvestment;
    }

    public void setRemainingInvestment(Long remainingInvestment) {
        this.remainingInvestment = remainingInvestment;
    }

    public Double getInvestmentRate() {
        return investmentRate;
    }

    public void setInvestmentRate(Double investmentRate) {
        this.investmentRate = investmentRate;
    }

    public Boolean getCovered() {
        return covered;
    }

    public void setCovered(Boolean covered) {
        this.covered = covered;
    }

    public Long getReservedAmount() {
        return reservedAmount;
    }

    public void setReservedAmount(Long reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getMyOtherInvestments() {
        return myOtherInvestments;
    }

    public void setMyOtherInvestments(String myOtherInvestments) {
        this.myOtherInvestments = myOtherInvestments;
    }

    public String getBorrowerRelatedInvestmentInfo() {
        return borrowerRelatedInvestmentInfo;
    }

    public void setBorrowerRelatedInvestmentInfo(String borrowerRelatedInvestmentInfo) {
        this.borrowerRelatedInvestmentInfo = borrowerRelatedInvestmentInfo;
    }

    public Long getInvestmentsCount() {
        return investmentsCount;
    }

    public void setInvestmentsCount(Long investmentsCount) {
        this.investmentsCount = investmentsCount;
    }

    public Long getQuestionsCount() {
        return questionsCount;
    }

    public void setQuestionsCount(Long questionsCount) {
        this.questionsCount = questionsCount;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMainIncomeType() {
        return mainIncomeType;
    }

    public void setMainIncomeType(String mainIncomeType) {
        this.mainIncomeType = mainIncomeType;
    }

    public Boolean getQuestionsAllowed() {
        return questionsAllowed;
    }

    public void setQuestionsAllowed(Boolean questionsAllowed) {
        this.questionsAllowed = questionsAllowed;
    }

    public Long getActiveLoansCount() {
        return activeLoansCount;
    }

    public void setActiveLoansCount(Long activeLoansCount) {
        this.activeLoansCount = activeLoansCount;
    }

    public Boolean getInsuranceActive() {
        return insuranceActive;
    }

    public void setInsuranceActive(Boolean insuranceActive) {
        this.insuranceActive = insuranceActive;
    }

    public InsuranceHistoryDTO[] getInsuranceHistoryDTOS() {
        return insuranceHistoryDTOS;
    }

    public void setInsuranceHistoryDTOS(InsuranceHistoryDTO[] insuranceHistoryDTOS) {
        this.insuranceHistoryDTOS = insuranceHistoryDTOS;
    }

    public Boolean getFastCash() {
        return fastCash;
    }

    public void setFastCash(Boolean fastCash) {
        this.fastCash = fastCash;
    }

    public Boolean getMulticash() {
        return multicash;
    }

    public void setMulticash(Boolean multicash) {
        this.multicash = multicash;
    }

    public Long getAnnuityWithInsurance() {
        return annuityWithInsurance;
    }

    public void setAnnuityWithInsurance(Long annuityWithInsurance) {
        this.annuityWithInsurance = annuityWithInsurance;
    }

    @Override
    public String toString() {
        return "LoanDTO{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", story='" + story + '\'' +
                ", purpose='" + purpose + '\'' +
                ", photos=" + Arrays.toString(photos) +
                ", userId=" + userId +
                ", nickName='" + nickName + '\'' +
                ", termInMonths=" + termInMonths +
                ", interestRate=" + interestRate +
                ", revenueRate=" + revenueRate +
                ", annuity=" + annuity +
                ", premium=" + premium +
                ", rating='" + rating + '\'' +
                ", topped=" + topped +
                ", amount=" + amount +
                ", remainingInvestment=" + remainingInvestment +
                ", investmentRate=" + investmentRate +
                ", covered=" + covered +
                ", reservedAmount=" + reservedAmount +
                ", datePublished=" + datePublished +
                ", published=" + published +
                ", deadline=" + deadline +
                ", myOtherInvestments='" + myOtherInvestments + '\'' +
                ", borrowerRelatedInvestmentInfo='" + borrowerRelatedInvestmentInfo + '\'' +
                ", investmentsCount=" + investmentsCount +
                ", questionsCount=" + questionsCount +
                ", region='" + region + '\'' +
                ", mainIncomeType='" + mainIncomeType + '\'' +
                ", questionsAllowed=" + questionsAllowed +
                ", activeLoansCount=" + activeLoansCount +
                ", insuranceActive=" + insuranceActive +
                ", insuranceHistoryDTOS=" + Arrays.toString(insuranceHistoryDTOS) +
                ", fastCash=" + fastCash +
                ", multicash=" + multicash +
                ", annuityWithInsurance=" + annuityWithInsurance +
                '}';
    }
}
