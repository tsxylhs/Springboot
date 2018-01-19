package com.ZB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ZB.service.ZbuserService;

@RestController
public class ZbUserController {
@Autowired
private ZbuserService zbuserservice;
@RequestMapping(value="/user/insert/{uid}/{upwd}",method=RequestMethod.GET)
public String userinsert(@PathVariable("uid") String uid, @PathVariable("upwd") String upwd){
	return zbuserservice.userinsert(uid,upwd);
	
}

}
