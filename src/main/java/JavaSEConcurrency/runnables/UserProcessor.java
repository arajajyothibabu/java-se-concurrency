package JavaSEConcurrency.runnables;

import JavaSEConcurrency.beans.User;
import JavaSEConcurrency.dao.UserDAO;

import java.util.StringTokenizer;
import java.util.concurrent.Callable;

public class UserProcessor implements Callable<Integer> {

    private String userRecord;
    private UserDAO dao;

    public UserProcessor(String userRecord, UserDAO dao) {
        this.userRecord = userRecord;
        this.dao = dao;
    }


    @Override
    public Integer call() throws Exception {
        int rows = 0;
        System.out.println(Thread.currentThread().getName() + " processing user record: " + userRecord);
        StringTokenizer tokenizer = new StringTokenizer(userRecord, ",");
        while (tokenizer.hasMoreTokens()){
            User user = new User();
            user.setEmail(tokenizer.nextToken());
            user.setName(tokenizer.nextToken());
            user.setId(Integer.valueOf(tokenizer.nextToken()));
            rows = dao.saveUser(user);
        }
        return rows;
    }
}
