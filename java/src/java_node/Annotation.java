package java_node;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Annotation {

//	private String name;
//	private Integer age;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Integer getAge() {
//		return age;
//	}
//	public void setAge(Integer age) {
//		this.age = age;
//	}

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@Repeatable(Filters.class)

	public @interface Filter {
		String value();

	};

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Filters {
		Filter[] value();
	};

	@Filter("abc")
	@Filter("xyz")
	public interface Filterable{
		
	}
	
	public static void main(String[] args) {
		Filter[] arr = Filterable.class.getAnnotationsByType(Filter.class);
		for (Filter filter : arr) {
			System.out.println(filter.value());
		}
		
		Filters filters = Filterable.class.getAnnotation(Filters.class);
		for (Filter filter : filters.value()) {
			System.out.println(filter.value());
		}
		
	}
}
