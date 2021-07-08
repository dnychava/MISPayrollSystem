package com.ikaustubh.mispayrollsystem.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value = "/master/data", produces = MediaType.APPLICATION_JSON_VALUE)
public class MasterDataController extends BaseController {/*


	@GetMapping(value = "/allUnitData")
	public ResponseEntity<List<FMRReportDataDTO>> getAllUnitData() {
		
		
		return null;
	}
	

*/}
