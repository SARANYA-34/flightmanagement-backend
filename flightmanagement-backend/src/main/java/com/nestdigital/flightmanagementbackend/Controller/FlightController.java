package com.nestdigital.flightmanagementbackend.Controller;

import com.nestdigital.flightmanagementbackend.Model.FlightModel;
import com.nestdigital.flightmanagementbackend.dao.FlghtDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlghtDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddFlight(@RequestBody FlightModel flight){
        System.out.println(flight.toString());
        dao.save(flight);
        return "{Status:'Success'}";
    }

  @CrossOrigin(origins = "*")
  @GetMapping("/viewflight")
  public List<FlightModel> Viewflight(){
        return (List<FlightModel>) dao.findAll();
  }


    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deleteflight",consumes = "application/json",produces ="application/json")
    public String DeleteFlight(@RequestBody FlightModel flight)
    {
        dao.deleteFlightById(flight.getId());
        return "{status:'success'}";
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchFlight",consumes = "application/json",produces ="application/json")
    public List<FlightModel> SearchFlight(@RequestBody FlightModel flight)
    {
        return (List<FlightModel>) dao.SearchFlight(flight.getName());
    }


}
