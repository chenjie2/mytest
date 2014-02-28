package com.yonyou.cfcloud.cmd;

import java.util.Map;

import com.yonyou.cfcloud.Command;
import com.yonyou.cfcloud.Response;

public class LonginCommand implements Command{

	public Object exec(Map<String, String> paras) {
		return new LoginResponse(true);
	}

	class LoginResponse implements Response{
		
		LoginResponse(boolean result){
			this.result = result;
		}
		
		private boolean result ;

		public boolean isResult() {
			return result;
		}

		public void setResult(boolean result) {
			this.result = result;
		}
	}
	
}
