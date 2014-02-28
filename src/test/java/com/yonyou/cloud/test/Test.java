package com.yonyou.cloud.test;

import java.util.Date;

import com.google.gson.Gson;

public class Test {

	public static void main(String[] args) {
		new Test().testBeadToJSON();
	}
	
	
	class MyBean{
		
		private String id;
		private String name;
		private Date date;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
	}
    public void testBeadToJSON(){
        MyBean bean = new MyBean();
        bean.setId("001");
        bean.setName("ÒøÐÐ¿¨");
        bean.setDate(new Date());
        
        Gson gson = new Gson();
        System.out.println(gson.toJson(bean));
        
    }

}
