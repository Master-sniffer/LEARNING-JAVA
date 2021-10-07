package project.ralfproj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.json.JSONObject;

import java.util.List;


@RestController
public class SocksS_Controller {

    @Autowired
    private ServiceSocks ServiceSocks;

    @Autowired
    private SocksRepo socksRepo;


    @RequestMapping("/api/socks")
    public Iterable main (SocksS socksS){
        Iterable<SocksS> socks = socksRepo.findAll();
        return (socks);
    }


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
                try {
                    for (int i = 0; i<iter; i++){
                        SocksS Sock = new SocksS(color, cottonPart);
                        socksRepo.save(Sock);
                    }
                    System.out.println("HTTP 200");
                } catch (Exception e){
                    System.out.println("HTTP 500");
                }



            } catch (Exception e){
                System.out.println("HTTP 400 ");
                System.out.println(e);
            }

        }


    @RequestMapping(method = RequestMethod.POST, value="/api/socks/outcome")
    public void DeleteSocks (@RequestBody String payload) throws Exception {

        String color;
        String cottonPart;
        Integer iter;

        try {
            JSONObject jsonObj = new JSONObject(payload);
            color= (String) jsonObj.get("color");
            iter = (Integer) jsonObj.get("quantity");
            cottonPart = (String) jsonObj.get("cottonPart");
            try {
                List<SocksS> sock = socksRepo.findBycottonAndcolor(cottonPart, color); //color, cottonPart
                for (int i = 0; i<iter; i++){
                    SocksS socker = sock.get(i);
                    socksRepo.deleteById(socker.getId());
                    //socksRepo.deleteById(sock.);
                }
                System.out.println("HTTP 200");
            } catch (Exception e){
                System.out.println("HTTP 500");
            }



        } catch (Exception e){
            System.out.println("HTTP 400");
            System.out.println(e);
        }

    }
//
//    @RequestMapping("/socks/{id}")
//    public SocksS getSocks(@PathVariable Integer id){
//        return ServiceSocks.getSock(id);
//    }
//


}
