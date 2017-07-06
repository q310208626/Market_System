package com.lsj.market.action.flower;

import com.opensymphony.xwork2.ActionSupport;

public class ToFlowerDirectionAction extends ActionSupport{
	
	private String direction;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if (direction!=null&&direction.equals("floweradd")) {
			return "floweradd";
		}else if(direction!=null&&direction.equals("flowerinfo")){
			return "flowerinfo";
		}else if(direction!=null&&direction.equals("flowerupdate")){
			return "flowerupdate";
		}else if(direction!=null&&direction.equals("flowercate")){
			return "flowercate";
		}
		else{
			return ERROR;
		}
		
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
	
}
