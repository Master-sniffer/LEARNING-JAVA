package project.ralfproj;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ServiceSocks {

    private List<SocksS> sock= new ArrayList<>(
            Arrays.asList(
                    new SocksS("task_1","summary_1"),
                    new SocksS("task_2","summary_2"),
                    new SocksS("task_3","summary_3")
            )
    );

    public List<SocksS> getAllSocks(){
        return sock;
    }

    public SocksS getSock(Integer id){
        return sock.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void CreateSocks(SocksS socks){
        sock.add(socks);
    }

}
