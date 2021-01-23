package com.experitest.auto;

import org.junit.Before;
import org.junit.Test;


public class AndroidDemoTest extends BaseTest {

	@Before
	public void setUp() throws Exception{
		init("@os='android'", "AndroidDemoTest");
		client.install("cloud:com.experitest.ExperiBank/.LoginActivity:1.0", true, false);
		client.launch("com.experitest.ExperiBank/.LoginActivity", true, true);

	
	}
	
	@Test
	public void test(){
		client.elementSendText(in.Repo.zone("dum.uname"), in.Repo.element("dum.uname"), 0, "company");
		client.elementSendText(in.Repo.zone("dum.pass"), in.Repo.element("dum.pass"), 0, "company");
		client.click(in.Repo.zone("dum.Login"), in.Repo.element("dum.Login"), 0, 1);
		client.click(in.Repo.zone("home.Logout"), in.Repo.element("home.Logout"), 0, 1);
	}
	
	
}
