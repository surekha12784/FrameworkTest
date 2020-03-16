package com.qa.base;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class test2 {

	@Test(dataProvider = "MyData")
	public void getRequest(String str) throws ClientProtocolException,
			IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet req = new HttpGet(str);
		HttpResponse res = client.execute(req);
		System.out.println(res);

	}

	@Test(dataProvider = "MyData1")
	public void postRequest(String s, String p) throws ClientProtocolException,
			IOException {

		HttpClient client = HttpClientBuilder.create().build();
		HttpPost req = new HttpPost(s);
		StringEntity strent = new StringEntity(p);
		req.setEntity(strent);
		HttpResponse res = client.execute(req);
		System.out.println(res);

	}

	@DataProvider(name = "MyData1")
	public String[][] test12() {
		String[][] st = new String[1][2];

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j <= 1; j++) {

				if (i == 0 && j == 0) {
					st[0][0] = "http://dummy.restapiexample.com/api/v1/create";
					System.out.println(st[i][j]);
				}
				if (i == 0 && j == 1) {

					st[0][1] = "{\r\n"
							+ "\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
				}

			}
		}

		return st;

	}

	@DataProvider(name = "MyData")
	public String[][] test11() {
		String[][] st = new String[1][1];

		st[0][0] = "https://samples.openweathermap.org/data/2.5/weather?zip=94555,us&appid=b6907d289e10d714a6e88b30761fae22";

		return st;

	}

}
