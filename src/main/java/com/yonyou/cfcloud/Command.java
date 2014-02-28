package com.yonyou.cfcloud;

import java.util.Map;

public interface Command {

	Object exec(Map<String,String> paras);
}
