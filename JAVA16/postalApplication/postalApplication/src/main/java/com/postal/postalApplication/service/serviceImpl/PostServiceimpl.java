package com.postal.postalApplication.service.serviceImpl;

import com.postal.postalApplication.output.PostOfficeDetailsBean;
import com.postal.postalApplication.output.PostOfficeResponseBean;
import com.postal.postalApplication.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("postService")
public class PostServiceimpl implements PostService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public PostOfficeResponseBean fetchPostOfficeDetailsbyCity(String cityValue) {
        String url = "https://api.postalpincode.in/postoffice/{city}";
        url = url.replace("{city}",cityValue);
        System.out.println("url: "+url);
        ResponseEntity<PostOfficeResponseBean[]> postalResponseEntity = restTemplate.getForEntity(url,PostOfficeResponseBean[].class);

        System.out.println("response status code is"+postalResponseEntity.getStatusCode());

        PostOfficeResponseBean[] responseBeanArray = postalResponseEntity.getBody();

        for(PostOfficeResponseBean responseBean : responseBeanArray){
            List<PostOfficeDetailsBean> postOfficeDetailsBeans = responseBean.getPostOffices();
            for (PostOfficeDetailsBean pob:postOfficeDetailsBeans){
                System.out.println(pob.getName()+"****"+pob.getCountry()+"****"+pob.getPincode());
            }
        }
        return responseBeanArray[0];
    }
}
