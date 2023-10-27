package com.example.insurance.project.restcontroller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.insurance.project.commonutil.PaymentCommonUtil;
import com.example.insurance.project.service.PaymentModeService;

@RestController
public class PaymentModeController {
	@Autowired
	private PaymentModeService paymentModeService;
	
	@GetMapping(value = "/insurance/paymentDetailspdf")
	public void paymentDetailsReport(HttpServletResponse response) throws IOException {

		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
		String fileType = "attachment; filename=Payment_details_" + dateFormat.format(new Date()) + ".pdf";
		response.setHeader("Content-Disposition", fileType);
		response.setContentType("application/pdf");
		PaymentCommonUtil.paymentDetailReport(response, paymentModeService.getAllpayments());
	}
}
