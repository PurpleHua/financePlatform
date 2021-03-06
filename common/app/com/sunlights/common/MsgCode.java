package com.sunlights.common;

/**
 * XXX_XXXX
 * <p/>
 * _前为业务类型
 * _后4位为数字：第一位：0(info) 1(warn) 2(error业务逻辑) 3(fatal系统异常)
 * 第二位：业务代码
 * 0 公用部分
 * 1 注册登录
 * 2 账户中心
 * <p/>
 * 4 交易
 */
public enum MsgCode {

    OPERATE_SUCCESS("0000", "操作成功", ""),
    CONVERTER_FAIL("0004", "模型转换错误"),
    QUERY_VERSION_SUCC("0001", "版本查询成功"),
    ACCESS_FAIL("2001", "访问失败", "传入参数不能为空"),
    LOGIN_TIMEOUT("2002", "登录超时", "请重新登录"),
    MISSING_PARAM_CONFIG("2003", "参数未配置", "参数编码：{0}"),
    PARAM_IS_NOT_NUMBER("2004", "参数不是数字类型", "参数编码：{0}"),
    HEADER_IS_EMPTY("2020", "header中{0}不能为空", ""),
    CONNECT_TIMEOUT("2021", "连接超时", "请重新再试"),
    DATETIME_FORMAT("2022", "时间格式不正确", ""),

    NOT_SUPPORT_PLATFORM("3000", "不支持的平台", "不支持的平台"),

    REGISTRY_SUCCESS("0100", "注册成功", ""),
    LOGIN_SUCCESS("0101", "登录成功", ""),
    PASSWORD_CHANGE_SUCCESS("0102", "修改密码成功", ""),
    GESTURE_PASSWORD_SUCCESS("0103", "手势密码设置成功", ""),
    LOGOUT_SUCCESS("0104", "登出成功", ""),
    BINGING_SUCCESS("0105", "绑定成功", ""),
    PHONE_NUMBER_NOT_REGISTRY("2100", "该手机号未注册", ""),
    PHONE_NUMBER_ALREADY_REGISTRY("2101", "该手机号已注册", ""),
    CERTIFY_OVER_MAX_TIME("2102", "验证码超过最大次数", ""),
    CERTIFY_ERROR("2103", "验证码不正确", "请重新输入"),
    CERTIFY_TIMEOUT("2104", "验证码超时失效", "请重新获取"),
    CERTIFY_NONE("2105", "未获取验证码", "请获取验证码"),
    PASSWORD_ERROR_OVER_COUNT("2106", "密码错误次数过多", "约{0}分钟后再试"),
    PASSWORD_ERROR("2107", "密码错误", "剩余次数{0}"),
    GESTURE_PASSWORD_ERROR("2108", "手势密码错误", "剩余次数{0}"),
    GESTURE_LOGIN_ERROR_OVER_COUNT("2109", "手势登录失败超过最大次数", "请换密码登录"),
    PASSWORD_CONFIRM_ERROR("2110", "密码错误", "请重新输入"),
    GESTURE_NONE("2111", "未开启手势", "请先开启手势"),
    CERTIFY_DEVICE_NOT_MATCH("2112", "验证码与设备号不匹配", "请重新获取"),
    WECHAT_NOT_BINDING("1113", "未查询到此微信", ""),

    ACCOUNT_NOT_EXIST("3100", "不存在该账户", "{0}"),


    TRAD_PASSWORD_RESET_SUCCESS("0200", "交易密码重置成功", ""),
    CERTIFY_SUCCESS("0201", "认证成功", ""),
    NAME_OR_ID_ERROR("2200", "真实姓名或身份证号错误", "请重新填写"),
    CERTIFY_INFO_FAIL("2201", "认证失败", "{0}"),
    TRADE_PASSWORD_ERROR("2202", "交易密码错误", ""),
    CERTIFY_NAME_FAIL("3200", "实名认证接口失败", "{0}"),
    SEARCH_FAIL_EMPTY_PROTOCOL_NO("2300", "查询失败", "协议编号不能为空"),
    SEARCH_FAIL_PROTOCOL_NONE("2301", "查询失败", "没有该协议"),
    SEARCH_FAIL_TYPE_EMPTY("2401", "查询失败", "类型不能为空"),
    SEARCH_FAIL_PRODUCT_DETAIL("2402", "查询产品详情失败", "请重新查询"),
    NOT_EXISTED_PRODUCT("2403", "未查询到此产品", "该产品为其他商户产品"),
    SEARCH_CODES_NOT_NULL("2404", "查询失败", "产品代码不能为空"),
    SEARCH_FAIL_FUND_CATEGORY_EMPTY("2403", "查询失败", "基金种类不能为空"),
    BANK_CARD_ADD_SUCCESS("0210", "操作成功", "银行卡添加成功"),
    BANK_CARD_DELETE_SUCCESS("0211", "操作成功", "银行卡删除成功"),
    BANK_NAME_CERTIFY_FAIL("2210", "请先实名认证", ""),
    BIND_CARD_FAIL_ALREADY_BIND("2211", "绑卡失败", "该银行卡已被绑定"),
    BANK_CARD_ADD_FAIL("2212", "银行卡添加失败"),
    BANK_CARD_DELETE_FAIL("2213", "银行卡删除失败"),
    BANK_CARD_CERTIFY_FAIL("2214", "银行卡验证失败"),
    BIND_CARD_FAIL_EMPTY_BANK("2215", "绑卡失败", "银行不能为空"),
    BANK_CARD_NOT_BINGING("2216", "未绑卡银行卡"),
    SAVE_SHUMI_ACCOUNT_SUCCESS("0217", "数米信息保存成功"),
    ENABLE_PUSH_SUCCESS("0218", "推送开启成功"),
    ENABLE_PUSH_FAIL("1218", "推送开启失败"),
    DISABLE_PUSH_SUCCESS("0219", "推送关闭成功"),
    WECHAT_QUERY_SUCCESS("0230", "微信查询成功"),

    TRADE_ORDER_SUCCESS("0400", "下单成功"),
    TRADE_ORDER_NOCODE("1400", "下单成功，该产品为其它商户产品", "未查询到此产品"),
    TRADE_REDEEM_SUCCESS("0401", "赎回成功"),
    TRADE_REDEEM_NOCODE("1401", "赎回成功，该产品为其它商户产品", "未查询到此产品"),
    TRADE_AMOUNT_VALIDATE("2400", "申购金额超出总资产", "请重新输入"),


    //operation platform
    CREATE_SUCCESS("0001", "创建成功", ""),
    UPDATE_SUCCESS("0002", "更新成功", ""),
    DELETE_SUCCESS("0003", "删除成功", ""),
    OPERATE_WARNING("1000", "警告", ""),
    PUSH_SUCCESS("0005", "推送成功", ""),

    OPERATE_FAILURE("2000", "操作失败", ""),
    CREATE_FAILURE("2001", "创建失败", ""),
    UPDATE_FAILURE("2002", "更新失败", ""),
    DELETE_FAILURE("2003", "删除失败", ""),
    DATA_EXPORT_ERROR("2005", "{0}该文件不可写(是否文件已打开),终止数据导出!"),
    FILE_EXIST_ERROR("2006", "{0}该文件已存在!"),
    CODE_EXIST_ERROR("2007", "操作失败：", "已存在的字典表。"),
    FUND_COMPANY_EXIST_ERROR("2008", "操作失败：", "已存在的基金公司。"),
    SUPPLIER_EXIST_ERROR("2009", "操作失败：", "已存在的供应商。"),
    FUND_EXIST_ERROR("2010", "操作失败：", "已存在的基金。"),
    PRODUCT_MANAGE_EXIST_ERROR("2011", "操作失败：", "已存在的产品管理。"),
    JOB_CLASS_NOT_FOUND_ERROR("2012", "操作失败：", "没有找到任务执行类。"),
    JOB_NUMBER_FORMAT_ERROR("2013", "操作失败：", "请输入有效的时间间隔。"),
    JOB_DATE_PARSING_ERROR("2014", "操作失败：", "请输入有效的时间。"),
    JOB_SCHEDULER_ERROR("2015", "操作失败：", "请重新操作。"),
    DEPOSIT_INTEREST_EXIST_ERROR("2016", "操作失败：", "已存在的活期利率。"),
    ROLE_CODE_EXIST_ERROR("2017", "操作失败：", "已存在的角色代码。"),
    USER_NAME_EXIST_ERROR("2018", "操作失败：", "已存在的用户名。"),
    BANK_CODE_EXIST_ERROR("2019", "操作失败：", "已存在的银行编码。"),
    USER_EMAIL_EXIST_ERROR("2020", "操作失败：", "已存在的用户邮箱地址。"),
    USER_NAME_NOT_MATCHED_EMAIL("2021", "操作失败：", "用户名邮箱不匹配。"),
    NOT_NULL("2004", "操作失败：", "传入参数'{0}'不能为空。"),

    LOGIN_NOT_REGISTER_ERROR("2022", "登陆失败：", "没有该用户账号。"),
    LOGIN_ACCOUNT_UNUSUAL_ERROR("2023", "登陆失败：", "该用户账户异常。"),
    LOGIN_PASSWORD_INCORRECT_ERROR("2024", "登陆失败：", "密码错误。"),

    PUSH_TIMED_IND_ERROR("2025", "推送任务失败，原因：该任务是定时的！"),
    PUSH_STATUS_ERROR("2026", "推送任务失败，该任务不是待推送状态！"),
    MESSAGE_RULE_ERROR("2027", "创建规则失败", "规则编码不能重复！"),
    PLANNER_PHONE_EXIST_ERROR("2028", "操作失败：", "已存在的手机号"),

    OPERATOR_RESET_PWD("0006", "[金豆荚-管理系统]：重置密码"),
    OPERATOR_RESET_PWD_INFO("0007", "尊敬的[{0}]用户,此次重置的密码为[{1}]"),

    //活动积分模块
    OBTAIN_SUCC("0220", "签到成功"),
    ACTIVITY_QUERY_SUCC("0221", "查询成功"),
    REWARD_QUERY_SUCC("0222", "查询成功"),
    SHARE_QUERY_SUCC("0223", "分享查询成功"),
    ABOUT_QUERY_SUCC("0224", "获取二维码成功"),
    EXCHANGE_SCENE_QUERY_SUCC("0225", "兑换场景查询成功"),
    BEFORE_EXCHANGE_QUERY_SUCC("0226", "兑换前预准备成功"),
    EXCHANGE_SUCC("0227", "兑换成功"),
    REWARD_FLOW_QUERY_SUCC("0228", "奖励流水查询成功"),
    ALREADY_SIGN("2220", "重复签到"),
    NOT_CONFIG_ACTIVITY_SCENE("2221", "没有配置活动场景"),
    NOT_BEGIN_ACTIVITY_SCENE("2231", "活动未开始"),
    ALREADY_PURCHASE("2222", "不是首次购买"),
    ALREADY_REGISTER("2223", "已经注册"),
    EXCHANGE_OVER_LIMIT("2224", "兑换数量超额"),
    NOT_CAN_ATTEND_ACTIVITY("2225", "该客户不能参加此活动"),
    NOT_SUPPORT_TRADE_TYPE("2226", "不支持的交易类型"),
    ACTIVITY_SCENE_EXIST_ERROR("2227", "操作失败：", "已存在到场景编码。"),
    EXCHANGE_NOT_ENOUGH("2228", "兑换数量不足"),
    NOT_SUPPORT_SHARE_TYPE("2229", "不支持的分享类型"),
    PARAMTER_NOT_CAN_NULL("2230", "参数不能为空"),
    ACTIVITY_SYS_ERROR("3201", "系统异常"),

    UPLOAD_FILE_ERROR("3202", "上传失败：", "请确认上传文件"),
    UPLOAD_FILE_TYPE_ERROR("3203", "上传失败：", "上传文件格式错误"),


    BEAN_EXCHANGE_REPEAT("1231", "今天已兑换了亲", "请明天再来哦"),
    BEAN_EXCHANGE_NOTENOUGH("1232", "金豆数不足以兑换话费"),
    BEAN_BEFORE_EXCHANGE_SUCC("0229", "金豆兑换前预准备成功"),
    BEAN_EXCHANGE_SUCC("0227", "金豆兑换成功", "您本次兑换{0}元话费到{1}，预计在{2}个工作日内收到。"),


    EXCHANGE_CHECK_INFO("0228", "上传成功：", "兑换成功{0}条记录，兑换失败{1}条记录。"),

    UPLOAD_FILE_INFO("0229", "上传成功：", "成功{0}条记录，失败{1}条记录。"),

    //版本信息错误吗
    MUST_UPDATE_VERSION("1303", "金豆荚理财", "您的App版本过低, 请升级到: V{0}"),
    CURRENT_LATEST_VERSION("0301", "金豆荚理财", "当前版本已经是最新版本:V{0}"),
    REMIND_UPDATE_VERSION("0302", "金豆荚理财", "有新版本V{0}, 是否升级?"),
    UPDATE_VERSION_TO_CURRENT("0303", "金豆荚理财", "您的App版本过低, 请升级到: V{0}"),
    NOT_COFIG_VERSION_RULE("1302", "金豆荚理财", "没有配置v{0}版本规则"),
    NOT_A_VALID_DATE("1401", "非法输入日期，请检查输入日期格式是否合法", ""),
    TASK_NAME_EMPTY("1501", "任务名称为空", ""),;


    private String code;
    private String message;
    private String detail;

    private MsgCode(String code, String message) {
        this(code, message, "");
    }

    private MsgCode(String code, String message, String detail) {
        this.code = code;
        this.message = message;
        this.detail = detail;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getDetail() {
        return this.detail;
    }

    public static String getDescByCode(String code) {
        if (code == null) {
            return null;
        }
        for (MsgCode msgCode : MsgCode.values()) {
            if (code.equals(msgCode.getCode())) {
                return msgCode.getMessage();
            }
        }
        return null;
    }
}
