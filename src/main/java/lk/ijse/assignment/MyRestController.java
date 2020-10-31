package lk.ijse.assignment;

import data.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyRestController {
    @GetMapping("/api/hello")
    public Message getMsg(){
        Message msg=new Message();
        msg.setMessage("How Are You ?");
        msg.setSender("Michel");
        msg.setSendDate("2020-10-15");

        return msg;
    }

}
