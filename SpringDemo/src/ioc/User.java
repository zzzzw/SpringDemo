package ioc;
import java.util.ArrayList;
import java.util.List;


//���Ʒ�ת������springȥnew
//��IoC��:��Ȩ�޽�����spring,�����
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
