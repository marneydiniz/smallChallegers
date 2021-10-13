package br.com.marney.prova.test;


public class TtimeConversion {

	public static void main(String[] args) {
		// Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
		
		String s = "12:45:54PM";
		String[] hms = s.split(":");
		int h = 0;
		
		if (hms[2].contains("PM")) {
			hms[2] = hms[2].replace("PM", "");
			h = Integer.parseInt(hms[0]);
			h += 12;
			
			if (h == 24) {
				hms[0] = "12";
			} else {
				hms[0] = Integer.toString(h);
			}
			
			System.out.println(hms[0] + ":" + hms[1] + ":" + hms[2]);
			
		} else {
			hms[2] = hms[2].replace("AM", "");
			h = Integer.parseInt(hms[0]);
			h += 12;

			if (h == 24) {
				hms[0] = "00";
			} else {
				h -= 12;
				hms[0] = "0".concat(Integer.toString(h));
			}
			
			
			System.out.println(hms[0] + ":" + hms[1] + ":" + hms[2]);
		}
		
		
	}

}
