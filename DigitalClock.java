import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock{
	public static void main(String[] args){
		while(true){
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			String time = now.format(formatter);
			System.out.println(time);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}