package com.example.demo.apsTemplate;

public enum EnumRetCode {
  /**
   * 全局返回码-成功
   */
  SUCCESS(0, "成功"),

  /**
   * 全局返回码-服务器内部错误
   */
  ERROR(1, "服务器内部错误"),

  /**
   * 全局返回码-未授权
   */
  NO_AUTH(2, "未授权"),

  /**
   * 全局返回码-系统维护
   */
  MAINTAIN(3, "系统维护"),

  /**
   * 登录成功
   */
  SUCCESS_LOGIN(10000, "登录成功"),

  /**
   * 重复登录
   */
  ALREADY_LOGINED(10001, "重复登录"),

  /**
   * 用户名或密码错误
   */
  USERNAME_OR_PASSWD_ERROR(10002, "用户名或密码错误"),

  /**
   * 用户已冻结
   */
  USER_FREEZE(10003, "用户已冻结"),
  /**
   * 登录失败次数达到4次
   */
  USER_FAILED_4_TIMES(10004, "您已连续4次输入登录密码错误，当日累计输错6次，您的账户将被冻结，次日解冻。如需当日解冻请联系客服。"),


  /**
   * 登录失败次数达到5次
   */
  USER_FAILED_5_TIMES(10005, "您已连续5次输入登录密码错误，当日累计输错6次，您的账户将被冻结，次日解冻。如需当日解冻请联系客服。"),

  /**
   * 登录失败次数达到6次，冻结
   */
  USER_FAILED_6_TIMES(10006, "您已连续6次输入登录密码错误，现账户已被冻结，次日解冻。请您次日再试或通过“找回密码”的方式重新设定新密码后再登录。"),

  /**
   * 个人信息查询成功
   */
  FIND_USER_INFO_SUCCESS(11000, "个人信息查询成功"),

  /**
   * 个人信息查询失败
   */
  FIND_USER_INFO_ERROR(11001, "个人信息查询失败"),

  /**
   * 无个人信息数据
   */
  NOT_USER_INFO(11002, "无个人信息数据"),


  /**
   * 二维码无效
   */
  QRCODE_ERROR(11003, "二维码无效"),

  /**
   * 二维码已被使用
   */
  QRCODE_REPEAT_SCAN(11004, "二维码已被使用"),

  /**
   * 个人资产查询成功
   */
  FIND_USER_PROPERTY_SUCCESS(12000, "个人资产查询成功"),

  /**
   * 个人资产查询失败
   */
  FIND_USER_PROPERTY_ERROR(12001, "个人资产查询失败"),

  /**
   * 无个人资产数据
   */
  NOT_USER_PROPERTY(12002, "无个人资产数据"),

  /**
   * 查询推荐产品成功
   */
  FIND_RECOMMEND_FUND_SUCCESS(13000, "查询推荐产品成功"),

  /**
   * 查询推荐产品失败
   */
  FIND_RECOMMEND_FUND_ERROR(13001, "查询推荐产品失败"),

  /**
   * 无推荐产品数据
   */
  NOT_FUND_RECOMMEND_FUND(13002, "无推荐产品数据"),
  /**
   * 无推荐策略数据
   */
  NOT_FUND_RECOMMEND_STRATEGY(13003, "无推荐策略数据"),
  /**
   * 无任何推荐信息
   */
  NOT_FUND_AND_STRATEGY(13004, "无任何推荐信息"),

  /**
   * 查询产品列表成功
   */
  FIND_RAISE_FUND_LIST_SUCCESS(14000, "查询募集中产品列表成功"),

  /**
   * 查询产品列表失败
   */
  FIND_RAISE_FUND_LIST_ERROR(14001, "查询募集中产品列表失败"),

  /**
   * 无产品列表数据
   */
  NOT_RAISE_FUND_LIST(14002, "无募集中产品列表数据"),

  /**
   * 查询产品详情成功
   */
  FIND_FUND_INFO_SUCCESS(15000, "查询产品详情成功"),

  /**
   * 查询产品详情失败
   */
  FIND_FUND_INFO_ERROR(15001, "查询产品详情失败"),

  /**
   * 无产品详情数据
   */
  NOT_FUND_INFO(15002, "无产品详情数据"),

  /**
   * 查询发起人档案成功
   */
  FIND_FUNDER_INFO_SUCCESS(16000, "查询发起人档案成功"),

  /**
   * 查询发起人档案失败
   */
  FIND_FUNDER_INFO_ERROR(16001, "查询发起人档案失败"),

  /**
   * 无发起人档案数据
   */
  NOT_FUNDER_INFO(16002, "无发起人档案数据"),

  /**
   * 查询资金管理人档案成功
   */
  FIND_MANAGER_INFO_SUCCESS(17000, "查询资金管理人档案成功"),

  /**
   * 查询资金管理人档案失败
   */
  FIND_MANAGER_INFO_ERROR(17001, "查询资金管理人档案失败"),

  /**
   * 无资金管理人档案数据
   */
  NOT_MANAGER_INFO(17002, "无资金管理人档案数据"),

  /**
   * 查询入伙记录成功
   */
  FIND_TRADE_DETAIL_SUCCESS(18000, "查询入伙记录成功"),

  /**
   * 查询入伙记录失败
   */
  FIND_TRADE_DETAIL_ERROR(18001, "查询入伙记录失败"),

  /**
   * 查询入伙记录成功
   */
  FIND_MY_TRADE_DETAIL_SUCCESS(18003, "查询我的入伙记录详情成功"),

  /**
   * 查询入伙记录失败
   */
  FIND__MY_TRADE_DETAIL_ERROR(18004, "查询我的入伙记录详情失败"),

  /**
   * 无入伙记录数据
   */
  NOT_TRADE_DETAIL_INFO(18002, "无入伙记录数据"),
  /**
   * 查询取款记录成功
   */
  FIND_WITHDRAW_DETAIL_SUCCESS(18005, "查询取款记录成功"),
  /**
   * 该时段无取款记录
   */
  NOT_WITHDRAW_DETAIL_INFO(18006, "未找到符合查询条件的记录"),
  /**
   * 查询资金明细成功
   */
  FIND_CAPITAL_DETAIL_SUCCESS(18100, "查询资金明细成功"),
  /**
   * 此时间段内，无符合查询条件的资金明细记录
   */
  NOT_CAPITAL_DETAIL_INFO(18101, "此时间段内，无符合查询条件的资金明细记录"),
  /**
   * 入伙产品成功
   */
  JOIN_FUND_SUCCESS(19000, "入伙产品成功"),

  /**
   * 入伙产品失败，登录用户与要入伙的用户不匹配
   */
  JOIN_FUND_TRADEPWD_ERROR(19001, "入伙产品失败，交易密码错误"),

  /**
   * 入伙产品失败，指定要入伙的产品不存在
   */
  NOT_JOIN_FUND_ERROR(19002, "入伙产品失败，指定要入伙的产品不存在"),

  /**
   * 入伙产品失败，入伙金额必须大于0
   */
  JOIN_FUND_AMOUNT_ERROR(19003, "入伙产品失败，入伙金额必须大于0"),

  /**
   * 入伙产品失败，入伙金额必须小于等于产品可入伙金额
   */
  JOIN_FUND_ALLOW_AMOUNT_ERROR(19004, "入伙产品失败，入伙金额必须小于等于产品可入伙金额"),

  /**
   * 入伙产品失败，该产品风险值不允许使用红包
   */
  JOIN_FUND_USE_REDBAG_RISK_ERROR(19005, "入伙产品失败，该产品风险值不允许使用红包"),

  /**
   * 入伙产品失败，该产品操作时长不允许使用红包
   */
  JOIN_FUND_USE_REDBAG_OPERTIME_ERROR(19006, "入伙产品失败，该产品操作时长不允许使用红包"),

  /**
   * 入伙产品失败，入伙金额必须大于产品最小入伙金额
   */
  JOIN_FUND_MIN_AMOUNT_ERROR(19007, "入伙产品失败，入伙金额必须大于产品最小入伙金额"),

  /**
   * 入伙产品失败，当前用户不允许入伙该产品
   */
  JOIN_FUND_NOT_ALLOW_ERROR(19008, "入伙产品失败，当前用户不允许入伙该产品"),

  /**
   * 入伙产品失败，账户可用余额不足
   */
  JOIN_FUND_BALANCE_DWINDLE_ERROR(19009, "入伙产品失败，账户可用余额不足"),
  /**
   * 入伙产品失败，账户可用余额不足
   */
  JOIN_FUND_JOIN_AMOUNT_ERROR(19010, "入伙产品失败，此产品只能用红包入伙"),
  /**
   * 入伙产品失败，入伙人数已达上限
   */
  JOIN_FUND_USER_UPPER_LIMIT(19011, "入伙产品失败，入伙人数已达上限"),
  /**
   * 口令错误，请您重新输入
   */
  JOIN_FUND_CHKCODE_ERROR(19012, "口令错误，请重新输入！"),
  /**
   * 口令错误，您已连续输错5次，请2小时后重试
   */
  JOIN_FUND_CHKCODE_MAX_ERROR(19013, "口令错误，您已连续输错5次，请2小时后重试"),
  /**
   * 口令正确
   */
  JOIN_FUND_CHKCODE_SUCCESS(19014, "口令正确"),
  /**
   * 该产品限{}段以上合伙人入伙，请您选择其他产品
   */
  JOIN_FUND_CHKCODE_MIN_GRADE(19015, "该产品限X段以上合伙人入伙，请您选择其他产品"),
  /**
   * 口令错误，请重新输入！您还有2次输入机会。
   */
  JOIN_FUND_CHKCODE_ERROR2(19016, "口令错误，请重新输入！您还有2次输入机会。"),
  /**
   * 口令错误，请重新输入！您还有1次输入机会。
   */
  JOIN_FUND_CHKCODE_ERROR3(19017, "口令错误，请重新输入！您还有1次输入机会。"),
  /**
   * 口令错误，您已连续输错5次，请2小时后重试。
   */
  JOIN_FUND_CHKCODE_ERROR4(19018, "口令错误，您已连续输错5次，请2小时后重试。"),
  /**
   * 您已连续输错5次并被锁定，请2小时后重试。
   */
  JOIN_FUND_CHKCODE_ERROR5(19019, "您已连续输错5次并被锁定，请2小时后重试。"),
  /**
   * 入伙产品失败，其他原因
   */
  JOIN_FUND_OTHTER_ERROR(19999, "入伙产品失败，其他原因"),

  /**
   * 修改交易密码成功
   */
  CHANGE_TRADE_PWD_SUCCESS(20000, "修改交易密码成功"),

  /**
   * 修改交易密码失败
   */
  CHANGE_TRADE_PWD_ERROR(20001, "修改交易密码失败，其他原因"),

  /**
   * 原始交易密码错误
   */
  CHANGE_TRADE_OLDPWD_ERROR(20002, "旧交易密码错误"),

  /**
   * 修改交易密码没有找到对应的用户
   */
  CHANGE_TRADE_PWD_USER_NOT_FUND(20003, "修改交易密码没有找到对应的用户"),

  /**
   * 新交易密码与原始交易密码相同
   */
  CHANGE_TRADE_OLDPWD_NEWPWD_SAME(20004, "新交易密码与原始交易密码相同"),

  /**
   * 短信验证码校验失败
   */
  CHANGE_TRADE_PHONE_CODE_ERROR(20005, "短信验证码校验失败"),
  /**
   * 支付密码正确
   */
  CHECK_TRADE_PWD_SUCCESS(20006, "支付密码正确"),
  /**
   * 支付密码错误，请重新输入！
   */
  CHECK_TRADE_PWD_ERROR1(20007, "支付密码错误，请重新输入！"),
  /**
   * 支付密码错误，请重新输入！您还有2次输入机会。
   */
  CHECK_TRADE_PWD_ERROR3(20008, "支付密码错误，请重新输入！您还有2次输入机会。"),
  /**
   * 支付密码错误，请重新输入！您还有1次输入机会。
   */
  CHECK_TRADE_PWD_ERROR4(20009, "支付密码错误，请重新输入！您还有1次输入机会。"),
  /**
   * 支付密码错误，您已连续输错5次，请找回密码或2小时后重试。
   */
  CHECK_TRADE_PWD_ERROR5(20010, "支付密码错误，您已连续输错5次，请找回密码或2小时后重试。"),
  /**
   * 您已连续输错5次并被锁定，请找回密码或2小时后重试。
   */
  CHECK_TRADE_PWD_ERROR6(20011, "您已连续输错5次并被锁定，请找回密码或2小时后重试。"),
  /**
   * 请设置支付密码
   */
  CHECK_TRADE_PWD_ERROR7(20012, "请设置支付密码"),
  /**
   * 修改密码成功
   */
  CHANGE_LOGIN_PWD_SUCCESS(21000, "修改密码成功"),

  /**
   * 修改密码失败，其他原因
   */
  CHANGE_LOGIN_PWD_OTHER(21001, "修改密码失败，其他原因"),

  /**
   * 旧密码输入错误
   */
  CHANGE_LOGIN_OLDPWD_ERROR(21002, "旧密码输入错误"),

  /**
   * 新密码与原始密码相同
   */
  CHANGE_LOGIN_OLDPWD_NEWPWD_SAME(21003, "新密码与原始密码相同"),
  /**
   * 短信验证码错误
   */
  CHANGE_LOGIN_PHONE_CODE_ERROR(21004, "短信验证码错误"),

  /**
   * 验证码校验成功
   */
  MSG_CHECK_SUCCESS(22000, "验证码校验成功"),

  /**
   * 验证码校验失败
   */
  MSG_CHECK_ERROE(22001, "验证码校验失败"),

  /**
   * 验证码发送成功
   */
  MSG_SEND_SUCCESS(22002, "验证码发送成功"),
  /**
   * 验证码发送过于频繁
   */
  MSG_SEND_OFTEN(22003, "获取短信验证码频繁，请稍后重试"),
  /**
   * 验证码失效
   */
  MSG_SEND_LOSE(22005, "验证码失效"),
  /**
   * 该手机验证次数已超过上限，请明日再试。
   */
  MSG_SEND_MAXCOUNT(22006, "该手机验证次数已超过上限，请明日再试。"),
  /**
   * 反馈成功
   */
  USER_FEED_BACK_SUCCESS(23000, "反馈成功"),

  /**
   * 反馈失败
   */
  USER_FEED_BACK_ERROR(23001, "反馈失败"),

  /**
   * 无此用户
   */
  USER_FEED_BACK_USER_ISNULL(23002, "无此用户"),

  /**
   * 获取成功
   */
  VERSION_GET_SUCCESS(24000, "获取成功"),
  /**
   * 客户端为最新版本
   */
  VERSION_GET_ERROR(24001, "客户端为最新版本"),
  /**
   * 客户端版本号不存在，需要立即升级
   */
  VERSION_GET_MUST(24002, "客户端版本号不存在，需要立即升级"),
  /**
   * 服务器没有版本信息
   */
  VERSION_GET_NULL(24003, "服务器没有版本信息"),

  /**
   * 查询入伙记录成功
   */
  FIND_FUND_TRADE_DETAIL_SUCCESS(25000, "查询入伙记录成功"),
  /**
   * 查询入伙记录失败
   */
  FIND_FUND_TRADE_DETAIL_ERROR(25001, "查询入伙记录失败"),
  /**
   * 无入伙记录数据
   */
  NOT_FUND_TRADE_DETAIL_INFO(25002, "无入伙记录数据"),

  /**
   * 注销成功
   */
  USER_LOGIN_OUT_SUCCESS(26000, "注销成功"),
  /**
   * 注销失败，用户未登录
   */
  USER_LOGIN_OUT_ERROR(26001, "注销失败，用户未登录"),
  /**
   * 注销失败，其他原因
   */
  USER_LOGIN_OUT_ERROR_OTHER(26002, "注销失败，其他原因"),

  /**
   * 注册成功
   */
  REGISTER_SUCCESS(27000, "注册成功"),
  /**
   * 密码格式错误
   */
  REGISTER_PHONE_ERROR(27001, "密码格式错误"),
  /**
   * 密码不一致
   */
  REGISTER_PWD_NOSAME(27002, "密码不一致"),
  /**
   * 手机已经使用
   */
  REGISTER_PHONE_HAVE(27003, "手机已经使用"),
  /**
   * 昵称已经使用
   */
  REGISTER_NIKENAME_HAVE(27004, "昵称已经使用"),
  /**
   * 昵称格式错误
   */
  REGISTER_NIKENAME_ERROR(27005, "昵称格式错误"),
  /**
   * 注册失败
   */
  REGISTER_ERROR(27006, "注册失败"),
  /**
   * 短信验证码错误
   */
  REGISTER_PHONECODE_ERROR(27007, "短信验证码错误"),
  /**
   * 推荐人不存在
   */
  REGISTER_RECOMMEND_NOT_EXIST(27008, "推荐人不存在"),
  /**
   * 推荐人信息错误
   */
  REGISTER_RECOMMEND_ERROR(27009, "推荐人信息错误"),
  /**
   * 校验成功
   */
  VALIDATE_SUCCESS(28000, "校验成功"),
  /**
   * 手机号码已经存在
   */
  VALIDATE_PHONR_ISHAVE(28001, "手机号码已经存在"),
  /**
   * 邮箱已经存在
   */
  VALIDATE_EMAILL_ISHAVE(28002, "邮箱已经存在"),
  /**
   * 昵称已经存在
   */
  VALIDATE_NIKENAME_ISHAVE(28003, "昵称已经存在"),
  /**
   * 邮箱格式错误
   */
  VALIDATE_EMAILL_ERROR(28004, "邮箱格式错误"),
  /**
   * 昵称格式错误
   */
  VALIDATE_NIKENAME_ERROR(28005, "昵称格式错误"),
  /**
   * 验证失败
   */
  VALIDATE_ERROR(28006, "验证失败"),

  /**
   * 获取实名认证信息失败
   */
  ID_CARD_SUCCESS(281000, "实名信息认证通过"),

  /**
   * 实名认证失败
   */
  ID_CARD_AUTH_FAIL(281002, "认证失败"),

  /**
   * 证件号码存在
   */
  ID_CARD_EXIST(281003, "证件号码存在"),
  /**
   * 获取实名认证信息失败
   */
  ID_CARD_HANDING(281004, "实名认证信息已提交成功，进入审核中"),
  /**
   * 实名认证信息证件类型、证件号码、或真实姓名为空
   */
  ID_CARD_NULL(281005, "实名认证信息证件类型、证件号码、或真实姓名为空"),
  /**
   * 实名认证，身份证格式不正确
   */
  ID_CARD_ERROR_FORMAT_ID(281006, "实名认证，身份证格式不正确"),
  /**
   * 实名认证，护照格式不正确
   */
  ID_CARD_ERROR_FORMAT_PASSPORT(281007, "实名认证，护照格式不正确"),
  /**
   * 实名认证，港澳通行证号码格式不正确
   */
  ID_CARD_ERROR_FORMAT_PASSPORT_HK(281008, "实名认证，港澳通行证号码格式不正确"),
  /**
   * 实名认证，姓名格式不正确
   */
  ID_CARD_ERROR_NAME(281009, "实名认证，姓名格式不正确"),
  /**
   * 您未满18周岁，不能申请实名认证
   */
  ID_CARD_ERROR_FORMAT_ID_18(281010, "您未满18周岁，不能申请实名认证"),
  /**
   * 获取实名认证信息失败
   */
  ID_CARD_INFO_SUCC(282000, "查询实名认证信息成功"),


  /**
   * 获取实名认证信息失败
   */
  ID_CARD_INFO_ERROR(282001, "获取实名认证信息失败"),

  /**
   * 活体认证成功
   */
  LIVE_CERTIFICATION_SUCC(283001, "活体认证成功"),
  /**
   * 您已完成人脸认证
   */
  LIVE_CERTIFICATION_REPEAT_SUBMIT(283002, "您已完成人脸认证"),

  /**
   * 活体认证失败
   */
  LIVE_CERTIFICATION_ERROR(283009, "活体认证失败"),

  /**
   * 获取成功
   */
  ACTIVITY_BANNER_LIST_SUCCESS(29000, "获取成功"),
  /**
   * 获取失败
   */
  ACTIVITY_BANNER_LIST_ERROR(29001, "获取失败"),
  /**
   * 获取成功
   */
  BANK_DETAIL_SUCCESS(30000, "获取成功"),
  /**
   * 银行卡信息不存在
   */
  BANK_DETAIL_ISNULL(30001, "银行卡信息不存在"),
  /**
   * 不支持该银行卡
   */
  BANK_CARD_NOT_SUPPORT(30002, "不支持该银行卡"),
  /**
   * 取款成功
   */
  WITH_DRAW_SUCCESS(31000, "取款成功"),
  /**
   * 身份未认证
   */
  WITH_DRAW_IS_IDENTITY_AUTH(31001, "身份未认证"),
  /**
   * 手机为空或没激活
   */
  WITH_DRAW_PHONE_BIND(31002, "手机为空或没激活"),
  /**
   * 取款金额必须为大于1的整数或小数，小数点后不超过2位
   */
  WITH_DRAW_AMOUNT_ERROR(31003, "取款金额必须为大于1的整数或小数，小数点后不超过2位"),
  /**
   * 支付密码错误
   */
  WITH_DRAW_TRADEPWD_ERROE(31004, "支付密码错误"),
  /**
   * 手机验证码错误
   */
  WITH_DRAW_PHONECODE_ERROR(31005, "手机验证码错误"),
  /**
   * 没有当前用户
   */
  WITH_DRAW_USER_NULL(31006, "没有当前用户"),
  /**
   * 金额不能大于50000
   */
  WITH_DRAW_AMOUNT_MAX(31007, "金额不能大于50000"),
  /**
   * 非法请求
   */
  WITH_DRAW_ERROR(31008, "非法请求"),

  /**
   * 取款异常
   */
  WITH_DRAW_ERROR1(31009, "您的取款操作异常，请您联系客服处理。"),
  /**
   * 取款异常
   */
  WITH_DRAW_ERROR2(31010, "充值满24小时方可申请提款，您当前所申请提款金额中有部分不满足此条件，请重新确认取款金额！"),
  /**
   * 取款异常
   */
  WITH_DRAW_ERROR3(31011, "取款金额需要大于3元！"),
  /**
   * 取款异常
   */
  WITH_DRAW_ERROR4(31012, "银行卡未认证！"),
  /**
   * 取款单笔限额50万元，请拆分多笔取款。
   */
  WITH_DRAW_ERROR5(31013, "取款单笔限额50万元，请拆分多笔取款。"),
  /**
   * 取款单笔限额50万元。
   */
  WITH_DRAW_ERROR6(31014, "单笔取款金额不能超过49万元"),
  WITH_DRAW_ERROR7(31015, "日累计取款金额不能超过49万元"),
  WITH_DRAW_ERROR_fail(31016, "取款失敗"),
  /**
   * 返回流水成功
   */
  CHARGE_RECORD_SUCCESS(32000, "返回流水成功"),
  /**
   * 返回流水失败
   */
  CHARGE_RECORD_ERROR(32001, "返回流水失败"),
  /**
   * 异常请求
   */
  CHARGE_RECORD_TES(32002, "异常请求"),
  /**
   * 请升级到最新版本进行充值
   */
  CHARGE_RECORD_UPDATE(32003, "请升级到最新版本进行充值"),
  /**
   * 充值成功
   */
  TONGLIAN_PAYMENT_SUCCESS(33000, "充值成功"),
  /**
   * 非法请求
   */
  TONGLIAN_PAYMENT_ERROR(33001, "非法请求"),
  /**
   * 无此交易记录
   */
  TONGLIAN_PAYMENT_ISNULL(33002, "无此交易记录"),
  /**
   * 充值失败
   */
  TONGLIAN_PAYMENT_NULL(33003, "充值失败"),

  /**
   * 绑定成功
   */
  ADDBANK_SUCCESS(34000, "绑定成功"),
  /**
   * 未进行实名认证
   */
  ADDBANK_ISNOTRELNAME(34001, "未进行实名认证"),
  /**
   * 银行类型错误
   */
  ADDBANK_BANKTYPE_ERROR(34002, "银行类型错误"),
  /**
   * 银行卡开户支行选择错误
   */
  ADDBANK_BANKDETAIL_ERROR(34003, "银行卡开户支行选择错误"),

  /**
   * 省份选择错误
   */
  ADDBANK_PROVICE_ERROR(34004, "省份选择错误"),

  /**
   * 开户地市选择错误
   */
  ADDBANK_CITY_ERROR(34005, "开户地市选择错误"),

  /**
   * 银行卡号填写错误
   */
  ADDBANK_CARDNUM_ERROR(34006, "银行卡号填写错误"),
  /**
   * 此账户已经存在，请勿重复绑定
   */
  ADDBANK_ISHAVA(34007, "此账户已经存在，请勿重复绑定"),
  /**
   * 银行预留手机号填写错误
   */
  ADDBANK_PHONE_ERROR(34008, "手机号格式错误"),
  /**
   * 银行卡认证失败
   */
  ADDBANK_AUTH_ERROR(34009, "您的银行卡信息校验失败，请核实后重试"),
  /**
   * 您的银行卡校验失败次数已达当日上限6次,请明日再试.
   */
  ADDBANK_AUTH_COUNT_MAX(34010, "您的银行卡校验失败次数已达当日上限6次,请明日再试."),
  /**
   * 您的银行卡四要素认证成功.
   */
  ADDBANK_AUTH_SUCCESS(34011, "认证成功"),
  /**
   * 您的银行卡信息校验失败，请核实后重试或更换银行卡
   */
  ADDBANK_AUTH_ERROR2(34012, "您的银行卡信息校验失败，请核实后重试或更换银行卡"),
  /**
   * 银行卡归属地查询接口异常
   */
  ADDBANK_AUTH_ERROR3(34013, "银行卡归属地查询接口异常"),
  /**
   * 您的银行卡号与开户银行不匹配，请核对
   */
  ADDBANK_DIFF_BANK_ERROR3(34014, "您的银行卡号与开户银行不匹配，请核对"),
  /**
   * 取消绑定成功
   */
  DELBANK_SUCCESS(35000, "取消绑定成功"),
  /**
   * 绑定失败，银行卡列表为空
   */
  DELBANK_CARDNUM_ISNULL(35001, "取消绑定失败，银行卡列表为空"),
  /**
   * 绑定失败
   */
  DELBANK_CARDNUM_ERROR(35002, "取消绑定失败"),

  /**
   * 获取支行信息成功
   */
  QUERY_BANK_DETAIL_SUCCESS(36000, "获取支行信息成功"),
  /**
   * 银行类型错误
   */
  QUERY_BANK_DETAIL_BANK_ERROR(36001, "银行类型错误"),
  /**
   * 省份选择错误
   */
  QUERY_BANK_DETAIL_PROVICE_ERROR(36002, "省份选择错误"),
  /**
   * 开户地市选择错误
   */
  QUERY_BANK_DETAIL_CITY_ERROR(36003, "开户地市选择错误"),

  /**
   * 申请已受理
   */
  OFFLINE_APPLIY_SUCCESS(37000, "申请已受理"),
  /**
   * 线下充值金额必须为10—10000000的整数或小数，小数点后不超过2位
   */
  OFFLINE_APPLIY_AOMUONT_MAX(37001, "线下充值金额必须为10—10000000的整数或小数，小数点后不超过2位"),
  /**
   * 查无此当前用户
   */
  OFFLINE_APPLIY_USER_ERROR(37002, "查无此当前用户"),
  /**
   * 申请已受理
   */
  OFFLINE_APPLIY_ERROR(37003, "申请失败"),
  /**
   * 获取分享规则列表
   */
  SHARE_GET_LIST_SUCCESS(38000, "获取列表成功"),
  /**
   * 添加分享记录成功
   */
  SHARE_RECORD_ADD_SUCCESS(39000, "添加分享记录成功"),
  /**
   * 添加分享记录失败
   */
  SHARE_RECORD_ADD_ERROR(39001, "添加分享记录失败"),

  /**
   * 获取检测信息成功
   */
  STARTUP_SUCCESS(40000, "获取检测信息成功"),
  /**
   * 获取检测信息出错
   */
  STARTUP_FAILED(40001, "获取检测信息出错"),

  /**
   * 获取公告列表成功
   */
  NOTIFY_LIST_SUCCESS(41000, "获取列表成功"),
  /**
   * 获取公告列表为空
   */
  NOTIFY_LIST_EMPTY(41001, "获取列表为空"),
  /**
   * 获取公告列表出错
   */
  NOTIFY_LIST_FAILED(41002, "获取列表出错"),
  /**
   * 获取策略信息成功
   */
  STRATEGY_DETAIL_VIEW_SUCCESS(42000, "获取策略信息成功"),
  /**
   * 策略不存在
   */
  STRATEGY_DETAIL_VIEW_NOTEXIST(42001, "策略不存在"),
  /**
   * 止盈止损设置成功
   */
  STRATEGY_TPSL_SUCCESS(43000, "修改止赢止损成功！"),
  /**
   * 止盈止损设置失败
   */
  STRATEGY_TPSL_FAIL(43001, "修改止盈止损失败！"),
  /**
   * 止损参数必须在1到100之间
   */
  STRATEGY_TPSL_SL_INTERVAL(43002, "止损值为入1~100的整数，请重新输入！"),
  /**
   * 止盈参数必须在1到100之间
   */
  STRATEGY_TPSL_TP_INTERVAL(43003, "止赢值为入1~1000的整数，请重新输入！"),
  /**
   * 已撤投，不允许再设置止盈止损！
   */
  STRATEGY_TPSL_OVER(43004, "修改失败，您的策略已被撤投！"),
  /**
   * 参数非法
   */
  STRATEGY_TPSL_PARAM(43005, "修改失败，请重新设置！"),
  /**
   * 我的跟投成功
   */
  STRATEGY_FOLLOW_SUCCESS(50000, "跟投成功"),
  /**
   * 跟投失败
   */
  STRATEGY_FOLLOW_FAILED(50001, "跟投失败"),
  /**
   * 跟投
   */
  STRATEGY_FOLLOW_REPEAT(50002, "跟投中，不允许再次跟投"),

  /**
   * 跟投处理中
   */
  STRATEGY_FOLLOW_PROCESSING(50003, "跟投处理中"),


  /**
   * 止损参数错误
   */
  STRATEGY_FOLLOW_SL_PARAMETER_INTERVAL(50004, "止损参数错误"),
  /**
   * 止盈参数范围错误
   */
  STRATEGY_FOLLOW_SL_INTERVAL(50005, "止损参数必须在1到100之间"),
  /**
   * 止盈参数错误
   */
  STRATEGY_FOLLOW_TP_PARAMETER_INTERVAL(50006, "止盈参数错误"),
  /**
   * 止盈参数范围错误
   */
  STRATEGY_FOLLOW_TP_INTERVAL(50007, "止盈参数必须在1到1000之间"),
  /**
   * 跟投金额参数错误
   */
  STRATEGY_FOLLOW_JOINAMOUNT_PARAMETER_INTERVAL(50008, "跟投金额参数错误"),
  /**
   * 跟投金额范围错误
   */
  STRATEGY_FOLLOW_JOINAMOUNT_INTERVAL(50009, "跟投金额必须在1000到100000000之间"),
  /**
   * 跟投支付错误
   */
  STRATEGY_FOLLOW_PAYMENT_INTERVAL(50010, "支付密码错误"),

  /**
   * 跟投中，不能再次跟投
   */
  STRATEGY_FOLLOW_CURRENT(50011, "跟投中，不能再次跟投"),

  /**
   * 策略关闭，不能跟投
   */
  STRATEGY_FOLLOW_CLOSED(50012, "策略关闭，不能跟投"),

  /**
   * 已达到最大跟投人数，不能跟投
   */
  STRATEGY_FOLLOW_MAX(50013, "已达到最大跟投人数，不能跟投"),

  /**
   * 余额不足
   */
  STRATEGY_FOLLOW_NOT_ENOUGH(50014, "余额不足"),

  /**
   * 跟投并发
   */
  STRATEGY_FOLLOW_CONCURRENT(50015, "同一时间，用户对同一策略重复多次跟投"),
  /**
   * 查看我的跟投列表
   */
  MY_STRATEGY_FOLLOW_SUCCESS(51000, "查询我的跟投列表成功"),
  /**
   * 查看我的跟投列表
   */
  MY_STRATEGY_FOLLOW_FAIL(51001, "查询我的跟投列表失败"),
  /**
   * 查询我的跟投策略的交易记录
   */
  MY_STRATEGY_FOLLOW_TRADE_SUCCESS(52000, "查询我的跟投策略的交易记录成功"),
  /**
   * 查询我的跟投策略的交易记录
   */
  MY_STRATEGY_FOLLOW_TRADE_FAIL(52001, "查询我的跟投策略的交易记录失败"),
  /**
   * 开放的策略列表
   */
  STRATEGY_LIST_SUCCESS(53000, "查询所有开放策略成功"),
  /**
   * 查询我的跟投策略的交易记录
   */
  STRATEGY_LIST_TRADE_FAIL(53001, "查询所有开发策略失败"),
  /**
   * 查询策略的交易记录成功
   */
  STRATEGY_LIST_TRADE_SUCCESS(54000, "查询策略的交易记录成功"),
  /**
   * 查询策略的交易记录失败
   */
  STRATEGY_LIST_TRADE_TRADE_FAIL(54001, "查询策略的交易记录失败"),

  /**
   * 撤投异常
   */
  STRATEGY_REVOKE_FAIL_9(54999, "撤投异常"),
  /**
   * 撤投成功
   */
  STRATEGY_REVOKE_SUCCESS(55000, "撤投成功"),
  /**
   * 申请撤投的策略不存在或已被撤投
   */
  STRATEGY_REVOKE_FAIL_1(55001, "您申请撤投的策略不存在或已被撤投"),
  /**
   * 不在交易时间段内
   */
  STRATEGY_REVOKE_FAIL_2(55002, "当前为非交易时间段，无法撤投！"),
  /**
   * 剔除DTCH失败
   */
  STRATEGY_REVOKE_FAIL_3(55003, "撤投失败，请重新尝试！"),
  /**
   * slave账户余额清零失败
   */
  STRATEGY_REVOKE_FAIL_4(55004, "撤投失败，请重新尝试！"),
  /**
   * 已经被撤投过了
   */
  STRATEGY_REVOKE_FAIL_5(55005, "您的策略已被撤投！"),
  /**
   * 撤投处理中
   */
  STRATEGY_REVOKE_FAIL_6(55006, "撤投处理中!"),
  /**
   * 获取第三方充值渠道成功
   */
  BANK_CHANNEL_SUCC(61000, "获取第三方充值渠道成功！"),
  /**
   * 获取第三方充值渠道失败
   */
  BANK_CHANNEL_FAIL(61001, "获取第三方充值渠道失败！"),

  /**
   * 获取第三方充值渠道成功
   */
  CARD_BIN_SUCC(61100, "获取卡BIN信息成功！"),
  /**
   * 获取第三方充值渠道失败
   */
  CARD_BIN_FAIL(61101, "获取卡BIN信息失败！"),
  /**
   * 快捷支付下单成功
   */
  HEZHONG_QUICK_PLACE_SUCC(621001, "快捷支付下单成功！"),
  /**
   * 快捷支付下单失败
   */
  HEZHONG_QUICK_PLACE_FAIL(621002, "快捷支付下单失败！"),
  /**
   * 不支持身份证以外证件用户使用合众支付充值，请更换其他充值方式
   */
  HEZHONG_QUICK_PLACE_ID_TYPE_ERROR(621003, "不支持身份证以外证件用户使用合众支付充值，请更换其他充值方式！"),
  /**
   * 快捷支付下发短信成功
   */
  HEZHONG_QUICK_SMS_SUCC(622001, "快捷支付下发短信成功！"),
  /**
   * 快捷支付下发短信失败
   */
  HEZHONG_QUICK_SMS_FAIL(622002, "快捷支付下发短信失败！"),
  /**
   * 快捷支付下发短信手机号为空
   */
  HEZHONG_QUICK_SMS_PHONE_NULL(622003, "快捷支付下发短信手机号为空！"),
  /**
   * 获取快捷支付银行卡信息成功
   */
  HEZHONG_QUICK_BANK_SUCC(623001, "获取快捷支付银行卡信息成功！"),
  /**
   * 获取快捷支付银行卡信息失败
   */
  HEZHONG_QUICK_BANK_FAIL(623002, "获取快捷支付银行卡信息失败！"),
  /**
   * 删除银行卡信息成功
   */
  HEZHONG_QUICK_DEL_BANK_SUCC(624001, "删除银行卡信息成功！"),
  /**
   * 删除银行卡信息失败
   */
  HEZHONG_QUICK_DEL_BANK_FAIL(624002, "删除银行卡信息失败！"),
  /**
   * 不存在删除的银行卡
   */
  HEZHONG_QUICK_DEL_BANK_NOT_EXIST(624003, "删除银行卡不存在！"),
  /**
   * 充值成功
   */
  HEZHONG_QUICK_CONFIRM_SUCC(625001, "充值成功！"),
  /**
   * 充值失败
   */
  HEZHONG_QUICK_CONFIRM_FAIL(625002, "充值失败！"),
  /**
   * 充值处理中
   */
  HEZHONG_QUICK_CONFIRM_ING(625003, "充值处理中，请稍后在“我的大象”中核对充值到账情况。"),
  /**
   * 银行卡号异常
   */
  HEZHONG_QUICK_CONFIRM_BANK_FAIL(625004, "银行卡号异常！"),
  /**
   * 验证码发送次数超限，充值失败
   */
  HEZHONG_QUICK_CONFIRM_BANK_FAIL1(625005, "验证码发送次数超限，充值失败！"),
  /**
   * 验证码过期，充值失败
   */
  HEZHONG_QUICK_CONFIRM_BANK_FAIL2(625006, "验证码过期，充值失败！"),
  /**
   * 验证码错误次数超限，充值失败
   */
  HEZHONG_QUICK_CONFIRM_BANK_FAIL3(625007, "验证码错误次数超限，充值失败！"),
  /**
   * 验证码有误，充值失败
   */
  HEZHONG_QUICK_CONFIRM_BANK_FAIL4(625008, "验证码有误，充值失败！"),
  /**
   * 该交易只支持借记卡，充值失败
   */
  HEZHONG_QUICK_CONFIRM_BANK_FAIL5(625009, "该交易只支持借记卡，充值失败！"),
  /**
   * 您未获取短信验证码，请先发送短信验证码
   */
  HEZHONG_QUICK_CONFIRM_NOT_SMS(625010, "您未获取短信验证码，请先发送短信验证码！"),
  /**
   * 不支持此类型卡充值，请使用借记卡充值
   */
  HEZHONG_QUICK_CONFIRM_NOT_BANK_TYPE(625011, "不支持此类型卡充值，请使用借记卡充值！"),
  /**
   * 手机号码有误，请使用银行预留的手机号码支付
   */
  HEZHONG_QUICK_CONFIRM_DIFF_PHONE_BANK(625012, "手机号码有误，请使用银行预留的手机号码支付！"),
  /**
   * 扫码成功
   */
  QR_LONIN_GET_SUCCESS(630001, "扫码成功！"),
  /**
   * 扫码失败
   */
  QR_LONIN_GET_FAIL(630002, "扫码失败！"),
  /**
   * 扫码成功
   */
  QR_LONIN_CONFIRM_SUCCESS(631001, "扫码登录成功！"),
  /**
   * 扫码失败
   */
  QR_LONIN_CONFIRM_FAIL(631002, "扫码登录失败！"),
  /**
   * 下单成功
   */
  BFB_QUICK_PAY_SUCCESS(632001, "下单成功！"),
  /**
   * 下单失败
   */
  BFB_QUICK_PAY_FAIL(632002, "下单失败！"),
  /**
   * 不支持身份证以外证件用户使用邦付宝支付充值，请更换其他充值方式
   */
  BFB_QUICK_PAY_IDENTITY_FAIL(632003, "不支持身份证以外证件用户使用邦付宝支付充值，请更换其他充值方式！"),
  /**
   * 验证码发送频率过高，请稍后重试
   */
  BFB_QUICK_PAY_SMS_VERTOP(632004, "验证码发送频率过高，请稍后重试"),
  /**
   * 银行预留手机号有误
   */
  BFB_QUICK_PAY_SMS_PHONE_ERROR(632005, "银行预留手机号有误"),
  /**
   * 手机号或银行卡为空
   */
  BFB_QUICK_PAY_SMS_NULL(632006, "手机号或银行卡为空"),
  /**
   * 支付成功！
   */
  BFB_QUICK_PAY_CONFIRM_SUCCESS(633000, "支付成功！"),
  /**
   * 支付处理中！
   */
  BFB_QUICK_PAY_CONFIRM_HANDING(633001, "支付处理中！"),
  /**
   * 支付失败！
   */
  BFB_QUICK_PAY_CONFIRM_FAIL(633002, "支付失败！"),
  /**
   * 充值失败，单卡超过当日累计支付限额！
   */
  BFB_QUICK_PAY_CONFIRM_FAIL1(634001, "充值失败，单卡超过当日累计支付限额！"),
  /**
   * 充值失败，卡片异常，请核实或更换卡！
   */
  BFB_QUICK_PAY_CONFIRM_FAIL2(634002, "充值失败，卡片异常，请核实或更换卡！"),
  /**
   * 充值失败，不支持该卡交易
   */
  BFB_QUICK_PAY_CONFIRM_FAIL3(634003, " 充值失败，不支持该卡交易！"),
  /**
   * 充值失败，卡片异常，请核实或更换卡
   */
  BFB_QUICK_PAY_CONFIRM_FAIL4(634004, "充值失败，卡片异常，请核实或更换卡"),
  /**
   * 充值失败，银行预留手机号错误
   */
  BFB_QUICK_PAY_CONFIRM_FAIL5(634005, "充值失败，银行预留手机号错误"),
  /**
   * 充值失败，交易超限，请联系发卡银行
   */
  BFB_QUICK_PAY_CONFIRM_FAIL6(634006, " 充值失败，交易超限，请联系发卡银行"),
  /**
   * 充值失败，卡片异常，请核实或更换卡
   */
  BFB_QUICK_PAY_CONFIRM_FAIL7(634007, "充值失败，卡片异常，请核实或更换卡"),
  /**
   * 充值失败，可用余额不足，请联系发卡银行
   */
  BFB_QUICK_PAY_CONFIRM_FAIL8(634008, "充值失败，可用余额不足，请联系发卡银行"),
  /**
   * 充值失败，卡片异常，请核实或更换卡
   */
  BFB_QUICK_PAY_CONFIRM_FAIL9(634009, "充值失败，卡片异常，请核实或更换卡"),
  /**
   * 充值失败，短信验证码错误
   */
  BFB_QUICK_PAY_CONFIRM_FAIL10(634010, "充值失败，短信验证码错误"),
  /**
   * 充值失败，身份证、姓名或银行预留手机号有误
   */
  BFB_QUICK_PAY_CONFIRM_FAIL11(634011, "充值失败，身份证、姓名或银行预留手机号有误"),
  /**
   * 该卡为信用卡，请用储蓄卡支付
   */
  BFB_QUICK_PAY_CONFIRM_FAIL12(634012, "该卡为信用卡，请用储蓄卡支付"),
  /**
   * 充值失败，短信验证码过期
   */
  BFB_QUICK_PAY_CONFIRM_FAIL13(634013, "充值失败，短信验证码过期"),
  /**
   * 充值失败，短信验证码校验次数过多
   */
  BFB_QUICK_PAY_CONFIRM_FAIL14(634014, "充值失败，短信验证码校验次数过多"),
  /**
   * 充值失败，不支持该卡交易
   */
  BFB_QUICK_PAY_CONFIRM_FAIL15(634015, "充值失败，不支持该卡交易"),
  /**
   * 获取验证码失败
   */
  BFB_QUICK_PAY_CONFIRM_FAIL16(634016, "获取验证码失败"),
  /**
   * 查询成功
   */
  JIU_PAI_CARD_INFO_SUCC(640001, "查询成功"),
  /**
   * 查询失败
   */
  JIU_PAI_CARD_INFO_FAIL(640002, "查询失败"),
  /**
   * 无此卡信息
   */
  JIU_PAI_CARD_INFO_NOT_FUND(640003, "无此卡信息"),
  /**
   * 不支持此卡
   */
  JIU_PAI_CARD_INFO_CREDIT_CARD(640004, "不支持此银行卡，请更换"),
  /**
   * 无此卡信息
   */
  JIU_PAI_CARD_INFO_NOT_APPLY(640005, "不支持此卡充值"),
  /**
   * 下单成功
   */
  JIU_PAI_QUICK_INIT_SUCC(641001, "下单成功！"),
  /**
   * 下单失败
   */
  JIU_PAI_QUICK_INIT_FAIL(641002, "下单失败！"),
  /**
   * 无不支持身份证以外证件用户使用九派支付充值，请更换其他充值方式
   */
  JIU_PAI_QUICK_INIT_ERROR3(641003, "不支持身份证以外证件用户使用九派支付充值，请更换其他充值方式！"),
  /**
   * 短信发送成功
   */
  JIU_PAI_SMS_SUCC(642001, "短信发送成功"),
  /**
   * 短信发送成功
   */
  JIU_PAI_SMS_FAIL(642002, "短信发送失败"),
  /**
   * 九派绑卡失败
   */
  JIU_PAI_RPMBINDCARD_ERROR(641004, "验证失败，请核实身份及银行卡信息"),
  /**
   * 九派绑卡成功
   */
  JIU_PAI_RPMUNBINDCARD_SUCCESS(641005, "解绑成功！"),
  /**
   * 九派解绑卡 已解绑
   */
  JIU_PAI_RPMUNBINDCARD_EXIST(641006, "此卡已解绑，请勿重复解绑！"),
  /**
   * 九派解绑卡 协议号不存在
   */
  JIU_PAI_RPMUNBINDCARD_NOTEXIST(641007, "协议号不存在！"),
  /**
   * 九派解绑失败
   */
  JIU_PAI_RPMUNBINDCARD_ERROR(641008, "解绑失败！"),
  /**
   * 短信发送间隔不得小于一分钟，请稍后重试
   */
  JIU_PAI_RPMBINDCARD_SMS_ERROR(641009, "短信发送间隔不得小于一分钟，请稍后重试"),
  /**
   * 限额数据获取成功
   */
  QUICK_LIMIT_SUCCESS(643001, "限额数据获取成功！"),
  /**
   * 限额数据获取失败
   */
  QUICK_LIMIT_ERROR(643002, "限额数据获取失败！"),
  /**
   * 确认支付成功
   */
  JIU_PAI_CONFIRM_SUCCESS(644001, "充值处理中，请稍后在“我的大象”中核对充值到账情况。"),
  /**
   * 确认支付失败
   */
  JIU_PAI_CONFIRM_ERROR(644002, "确认支付失败！"),
  /**
   * 确认支付处理中
   */
  JIU_PAI_CONFIRM_HANDING(644003, "确认支付处理中！"),
  JIU_PAI_IPS00010(654001, "充值失败，重复交易"),
  JIU_PAI_IPS00011(654002, "短信下发失败，请稍后重试"),
  JIU_PAI_IPS00015(654003, "充值处理中"),
  JIU_PAI_IPS00016(654004, "短信验证码发送频繁，请稍后重试"),
  JIU_PAI_IPS00018(654005, "充值失败，短信验证码已过期"),
  JIU_PAI_IPS03004(654006, "充值失败，短信验证码错误"),
  JIU_PAI_IPS05000(654007, "充值失败，余额不足"),
  JIU_PAI_IPS05001(654008, "充值失败，日累计限额超限"),
  JIU_PAI_IPS05004(654009, "充值失败，月累计限额超限"),
  JIU_PAI_IPS05007(654010, "充值失败，卡片异常，请核实或更换卡"),
  JIU_PAI_IPS05009(654011, "充值失败，日累计限额超限"),
  JIU_PAI_IPS05010(654012, "充值失败，月累计限额超限"),
  JIU_PAI_IPS05014(654013, "充值失败，卡片异常，请核实或更换卡"),
  JIU_PAI_IPS05016(654014, "银行预留手机号错误，请核实"),
  JIU_PAI_IPS05017(654015, "与在发卡行登记的证件类型不匹配，请核实"),
  JIU_PAI_IPS05018(654016, "未签约网银或手机银行，或未开通快捷支付，请核实"),
  JIU_PAI_IPS05020(654017, "证件信息不符，请核实"),
  JIU_PAI_IPS05021(654018, "不支持此银行"),
  JIU_PAI_IPS05023(654019, "充值失败，银行卡未签约或已解绑，请核实或更换卡"),
  JIU_PAI_IPS05024(654020, "充值失败，卡片异常，请核实或更换卡"),
  JIU_PAI_IPS05025(654021, "银行预留手机号错误，请核实"),
  // 九派绑卡
  JIU_PAI_BIND_SUCC(655001, "绑卡成功"),
  JIU_PAI_BIND_ERROR(655002, "绑卡失败"),
  // 易宝支付
  YEE_BAO_FIRST_PAY_SUCC(670000, "下单成功"),
  YEE_BAO_IDENTITY_FAIL(670001, "不支持身份证以外证件用户使用易宝支付充值，请更换其他充值方式！"),
  YEE_BAO_FIRST_PAY_FAIL(670002, "下单失败"),
  YEE_BAO_FIRST_PAY_CARD_1(670003, "未匹配到此卡信息"),
  YEE_BAO_FIRST_PAY_CARD_2(670004, "不支持信用卡"),
  YEE_BAO_FIRST_PAY_CARD_3(670005, "不支持此银行卡，请更换"),
  YEE_BAO_FIRST_PAY_FAIL2(670006, "验证码发送频繁，请一分钟后重试"),
  YEE_BAO_CONFIRM_SUCCESS(680000, "充值处理中，请稍后在“我的大象”中核对充值到账情况。"),
  YEE_BAO_CONFIRM_FAIL(680001, "确认支付失败。"),
  YEE_BAO_QUICK_SMS_SUCCESS(681000, "重发短信成功。"),
  YEE_BAO_QUICK_SMS_FAIL(681001, "重发短信失败。"),
  YEE_BAO_TZ2010012(688001, "短信验证码错误"),
  YEE_BAO_TZ2010013(688002, "充值失败，短信验证码发送次数超限"),
  YEE_BAO_TZ2010014(688003, "短信验证码发送失败，请稍后重试"),
  YEE_BAO_TZ2010015(688004, "短信验证码过期"),
  YEE_BAO_TZ2010017(688005, "充值失败，该卡不支持无卡支付"),
  YEE_BAO_TZ2010018(688006, "充值失败，该卡超过商户限额"),
  YEE_BAO_TZ2010019(688007, "充值失败，该客户号已关闭快速支付"),
  YEE_BAO_TZ2010020(688008, "充值失败，交易超限"),
  YEE_BAO_TZ2010023(688009, "充值失败，卡信息或银行预留手机号有误"),
  YEE_BAO_TZ2010024(688010, "充值失败，卡片异常，请核实或更换卡"),
  YEE_BAO_TZ2010025(688011, "充值失败，卡片异常，请核实或更换卡"),
  YEE_BAO_TZ2010026(688012, "充值失败，卡种不支持"),
  YEE_BAO_TZ2010027(688013, "充值失败，余额不足"),
  YEE_BAO_TZ2010050(688014, "一分钟内同一手机号校验过频繁，请稍后重试"),
  YEE_BAO_TZ2010051(688015, "处理中"),
  YEE_BAO_TZ2010052(688016, "充值失败，卡片异常，请核实或更换卡"),
  YEE_BAO_TZ2010054(688017, "充值失败，卡信息或银行预留手机号有误"),
  YEE_BAO_TZ2010055(688018, "充值失败，余额不足"),
  YEE_BAO_TZ2010056(688019, "充值失败，卡信息或银行预留手机号有误"),
  YEE_BAO_TZ2010063(688020, "验证码发送频率限制，请稍后重试"),
  YEE_BAO_TZ1001006(688021, "发送短信验证码频率过高，请稍后重试"),
  YEE_BAO_TZ1001007(688022, "验证同一个验证码次数超限，请重新获取新的验证码"),
  YEE_BAO_TZ1001008(688023, "短信验证码错误"),
  YEE_BAO_TZ1001011(688024, "短信发送次数超限"),
  YEE_BAO_TZ1001012(688025, "验证码已过期，请重新获取"),
  YEE_BAO_TZ1001033(688026, "充值失败，卡信息或银行预留手机号有误"),
  YEE_BAO_TZ1001034(688027, "充值失败，卡信息或银行预留手机号有误"),
  YEE_BAO_TZ1001035(688028, "充值失败，卡片异常，请核实或更换卡"),
  YEE_BAO_TZ1001036(688029, "充值失败，不支持此银行卡"),
  YEE_BAO_TZ1001037(688030, "充值失败，银行卡未开通银联在线支付业务，请核实或更换卡"),
  YEE_BAO_TZ1001038(688031, "充值失败，卡信息或银行预留手机号有误"),
  YEE_BAO_TZ1001039(688032, "充值失败，卡信息或银行预留手机号有误"),
  YEE_BAO_TZ1001040(688033, "充值失败，卡信息或银行预留手机号有误"),
  YEE_BAO_TZ2010065(688034, "充值失败，超过支持的支付限额"),
  YEE_BAO_TZ2010066(688035, "充值失败，卡信息或银行预留手机号有误"),
  YEE_BAO_TZ2010067(688036, "充值失败，卡片异常，请核实或更换卡"),
  YEE_BAO_TZ2010068(688037, "充值失败，银行卡未开通银联无卡业务，请核实或更换卡"),
  YEE_BAO_TZ2010075(688038, "充值失败，卡片异常，请核实或更换卡"),
  YEE_BAO_TZ2010076(688039, "充值失败，请稍后重试或换卡支付"),
  YEE_BAO_TZ1001044(688040, "绑卡次数受限，请换卡支付"),
  ADVERTISEMENT_SUCCESS(690001, "获取广告数据成功"),
  ADVERTISEMENT_ERROR(690002, "获取广告数据失败"),
  OFFLINE_SUCCESS(720001, "获取转账信息成功"),
  OFFLINE_ERROR(720002, "获取转账信息失败"),
  RED_BAG_SUCCESS(699000, "获取红包信息成功"),
  RED_BAG_FAIL(699001, "获取红包信息失败"),
  INTEREST_SUCCESS(710001, "获取加息券列表成功"),
  INTEREST_ERROR(710002, "获取加息券列表失败"),
  REDANDINTEREST_SUCCESS(710050, "获取红包和加息券列表成功"),
  USER_SHARE_REGISTER_SUCCESS(730001, "获取我的推广成功"),
  REPEAT(740000, "重复提交"),
  XIAO_MI_CONTRACT_SMS_SUCCESS(790001, "发送成功"),
  XIAO_MI_CONTRACT_SMS_FAIL(790002, "发送短信失败，请稍后重试"),
  XIAO_MI_CONTRACT_SMS_FAIL1(790003, "目前只支持借记卡"),
  XIAO_MI_CONTRACT_SMS_FAIL2(790004, "验证短信验证码失败"),
  XIAO_MI_CONTRACT_SUCCESS(790101, "签约成功"),
  XIAO_MI_CONTRACT_FAIL(790102, "绑卡失败"),
  XIAO_MI_CONTRACT_EXCEPTION(790103, "请重新发送短信"),
  XIAO_MI_CONTRACT_EXIST(790104, "此卡号已签约"),
  XIAO_MI_CONTRACT_ORDER_NULL(790105, "订单号不能为空"),
  XIAO_MI_CONTRACT_SMSCODE_NULL(790106, "短信验证码不能为空"),
  XIAO_MI_CONTRACT_ERROR1(790107, "目前只支持借记卡"),
  XIAO_MI_CONTRACT_ERROR2(790108, "校验姓名不匹配"),
  XIAO_MI_CONTRACT_ERROR3(790109, "校验证件不匹配"),
  XIAO_MI_CONTRACT_ERROR4(790110, "校验手机号不匹配"),
  XIAO_MI_CONTRACT_ERROR5(790111, "错误的验证码"),
  XIAO_MI_CONTRACT_ERROR6(790112, "验证短验失败"),
  XIAO_MI_PAY_SMS_SUCCESS(790201, "发送成功"),
  XIAO_MI_PAY_SMS_FAIL(790202, "发送失败"),
  XIAO_MI_PAY_SMS_FAIL1(790203, "银行卡不可用"),
  XIAO_MI_PAY_SUCCESS(790301, "充值处理中，请稍后在“我的大象”中核对充值到账情况。"),
  XIAO_MI_PAY_FAIL(790302, "充值失败"),
  XIAO_MI_PAY_FAIL1(790303, "银行卡不可用"),
  XIAO_MI_PAY_FAIL2(790304, "充值失败，校验验证码失败超过三次"),
  XIAO_MI_PAY_FAIL3(790305, "验证短信验证码失败"),
  TONGL_CONTRACT_SUCCESS(801000, "成功"),
  TONGL_CONTRACT_ERROR1(801001, "绑定失败，请重试"),
  TONGL_CONTRACT_ERROR2(801002, "卡号错误"),
  TONGL_CONTRACT_ERROR3(801003, "卡号已绑定，请勿重复绑定"),
  TONGL_CONTRACTSMS_SUCCESS(801100, "成功"),
  TONGL_CONTRACTSMS_ERROR1(801101, "签约短信发送失败"),
  TONGL_CONTRACT_CONFIRM_SUCCESS(801200, "充值银行卡绑定成功"),
  TONGL_CONTRACT_CONFIRM_ERROR1(801201, "绑定失败，请重试"),
  TONGL_CONTRACT_CONFIRM_ERROR2(801202, "卡号已绑定过"),
  TONGL_CONTRACT_CONFIRM_ERROR3(801203, "短信验证码错误"),
  TONGL_CONTRACT_CONFIRM_ERROR4(801204, "请重新获取验证码"),
  TONGL_CONTRACT_CONFIRM_ERROR5(801205, "绑定失败，请重试"),
  TONGL_CONTRACT_CONFIRM_ERROR6(801206, "卡号错误"),
  TONGL_PAY_SUCCESS(802100, "成功"),
  TONGL_PAY_ERROR1(802101, "支付失败"),
  TONGL_PAY_ERROR2(802103, "跳转到发送短信验证码"),
  TONGL_PAY_ERROR3(802104, "交易处理中"),
  TONGL_PAYSMS_SUCCESS(802200, "成功"),
  TONGL_PAYSMS_ERROR1(802201, "下单短信发送失败"),
  TONGL_PAY_CONFIRM_SUCCESS(802300, "充值处理中，请稍后在“我的大象”中核对充值到账情况。"),
  TONGL_PAY_CONFIRM_ERROR1(802301, "支付失败"),
  USER_INTEGRAL_QUERY_SUCCESS(802303, "查询用户积分明细记录成功"),
  USER_INTEGRAL_SIGNIN_SUCCESS(802304, "用户签到成功"),
  USER_INTEGRAL_SIGNIN_QUERY_SUCCESS(802305, "查询用户签到信息成功"),
  USER_INTEGRAL_SIGNIN_QUERY_FAIL(802306, "查询用户签到信息失败"),
  USER_INTEGRAL_SIGNIN_FAIL(802307, "用户签到失败"),
  USER_INTEGRAL_QUERY_FAIL(802308, "查询用户积分明细记录失败"),
  USER_INTEGRAL_SIGNIN_ERROR(802309,"用户签到redis数据为空"),
  USER_INTEGRAL_CHARGE_QUERY_SUCCESS(900001, "积分兑换查询成功"),
  USER_INTEGRAL_CHARGE_RESULT_SUCCESS(900101, "积分兑换成功"),
  USER_INTEGRAL_CHARGE_RESULT_ERROR1(900102, "积分不足"),
  USER_INTEGRAL_GETLOTTERYLIST_SUCCESS(902001, "查询成功");


  private int retCode;
  private String retMsg;

  private EnumRetCode(int retCode, String retMsg) {
    this.retCode = retCode;
    this.retMsg = retMsg;
  }

  public int retCodeVal() {
    return this.retCode;
  }

  public String retMsgVal() {
    return this.retMsg;
  }

  public void setRetCode(int retCode) {
    this.retCode = retCode;
  }

  public void setRetMsg(String retMsg) {
    this.retMsg = retMsg;
  }
}
