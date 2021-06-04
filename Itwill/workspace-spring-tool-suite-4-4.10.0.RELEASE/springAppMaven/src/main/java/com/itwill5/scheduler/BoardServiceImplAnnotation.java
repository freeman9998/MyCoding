package com.itwill5.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImplAnnotation {
	/*
	 * @Scheduled는 리턴 타입이 void이고 파라미터를 갖지 않는 메서드에 적용되며
	 * 스케줄링 설정을 위해 cron, fixedRate, fixedDelay속성을 지정 가능.
	 */
	/*
	 * fixedDelay:최종 종료시간으로부터 지정된 이후 수행 
	 *  ※ 지난프로세스가 종료된 이후
	 * fixedRate:이전 시작시간으로부터 지정된 시간이후 수행 
	 *  ※ 지난프로세스가 종료 되지 않아도 시작된 시간으로 부터
	 */
	@Scheduled(fixedDelay = 1000)  // 매초마다 실행
	public void method1() {
    	System.out.println(">>>> method1...");
    }
	@Scheduled(cron="0/1 * * * * ?")  // 매초마다 실행
    public void method2() {
    	System.out.println(">>>> method2...");
    }
	@Scheduled(cron="0 0 0 * * ?")  //매일 0시마다 한번씩 실행
    public void method3() {
    	System.out.println(">>>> method3...");
    }

}
