package SeleniumTestersPrograms;

import java.util.Random;

public class RandomNumberAndString {
  	public static void main(String[] args) {
    double randInt=Math.random()*1000;
		System.out.println(randInt);
		StringBuilder buffer = new StringBuilder(10);
		Random random=new Random();
		for(int i=0;i<4;i++) {
			int upperChar=(int)('A')+(int)(random.nextFloat()*((int)('Z')-(int)('A')+1));
			int lowerChar=(int)('a')+(int)(random.nextFloat()*((int)('z')-(int)('a')+1));
			buffer.append((char)upperChar).append((char)lowerChar);
		}
		System.out.println(buffer.toString());

    }

}
