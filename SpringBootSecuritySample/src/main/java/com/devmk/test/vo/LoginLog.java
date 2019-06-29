package com.devmk.test.vo;
import lombok.Data;

@Data
public class LoginLog extends Member {
	private String loginIp;
	private String loginDate;

}
