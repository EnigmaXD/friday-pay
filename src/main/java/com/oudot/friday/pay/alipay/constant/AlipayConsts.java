package com.oudot.friday.pay.alipay.constant;

/**
 * 支付宝工具类常量
 * 
 * @author xuyinghao
 *
 */
public class AlipayConsts {

	/**
	 * {@value}
	 */
	public static final String OUT_TRADE_NO_KEY = "out_trade_no";

	/**
	 * {@value}
	 */
	public static final String TOTAL_AMOUNT_KEY = "total_amount";

	/**
	 * {@value}
	 */
	public static final String SUBJECT_KEY = "subject";

	/**
	 * {@value}
	 */
	public static final String PRODUCT_CODE_KEY = "product_code";

	/**
	 * 产品码：手机网站支付 值为 {@value}
	 */
	public static final String PRODUCT_CODE_QUICK_WAP_WAY = "QUICK_WAP_WAY";

	/**
	 * {@value}
	 */
	public static final String APP_ID_KEY = "app_id";

	/**
	 * {@value}
	 */
	public static final String NOTIFY_CONFIRM_SUCCESS = "success";
	/**
	 * {@value}
	 */
	public static final String NOTIFY_CONFIRM_FAIL = "fail";

	public enum Env {
		/**
		 * 正式网关
		 */
		PRO("https://openapi.alipay.com/gateway.do"),

		/**
		 * 沙盒网关
		 */
		SANDBOX("http://openapi.alipaydev.com/gateway.do");
		private String serverUrl;

		Env(String serverUrl) {
			this.serverUrl = serverUrl;
		}

		public String getServerUrl() {
			return serverUrl;
		}

	}

	public enum SignType {
		/**
		 * RSA
		 */
		RSA("RSA"),
		/**
		 * RSA2
		 */
		RSA2("RSA2");

		private String value;

		SignType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

	}

	public enum TradeStatus {
		/**
		 * 交易创建，等待买家付款
		 */
		WAIT_BUYER_PAY("WAIT_BUYER_PAY"),
		/**
		 * 未付款交易超时关闭，或支付完成后全额退款
		 */
		TRADE_CLOSED("TRADE_CLOSED"),
		/**
		 * 交易支付成功
		 */
		TRADE_SUCCESS("TRADE_SUCCESS"),
		/**
		 * 交易结束，不可退款
		 */
		TRADE_FINISHED("TRADE_FINISHED");

		private String value;

		TradeStatus(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static TradeStatus getByValue(String value) {
			for (TradeStatus tradeStatus : TradeStatus.values()) {
				if (tradeStatus.getValue().equals(value)) {
					return tradeStatus;
				}
			}
			return null;
		}
	}
}
