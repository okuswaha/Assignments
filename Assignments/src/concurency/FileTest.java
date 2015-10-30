package concurency;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileTest {
	public static void main(String args[]) throws IOException {
		System.out.println(Week.DAY1.value);
	}
	

}

enum Week {
	DAY1(5),
	DAY2(10),
	DAY3(15);
	int value;
	int value2;
	Week(int value){
		this.value2 = value;
	}
	int getValue(){
		return value;
	}
	enum Shift {
		MORNING(8),
		EVENING(3),
		NIGHT(11);
		int time;
		Shift(int time){
			this.time = time;
		}
		int getTime(){
			return time;
		}
		
	}
}