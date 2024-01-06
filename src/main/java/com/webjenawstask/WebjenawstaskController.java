package com.webjenawstask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/all")
public class WebjenawstaskController {
@GetMapping(value="/ok")
public String getmsg() {
	return "All are okay";
}
}
