package com.yonyou.cfcloud;

import java.util.HashMap;

import com.yonyou.cfcloud.cmd.LonginCommand;

public class Commands {
	
	private HashMap<String ,Command> commandlist = new HashMap<String ,Command>();
	
	private static Commands commands ;
	
	Commands(){
		commandlist.put("login", new LonginCommand());
	}
	
	public static Commands getInstance(){
		if(commands!=null){			
		}else{
			commands = new Commands();
		}
		return commands;
		
		
	}
	
	public static Command getCommand(String cmd){
		return getInstance().commandlist.get(cmd);
	}
	
}
