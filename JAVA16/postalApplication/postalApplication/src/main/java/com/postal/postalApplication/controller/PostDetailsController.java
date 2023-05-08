package com.postal.postalApplication.controller;


import com.postal.postalApplication.output.PostOfficeResponseBean;
import com.postal.postalApplication.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postal")
public class PostDetailsController {

    @Autowired
    PostService postService;

    @RequestMapping(value = "/byCity",method = RequestMethod.GET,consumes = MediaType.ALL_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public PostOfficeResponseBean getPostalByCity(@RequestParam String city){
        PostOfficeResponseBean responseBean = postService.fetchPostOfficeDetailsbyCity(city);
        return responseBean;
    }
}
