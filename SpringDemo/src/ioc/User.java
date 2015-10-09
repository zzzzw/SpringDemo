package ioc;
import java.util.ArrayList;
import java.util.List;


//控制反转，交给spring去new
//（IoC）:把权限交给了spring,松耦合
public class User {
	
	private Integer id;
	
	private List<String> ls=new ArrayList();
	
	public User(){
		id=5;
		ls.add("hello");
		ls.add("world!");
	}
	
	public String get(){
		return ls.get(0);
	}

}
