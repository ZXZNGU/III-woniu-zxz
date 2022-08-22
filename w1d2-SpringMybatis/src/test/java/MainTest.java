import com.github.pagehelper.PageInfo;
import com.woniu.controller.UserController;
import com.woniu.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = applicationContext.getBean(UserController.class);

        PageInfo<User> pageInfo = userController.findUserList();
        List<User> userList = pageInfo.getList();
        for (User user : userList) {
            System.out.println(user);
        }
//        System.out.println(userList);


//        User user = new User();
//        user.setUserCode("9527");
//        user.setUserName("张三");
//        user.setBirthday(LocalDateTime.now());
//        user.setRoleid(1);
//        userController.addUser(user);

//        User user = new User();
//        user.setId(39L);
//        user.setUserCode("952711");
//        user.setUserName("李四");
//
//        String str = "2000-10-01 10:10:10";
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime time = LocalDateTime.parse(str, fmt);
//        user.setBirthday(time);
//        user.setRoleid(3);
//
//        userController.udpateUser(user);
    }
}
