package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {
	
	private List<User> list = new ArrayList<>();
	
	private List<User> init(){
		User user = new User("thangnd");
		User user1 = new User("thangnd1");
		User user2 = new User("thangnd2");
		User user3 = new User("thangnd3");
		User user4 = new User("thangnd4");
		User user5 = new User("thangnd5");
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		list.add(user);
		return list;
	}
	
	public User findUserById(String username) {
		init();
		List<User> listSub = list.stream().filter(user -> username.equals(user.getUsername())).collect(Collectors.toList());
		return listSub.get(0);
	}

}
