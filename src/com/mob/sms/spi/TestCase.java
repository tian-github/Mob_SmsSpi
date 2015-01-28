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
		System.out.println(result);
		
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
