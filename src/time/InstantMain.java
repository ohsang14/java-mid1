package time;

import java.time.Instant;
import java.time.ZonedDateTime;

// 기계 중심의 시간 - Instant
public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now(); // UTC 기준  영국 기준 -9 시간
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0); // Instant 시작 시간 1970년 1월 1일
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);
        
        // 조회
        long LaterEpochSecond = later.getEpochSecond();
        System.out.println("LaterEpochSecond = " + LaterEpochSecond);
    }
}
