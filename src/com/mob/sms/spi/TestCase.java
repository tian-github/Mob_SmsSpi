package com.mob.sms.spi;

import com.mob.sms.utils.MobClient;

/**
 * 
 * 测试
 * @author Administrator
 */
public class TestCase {

	public static void main(String[] args) throws Exception {

		String result = status();
//		String result = smsVerify();
//		String result = sendMsg();
//		String result = checkcode();
		System.out.println(result);
		
	}
	
	/**
	 * 服务端发起验证请求验证移动端(手机)发送的短信
	 * @return
	 * @throws Exception
	 */
	public static String smsVerify() throws Exception{
		
		String address = "https://xxxx";
		String appkey = "xxxx";
		String phone = "xxxx";
		String zone = "86";
		String code = "1234";
		MobClient client = null;
		try {
			client = new MobClient(address);
			client.addParam("appkey", appkey).addParam("phone", phone)
					.addParam("zone", zone).addParam("code", code);
			client.addRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
			client.addRequestProperty("Accept", "application/json");
			String result = client.post();
			return result;
		} finally {
			client.release();
		}
	}
	
	
	/**
	 * 服务端发起发送短信请求
	 * @return
	 * @throws Exception
	 */
	public static String sendMsg() throws Exception{
		
		String address = "https://xxxx";
		String appkey = "xx";
		String phone = "xx";
		String zone = "86";
		MobClient client = null;
		try {
			client = new MobClient(address);
			client.addParam("appkey", appkey).addParam("phone", phone)
					.addParam("zone", zone);
			client.addRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
			client.addRequestProperty("Accept", "application/json");
			String result = client.post();
			return result;
		} finally {
			client.release();
		}
	}
	
	/**
	 * 服务端发验证服务端发送的短信
	 * @return
	 * @throws Exception
	 */
	public static String checkcode() throws Exception{
		
		String address = "https://xxxx";
		String appkey = "xx";
		String phone = "xx";
		String zone = "86";
		String code = "6408";
		MobClient client = null;
		try {
			client = new MobClient(address);
			client.addParam("appkey", appkey).addParam("phone", phone)
					.addParam("zone", zone).addParam("code", code);
			client.addRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
			client.addRequestProperty("Accept", "application/json");
			String result = client.post();
			return result;
		} finally {
			client.release();
		}
	}
	
	
	/**
	 * 服务端运行状态
	 * @return
	 * @throws Exception
	 */
	public static String status() throws Exception{
		
		String address = "https://xxxx";
		MobClient client = null;
		try {
			client = new MobClient(address);
			client.addRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
			client.addRequestProperty("Accept", "application/json");
			String result = client.post();
			return result;
		} finally {
			client.release();
		}
	}
	
	
}
