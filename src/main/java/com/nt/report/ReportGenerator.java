package com.nt.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenerator {
	/*@Scheduled(initialDelay = 2000,fixedDelay = 3000)
	public void generateReport() {
		System.out.println("Sales Report on::"+new Date());
	}*/
	/*@Scheduled(fixedDelay = 3000)
	public void generateReport(int start, int end) {
		System.out.println("Sales Report on::"+new Date());
	}*/

	// @Scheduled(fixedDelay = 3000)
	/*@Scheduled(fixedDelayString ="3000")
	public void generateReport() {
		System.out.println("Sales Report on::"+new Date());
	}*/
		
	/*@Scheduled(fixedDelayString ="3000")
		public void generateReport() {
			System.out.println("Sales Report on::"+new Date()+" start");
			try {
				Thread.sleep(15000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Sales Report on::"+new Date()+" end");
		}*/
	/*	@Scheduled(fixedDelayString ="3000")
			public void generateReport() {
				System.out.println("Sales Report on::"+new Date()+" start");
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Sales Report on::"+new Date()+" end");
			}
	*/	
	/*	@Scheduled(fixedRate =10000)
		public void generateReport() {
			System.out.println("Sales report on ::"+new Date()+" start");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("Sales Report on::"+new Date()+" end");
		
		}*/
	/*@Scheduled(fixedRate =10000)
	public void generateReport() {
		System.out.println("Sales report on ::"+new Date()+" start");
		try {
			Thread.sleep(15000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Sales Report on::"+new Date()+" end");
	
	}*/
//================================================================
//	@Scheduled(initialDelay = 2000,fixedDelay = 3000)
//	@Scheduled(fixedDelay = 3000)
//	@Scheduled(fixedDelayString = "3000")
	/*@Scheduled(initialDelay = 2000,fixedRate = 3000)
	public void generateSalesReport() {
		System.out.println("thread(task1) name"+Thread.currentThread().getName());
		System.out.println("thread(task1) hashcode"+Thread.currentThread().hashCode());
		System.out.println("Report Data1 on::"+new Date());
	}
	@Scheduled(initialDelay = 2000,fixedDelay = 3000)
	public void generateSalesReport1() {
		System.out.println("thread (task2) name::"+Thread.currentThread().getName());
		System.out.println("thread (task2) hashcode::"+Thread.currentThread().hashCode());
		System.out.println("Report Data2 on::"+new Date());
	}*/
//=====================Crone Expression=========================================
	@Scheduled(cron = "0 5 14 * * *")
	public void generateReport() {
		System.out.println("Sales Report data:::"+new Date());
	}
}