import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowiring.Holiday;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanconfig.xml");
		
		
		System.out.println("\n ***The example of autowiring.***");
		
		/*The example of autowiring byName.*/
		
		System.out.println("The example of autowiring byName.");
		Holiday newYear = (Holiday) context.getBean("holiday");
		newYear.playGames();
		
		/*The example of autowiring byType.*/
		
		System.out.println("The example of autowiring byType.");
		Holiday easter = (Holiday) context.getBean("springholiday");
		easter.playGames();
				
		/*The example of autowiring using constructor.*/
		
		System.out.println("The example of autowiring using constructor.");
		Holiday birthday = (Holiday) context.getBean("birthday");
		birthday.playGames();
		
		System.out.println("\n ***The example of annotations with beans defined in .xml .***");
		/*The example of annotations with beans defined in .xml .*/
		ApplicationContext contextA = new ClassPathXmlApplicationContext("beanconfigan.xml");
		annotations.Holiday newYearA = (annotations.Holiday) contextA.getBean("holiday");
		newYearA.playGames();
		annotations.Holiday easterA = (annotations.Holiday) contextA.getBean("springholiday");
		easterA.playGames();
		
		System.out.println("\n ***The example of annotaions without defining beans in .xml.***");
		/*The example of annotaions without defining beans in .xml. */
		ApplicationContext contextAn = new ClassPathXmlApplicationContext("annotconfig.xml");
		annotations.Holiday easterAn = (annotations.Holiday) contextAn.getBean("easter");
		easterAn.playGames();
	}

}
