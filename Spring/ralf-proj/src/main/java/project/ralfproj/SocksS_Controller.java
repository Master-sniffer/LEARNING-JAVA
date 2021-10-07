package project.ralfproj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
public class SocksS_Controller {

    @Autowired
    private ServiceSocks ServiceSocks;

    @Autowired
    private SocksRepo socksRepo;


    @RequestMapping("/api/socks")
    public Iterable main (SocksS socksS){
        Iterable<SocksS> socks = socksRepo.findAll();
//        SocksS Sock = new SocksS(1,"da","pizda");
//        socksRepo.save(Sock);
        return (socks);
    }

//    @RequestMapping(method = RequestMethod.POST, value="/api/socks/income")
//    public void CreateSocks (@RequestBody SocksS socksS){
//         ServiceSocks.CreateSocks(socksS);
//    }

        @RequestMapping(method = RequestMethod.POST, value="/api/socks/income")
    public void CreateSocks (@RequestBody String payload) throws Exception {

            String color;
            String cottonPart;
            Integer iter;

            try {
                JSONObject jsonObj = new JSONObject(payload);
                color= (String) jsonObj.get("color");
                iter = (Integer) jsonObj.get("quantity");
                cottonPart = (String) jsonObj.get("cottonPart");
                for (int i = 0; i<iter; i++){
                    SocksS Sock = new SocksS(color, cottonPart);
                    socksRepo.save(Sock);
                }

            } catch (Exception e){
                System.out.println("something went wrong...");
                System.out.println(e);
            } finally {
                System.out.println("Completed the process");
            }

        }

//    @RequestMapping("/socks")
//    public List<SocksS> getAllSocksS(){
//        return socksRepo.getAllSocks();
//    }
//
//    @RequestMapping("/socks/{id}")
//    public SocksS getSocks(@PathVariable Integer id){
//        return ServiceSocks.getSock(id);
//    }
//


}
