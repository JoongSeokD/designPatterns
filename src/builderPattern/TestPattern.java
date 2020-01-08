package builderPattern;

import java.time.LocalDate;
import java.time.Month;

public class TestPattern {
	public static void main(String[] args) {
		Person p1 = Person.builder()
				.firstName("FirstName")
				.lastName("LastName")
				.addressOne("±ÝÃµ±¸")
				.addressTwo("AddrTwo")
				.birthDate(LocalDate.of(1995, Month.APRIL, 13))
				.build();
		
		System.out.println(p1.getAddressOne());
	
	}
}
