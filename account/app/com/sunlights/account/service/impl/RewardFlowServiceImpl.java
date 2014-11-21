package com.sunlights.account.service.impl;

import com.sunlights.account.dal.RewardFlowDao;
import com.sunlights.account.dal.impl.RewardFlowDaoImpl;
import com.sunlights.account.service.RewardFlowService;
import com.sunlights.common.utils.CommonUtil;
import models.RewardFlow;
import play.Logger;

import java.util.Date;
import java.util.List;


/**
 * Created by tangweiqun on 2014/11/19.
 */
public class RewardFlowServiceImpl implements RewardFlowService {

    private RewardFlowDao rewardFlowDao = new RewardFlowDaoImpl();

    @Override
    public void saveRewardFlow(RewardFlow rewardFlow) {
        rewardFlowDao.saveRewardFlow(rewardFlow);
        Logger.info("保存资金流水");
    }

    @Override
    public RewardFlow findTodayFlowByCustIdAndScene(String custId, String scene) {
        String startDate = null;
        String endDate = null;
        try {
            String dateStr = CommonUtil.dateToString(new Date(), CommonUtil.DATE_FORMAT_SHORT);
            startDate = dateStr + " 00:00:00";
            endDate = dateStr + " 23:59:59";
            RewardFlow paramter = new RewardFlow();
            paramter.setCustId(custId);
            paramter.setScene(scene);
            RewardFlow rewardFlow = rewardFlowDao.findOneByCondition(paramter, startDate, endDate);

            return rewardFlow;
        } catch (Exception e) {
            Logger.error("获取当天奖励流水错误", e);
        }
        return null;
    }

    @Override
    public List<RewardFlow> findByCustIdAndRewardType(String custId, String rewardType) {
        try {
            RewardFlow rewardFlow = new RewardFlow();
            rewardFlow.setCustId(custId);
            rewardFlow.setRewardType(rewardType);
            return rewardFlowDao.findByCondition(rewardFlow);
        } catch (Exception e) {
            Logger.error("查询奖励流水错误", e);
        }
        return null;
    }
}