package com.ikaustubh.mispayrollsystem.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value = "/report", produces = MediaType.APPLICATION_JSON_VALUE)
public class FMRReportController {/*

	Logger logger = LoggerFactory.getLogger(FMRReportController.class);
	//@Autowired
	private FMRReportHelper fmrReportHelper;

	//@Autowired
	private FMRReportFilterDTO fmrReportFilterDTO;

	@GetMapping(value = "/fmr")
	public ResponseEntity<List<FMRReportDataDTO>> getFMRReport(@RequestParam("unitGroupRid") String unitGroupRid,
			@RequestParam("unitRid") String unitRid, @RequestParam("year") String year,
			@RequestParam("mainProgramHeadRid") String mainProgramHeadRid,
			@RequestParam("reportingMonthStr") String reportingMonthStr) {
		fmrReportFilterDTO.setUnitGroupRid(Long.parseLong(unitGroupRid));
		fmrReportFilterDTO.setUnitRid(Long.parseLong(unitRid));
		fmrReportFilterDTO.setYear(year);
		fmrReportFilterDTO.setMainProgramHeadRid(Long.parseLong(mainProgramHeadRid));
		fmrReportFilterDTO.setReportingMonth(Integer.parseInt(reportingMonthStr));

		return fmrReportHelper.getFMRReport(fmrReportFilterDTO);
	}

	@GetMapping(value = "/getFillterFormData")
	public ResponseEntity<ResponseDTO> getFillterFormData() {
		ResponseDTO respDTO = new ResponseDTO();
		try {
			logger.info(" In fmrReportHelper() method");
			respDTO.setStatus("Success");
			respDTO.setData(fmrReportHelper.getFillterFormData());
			return new ResponseEntity<>(respDTO, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			respDTO.setErrors(e.getMessage());
			return new ResponseEntity<>(respDTO, HttpStatus.BAD_REQUEST);
		}

	}
*/}
