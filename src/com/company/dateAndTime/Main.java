package com.company.dateAndTime;

import java.math.BigInteger;
import java.time.*;
import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
/*	Map<String, String> map = new HashMap<>();
	map.put("key","testValue");
	System.out.println("key: " + map.get("key"));
	System.out.println("key1: " + new ArrayList<>(Arrays.asList(map.get("key1"))));
	List<String> list = new ArrayList<>(Arrays.asList(map.get("key1")));
	if (list == null) {
		System.out.println("nulllll");
	}*/
//		Map<String, Object> map = new HashMap<>();
//		map.put("key1", true);
//		map.put("key2", "String");
//		map.put("key3", 34534);
//
//		for (Map.Entry<String, Object> entry: map.entrySet()) {
//			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
//		}

//		Map<BigInteger, Object> params = new HashMap<>();
//		List<BigInteger> list = new ArrayList<>();
//		list.add(new BigInteger("345345"));
//		putIfNotNull(params, BigInteger.valueOf(9158749592913675830L), list);
//		putIfNotNull(params, BigInteger.valueOf(9158749592913675830L), list);

/*
		String startDate = "1607344494";
		Date d = new Date(Long.parseLong(startDate) * 1000);
		Calendar date = Calendar.getInstance();
		date.setTime(d);

		//date.set(Calendar.SECOND, Integer.parseInt(startDate));
		printDate(date);


		//startDate = "1"; //"1607344494";
		//date.clear();
		//date.set(Calendar.SECOND, Integer.parseInt(startDate));  //+ 60*60*24
		//date.setTime(new Date(Long.parseLong("1622896494") * 1000));
		date.setTime(new Date((Long.parseLong(startDate) + 60*60*24) * 1000));
		printDate(date);

		LocalDate ld ;
		LocalDateTime ldt = LocalDateTime.ofEpochSecond(Long.parseLong(startDate), 0, ZoneOffset.UTC);
		LocalDateTime ldt2 = LocalDateTime.ofInstant(Instant.ofEpochSecond(Long.parseLong(startDate)), ZoneId.systemDefault());
		System.out.println("date: " + ldt.getYear());
		System.out.println("date: " + (ldt.getMonth().getValue()));
		System.out.println("date: " + ldt.getMonthValue());
		System.out.println("date: " + ldt.getDayOfMonth());
		System.out.println("tz: " + ZoneOffset.systemDefault());
		System.out.println("-----------------------");
		System.out.println("date: " + ldt2.getYear());
		System.out.println("date: " + (ldt2.getMonth().getValue()));
		System.out.println("date: " + ldt2.getDayOfMonth());

    }

    private static void printDate(Calendar date) {
		System.out.println("date: " + date.get(Calendar.YEAR));
		System.out.println("date: " + date.get(Calendar.MONTH));
		System.out.println("date: " + date.get(Calendar.DAY_OF_MONTH));
		System.out.println("tz: " + date.getTimeZone().getDisplayName());
		System.out.println("-----------------------------------");
	}

	private static void putIfNotNull(Map<BigInteger, Object> params, BigInteger key, Object value) {
		if (value != null) {
			params.put(key, value);
		}
	}

 */


		/*Pattern RANGE_PATTERN = Pattern.compile("(\\d+)-(\\d+)");

		List<String> list = new ArrayList<>();
		list.add("3-5");
		list.add("5-");
		list.add("5-a");
		list.add("-4-5");
		list.add("4--5");

		for (String str : list) {
			if (RANGE_PATTERN.matcher(str).matches()) {
				System.out.println("str: " + str + " +++");
			} else {
				System.out.println("str: " + str + " ---");
			}
		}*/

//		String str = "t-e－s−t";
//		String strrr = "\00x00000";
//		System.out.println(strrr);
//		print(str);
//		System.out.println();
//		print(str);

		LocalTime localTime = LocalTime.of(8, 00);
		System.out.println(localTime);
		localTime = localTime.plusHours(20);
		System.out.println(localTime);

		System.out.println(TimeZone.getTimeZone("Europe/Moscow"));
		System.out.println(getWorkHoursInMoscowTZ(null));
		System.out.println(getWorkHoursInMoscowTZ("4"));

	}

	public static final int MOSCOW_TZ = 5;

	public static String getWorkHoursInMoscowTZ(String managerTZ) {
    	if (managerTZ == null || managerTZ.isEmpty()) {
    		return  "с 9:00 до 18:00";
		} else {
			LocalTime startWorkTime = LocalTime.of(9, 0);
			LocalTime finishWorkTime = LocalTime.of(18,0);
			startWorkTime = startWorkTime.minusHours(Integer.parseInt(managerTZ) - MOSCOW_TZ);
			finishWorkTime = finishWorkTime.minusHours(Integer.parseInt(managerTZ) - MOSCOW_TZ);
			return "с " + startWorkTime + " до " + finishWorkTime;
		}
	}

	public static void print (String str) {
		for (int i=0; i<str.length(); i++) {
			System.out.print((int) str.charAt(i));
			System.out.print(",");
		}
	}

	private String convertHyphens(String value) {
		return value.replaceAll("[\u002D\u2212]", "\uFF0D");
	}
}
