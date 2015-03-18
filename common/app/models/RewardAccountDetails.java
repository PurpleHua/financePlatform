package models;

import javax.persistence.Column;

/**
 * <p>Project: financeplatform</p>
 * <p>Title: RewardAccountDetails.java</p>
 * <p>Description: </p>
 * <p>Copyright (c) 2014 Sunlights.cc</p>
 * <p>All Rights Reserved.</p>
 *
 * @author <a href="mailto:jiaming.wang@sunlights.cc">wangJiaMing</a>
 */
public class RewardAccountDetails extends BaseEntity {
    @Column(name = "customer_Id", length = 30)
    private String customerId;
    @Column(name = "reward_sequence", length = 20)
    private String rewordSequence;
    @Column(name = "activity_type", length = 10)
    private String activityType;
    @Column(name = "reward_type", length = 10)
    private String rewardType;
    @Column(name = "reward_amount_balance")
    private Long rewardAmountBalance;
    @Column(name = "income_expend_balance")
    private Long incomeExpendBalance;
    @Column(name = "fundFlowType", length = 10)
    private String fundFlowType;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getRewordSequence() {
        return rewordSequence;
    }

    public void setRewordSequence(String rewordSequence) {
        this.rewordSequence = rewordSequence;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getRewardType() {
        return rewardType;
    }

    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }

    public Long getRewardAmountBalance() {
        return rewardAmountBalance;
    }

    public void setRewardAmountBalance(Long rewardAmountBalance) {
        this.rewardAmountBalance = rewardAmountBalance;
    }

    public Long getIncomeExpendBalance() {
        return incomeExpendBalance;
    }

    public void setIncomeExpendBalance(Long incomeExpendBalance) {
        this.incomeExpendBalance = incomeExpendBalance;
    }

    public String getFundFlowType() {
        return fundFlowType;
    }

    public void setFundFlowType(String fundFlowType) {
        this.fundFlowType = fundFlowType;
    }
}
